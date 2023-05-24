package com.eoi.ejemplospringboot.services;

import com.eoi.ejemplospringboot.abstractcomponents.GenericServiceWithJPA;
import com.eoi.ejemplospringboot.entities.Usuario;
import org.springframework.stereotype.Service;

@Service
public class UsuarioService extends GenericServiceWithJPA<Usuario, Integer> {


}

