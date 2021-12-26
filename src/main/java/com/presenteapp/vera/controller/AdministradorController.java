package com.presenteapp.vera.controller;



import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.presenteapp.vera.model.Asistencia;
import com.presenteapp.vera.model.Usuario;
import com.presenteapp.vera.service.IAsistenciaService;

@Controller
@RequestMapping("/administrador")
public class AdministradorController {
	
	private final Logger LOGGER = LoggerFactory.getLogger(AdministradorController.class);
	
	@Autowired
	private IAsistenciaService asistenciaService;
	
	@GetMapping("")
	public String show(Model model) {
		model.addAttribute("asistencias", asistenciaService.findAll());
		return "administrador/home";
	}
	
	@GetMapping("/create")
	public String create() {
		return "administrador/create";
	}
	
	@PostMapping("/save")
	public String save(Asistencia asistencia) {
		LOGGER.info("Objeto recibido desde el form: {}", asistencia);
		
		Usuario u = new Usuario(1, "", "", "", "", "", "");
		asistencia.setUsuario(u);
		
		asistenciaService.save(asistencia);
		return "redirect:/administrador";
	}
	
	@GetMapping("/edit/{id}")
	public String edit(@PathVariable Integer id, Model model) {
		Asistencia asistencia = new Asistencia();
		Optional<Asistencia> optionalAsistencia = asistenciaService.get(id);
		asistencia = optionalAsistencia.get();
		LOGGER.info("asistencia buscada: {}", asistencia);
		model.addAttribute("asistencia", asistencia);
		return "administrador/edit";
	}

	@PostMapping("/update")
	public String update(Asistencia asistencia) {
		asistenciaService.update(asistencia);
		return "redirect:/administrador";
	}
	
	@GetMapping("/delete/{id}")
	public String delete(@PathVariable Integer id) {
		asistenciaService.delete(id);
		return "redirect:/administrador";
	}
}
