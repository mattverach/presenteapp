package com.presenteapp.vera.service;

import java.util.Optional;

import com.presenteapp.vera.model.Usuario;

public interface IUsuarioService {
	Optional<Usuario> findById(Integer id);

}
