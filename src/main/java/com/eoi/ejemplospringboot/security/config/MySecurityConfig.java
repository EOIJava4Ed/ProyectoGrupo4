package com.eoi.ejemplospringboot.security.config;

import com.eoi.ejemplospringboot.security.service.MyUserDetailsService;
import lombok.Getter;
import lombok.Setter;
import lombok.extern.log4j.Log4j2;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;

/**
 * Clase de configuración de seguridad personalizada para la aplicación.
 */
@Configuration
@EnableWebSecurity
@Getter
@Setter
@Log4j2
public class MySecurityConfig {

    /**
     * Crea un bean personalizado de SecurityFilterChain para configurar el comportamiento de Spring Security.
     *
     * @param http la instancia de HttpSecurity para configurar la cadena de filtros de autorización.
     * @return el objeto SecurityFilterChain configurado.
     * @throws Exception si ocurre algún error durante la configuración.
     * @Author Alejandro Teixeira Muñoz
     */
    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {

        log.info("aplicando Security Filter Chain");
        // Configuramos el método HttpSecurity para indicar la cadena de filtros de autorización que vamos a seguir.
        http.authorizeHttpRequests((requests) -> requests
                .requestMatchers("/", "").permitAll() // Permitimos el acceso a la raíz del sitio y la página de inicio
                .requestMatchers("/webjars/**").permitAll() // Permitimos el acceso a los recursos estáticos de webjars
                .requestMatchers("/error/**").permitAll()
                // Permitimos el acceso al h2-console
                .anyRequest().authenticated() // Requerimos autenticación para cualquier otra solicitud
        );



        // Configuramos la página personalizada de inicio de sesión.
        // También la url donde se hará el Post recibido de manera automática por Springboot
        // Después, indicamos cuál es la url por defecto al hacer login
        // Además, permitimos el acceso a todo el mundo.
        http.formLogin((form) -> form.loginPage("/login")
                .loginProcessingUrl("/login")
                .defaultSuccessUrl("/")
                .permitAll());

        // Configuramos el sistema de cierre de sesión de la aplicación como el cierre de sesión predeterminado de Spring Security.
        http.logout((logout) -> logout.permitAll());

        // Devolvemos el objeto HttpSecurity configurado para que Spring Boot y Spring Security realicen su magia.
        return http.build();

    }


    @Bean
    @Profile("local")
    public SecurityFilterChain securityFilterChainLocal(HttpSecurity http) throws Exception {

            log.info("ENTRANDO AQUI");
            //Desactivamos temporalmente el csrf para poder acceder a h2-console
            http.csrf().disable();
            http.headers().frameOptions().disable();
            http.authorizeHttpRequests((requests) -> requests
                    .requestMatchers("/h2-console/**").permitAll()
            );


        return http.build() ;

    }


    /**
     * Crea un bean de codificador de contraseñas BCryptPasswordEncoder.
     *
     * @return el objeto BCryptPasswordEncoder para codificar las contraseñas.
     */
    @Bean
    public static BCryptPasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }


    @Bean
    MyUserDetailsService myUserDetailsService() {
        return new MyUserDetailsService();
    }

}
