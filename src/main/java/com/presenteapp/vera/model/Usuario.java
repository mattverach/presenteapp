package com.presenteapp.vera.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="usuarios")
public class Usuario {
	@Id
	private Integer id;
	private String dni;
	private String nombre;
	private String comision;
	private String email;
	private String tipo;
	private String password;
	
	
	@OneToMany(mappedBy = "usuario")
	private List<Asistencia> asistencias;
	
	public Usuario() {
	}
	
	
	public Usuario(Integer id, String dni, String nombre, String comision, String email, String tipo, String password) {
		super();
		this.id = id;
		this.dni = dni;
		this.nombre = nombre;
		this.comision = comision;
		this.email = email;
		this.tipo = tipo;
		this.password = password;
	}





	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getComision() {
		return comision;
	}
	public void setComision(String comision) {
		this.comision = comision;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	

	public List<Asistencia> getAsistencias() {
		return asistencias;
	}

	public void setAsistencias(List<Asistencia> asistencias) {
		this.asistencias = asistencias;
	}


	@Override
	public String toString() {
		return "Usuario [id=" + id + ", dni=" + dni + ", nombre=" + nombre + ", comision=" + comision + ", email="
				+ email + ", tipo=" + tipo + ", password=" + password + ", asistencias=" + asistencias + "]";
	}

	

	
	
	
	

}
