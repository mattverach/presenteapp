package com.presenteapp.vera.model;


import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "asistencias")
public class Asistencia {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String dni;
	private String nombre;
	private String comision;
	private String valor;
	private String fecha;
	private Date fechaUser;
	
	@ManyToOne
	private Usuario usuario;
	
	public Asistencia() {
	}

	
	
	



	public Asistencia(Integer id, String dni, String nombre, String comision, String valor, String fecha,
			Date fechaUser, Usuario usuario) {
		super();
		this.id = id;
		this.dni = dni;
		this.nombre = nombre;
		this.comision = comision;
		this.valor = valor;
		this.fecha = fecha;
		this.fechaUser = fechaUser;
		this.usuario = usuario;
	}







	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getComision() {
		return comision;
	}

	public void setComision(String comision) {
		this.comision = comision;
	}

	public String getValor() {
		return valor;
	}

	public void setValor(String valor) {
		this.valor = valor;
	}

	public String getFecha() {
		return fecha;
	}

	public void setFecha(String fecha) {
		this.fecha = fecha;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}
	
	

	public String getDni() {
		return dni;
	}



	public void setDni(String dni) {
		this.dni = dni;
	}



	public String getNombre() {
		return nombre;
	}



	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public Date getFechauser() {
		return fechaUser;
	}



	public void setFechauser(Date fechauser) {
		this.fechaUser = fechauser;
	}



	@Override
	public String toString() {
		return "Asistencia [id=" + id + ", dni=" + dni + ", nombre=" + nombre + ", comision=" + comision + ", valor="
				+ valor + ", fecha=" + fecha + ", fechaUser=" + fechaUser + ", usuario=" + usuario + "]";
	}



	



	



	

	
	
	
	
	

}
