package com.presenteapp.vera.controller;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.presenteapp.vera.model.Asistencia;
import com.presenteapp.vera.model.Usuario;
import com.presenteapp.vera.service.IAsistenciaService;
import com.presenteapp.vera.service.IUsuarioService;

@Controller
@RequestMapping("/alumno")
public class HomeController {
	
	private final Logger log=LoggerFactory.getLogger(HomeController.class);
	
	@Autowired
	private IAsistenciaService asistenciaService;
	
	@Autowired
	private IUsuarioService usuarioService;
	
	Asistencia asistencia = new Asistencia();
	
	
	@GetMapping("")
	public String home(Model model) {
		
		Usuario usuario = usuarioService.findById(1).get();
		
		model.addAttribute("asistencias", asistenciaService.findAll());
		model.addAttribute("usuario", usuario);
		return "alumno/home";
		
	}
	@GetMapping("/saveAsistencia")
	public String saveAsistencia(Asistencia asistencia) {
		Date fechaCreacion = new Date();
		asistencia.setFechauser(fechaCreacion);

		//usuario
		Usuario usuario = usuarioService.findById(1).get();
		Usuario u = new Usuario(1, "", "", "", "", "", "");
		asistencia.setComision(usuario.getComision());
		asistencia.setDni(usuario.getDni());
		asistencia.setNombre(usuario.getNombre());
		asistencia.setUsuario(u);
		
		//fecha a string
		String pattern = "dd/MM/yyyy HH:mm";
		DateFormat df = new SimpleDateFormat(pattern);
		String fechaCreacionAsString = df.format(fechaCreacion);
		
		asistencia.setFecha(fechaCreacionAsString);
		
		asistenciaService.save(asistencia);
		
		log.info("e? {}", asistencia);
		
		return "redirect:/alumno";
	
	
	}

}
