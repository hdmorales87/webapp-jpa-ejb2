package org.hdmorales.apiservlet.webapp.headers.services;

import jakarta.ejb.Local;
import org.hdmorales.apiservlet.webapp.headers.models.entities.Usuario;

import java.util.Optional;

@Local
public interface UsuarioService {
    Optional<Usuario> login(String username, String password);
}
