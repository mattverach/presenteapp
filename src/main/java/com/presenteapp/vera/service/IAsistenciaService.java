package com.presenteapp.vera.service;

import java.util.List;
import java.util.Optional;

import com.presenteapp.vera.model.Asistencia;

public interface IAsistenciaService {
	public Asistencia save(Asistencia asistencia);
	public Optional<Asistencia> get(Integer id) ;
	public void update(Asistencia asistencia);
	public void delete(Integer id);
	public List<Asistencia> findAll();
}

