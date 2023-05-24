package com.eoi.ejemplospringboot.security.service;

import com.eoi.ejemplospringboot.entities.Permiso;
import com.eoi.ejemplospringboot.entities.Rol;
import com.eoi.ejemplospringboot.entities.Usuario;
import com.eoi.ejemplospringboot.repositories.UsuarioRepository;
import com.eoi.ejemplospringboot.security.details.MyUserDetails;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Optional;

/**
 * Implementación de UserDetailsService personalizada para cargar los detalles de usuario desde una fuente de datos.
 * Esta clase se utiliza en la autenticación de Spring Security para obtener los detalles de un usuario autenticado.
 */
public class MyUserDetailsService implements UserDetailsService {

    @Autowired
    UsuarioRepository usuarioRepository;

    /**
     * Localiza al usuario en base al nombre de usuario. En la implementación actual, la búsqueda
     * puede ser sensible o insensible a mayúsculas y minúsculas dependiendo de cómo esté configurada
     * la instancia de implementación. En este caso, el objeto <code>UserDetails</code> que se devuelve
     * puede tener un nombre de usuario con un caso diferente al solicitado.
     *
     * @param username el nombre de usuario que identifica al usuario cuyos datos se requieren.
     * @return un registro de usuario completamente poblado (nunca <code>null</code>).
     * @throws UsernameNotFoundException si no se pudo encontrar al usuario o el usuario no tiene
     *                                   GrantedAuthority.
     * @see <a href="https://www.baeldung.com/role-and-privilege-for-spring-security-registration">Tutorial de Baeldung sobre Roles y Privilegios en Spring Security</a>
     * @Author Alejandro Teixeira Muñoz
     */
    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {

        MyUserDetails userDetails = new MyUserDetails(); //Mas tarde será el principal.

        Optional<Usuario> usuarioObtenidoDeLaBD = usuarioRepository.findByUsername(username);

        if (usuarioObtenidoDeLaBD.isPresent()) {
            userDetails.setUsername(usuarioObtenidoDeLaBD.get().getUsername());
            userDetails.setPassword(usuarioObtenidoDeLaBD.get().getPassword());
            userDetails.setApellido(usuarioObtenidoDeLaBD.get().getApellido());
            userDetails.setNombre(usuarioObtenidoDeLaBD.get().getNombre());
            userDetails.setEmail(usuarioObtenidoDeLaBD.get().getEmail());
            userDetails.setImageUrl(usuarioObtenidoDeLaBD.get().getImageUrl());
            userDetails.setGrantedAuthorities(getAuthorities(usuarioObtenidoDeLaBD.get().getRoles()));
            return userDetails;

        }

        return null;
    }


    /**
     * Obtiene las autoridades concedidas al usuario basadas en los roles.
     *
     * @param roles los roles del usuario.
     * @return una colección de GrantedAuthority (permisos) otorgados al usuario.
     * @see <a href="https://www.baeldung.com/role-and-privilege-for-spring-security-registration">Tutorial de Baeldung sobre Roles y Privilegios en Spring Security</a>
     * @Author Alejandro Teixeira Muñoz
     */
    private Collection<? extends GrantedAuthority> getAuthorities(Collection<Rol> roles) {

        return getGrantedAuthorities(getPrivileges(roles));
    }


    /**
     * Obtiene los permisos basados en los roles del usuario.
     *
     * @param roles los roles del usuario.
     * @return una lista de permisos.
     * @see <a href="https://www.baeldung.com/role-and-privilege-for-spring-security-registration">Tutorial de Baeldung sobre Roles y Privilegios en Spring Security</a>
     * @Author Alejandro Teixeira Muñoz
     */
    private List<String> getPrivileges(Collection<Rol> roles) {

        List<String> privileges = new ArrayList<>();
        List<Permiso> collection = new ArrayList<>();
        for (Rol role : roles) {
            privileges.add(role.getName());
            collection.addAll(role.getPermisos());
        }
        for (Permiso item : collection) {
            privileges.add(item.getName());
        }
        return privileges;
    }


    /**
     * Convierte los permisos en una lista de GrantedAuthority.
     *
     * @param privileges los permisos del usuario.
     * @return una lista de GrantedAuthority (permisos).
     * @see <a href="https://www.baeldung.com/role-and-privilege-for-spring-security-registration">Tutorial de Baeldung sobre Roles y Privilegios en Spring Security</a>
     * @Author Alejandro Teixeira Muñoz
     */
    private List<GrantedAuthority> getGrantedAuthorities(List<String> privileges) {
        List<GrantedAuthority> authorities = new ArrayList<>();
        for (String privilege : privileges) {
            authorities.add(new SimpleGrantedAuthority(privilege));
        }
        return authorities;
    }

}

