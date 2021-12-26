package com.presenteapp.vera.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.presenteapp.vera.model.Asistencia;
import com.presenteapp.vera.repository.IAsistenciaRepository;
import com.presenteapp.vera.repository.IUsuarioRepository;

@Service
public class AsistenciaServiceImpl implements IAsistenciaService {
	
	@Autowired
	private IUsuarioRepository usuarioRepository;
	
	@Autowired
	private IAsistenciaRepository asistenciaRepository;

	@Override
	public Asistencia save(Asistencia asistencia) {
		return asistenciaRepository.save(asistencia);
	}

	@Override
	public Optional<Asistencia> get(Integer id) {
		return asistenciaRepository.findById(id);
	}

	@Override
	public void update(Asistencia asistencia) {
		asistenciaRepository.save(asistencia);
	}

	@Override
	public void delete(Integer id) {
		asistenciaRepository.deleteById(id);
	}

	@Override
	public List<Asistencia> findAll() {
		return asistenciaRepository.findAll();
	}

}
