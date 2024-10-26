package com.ucr.mvc.models.VO;

public class Propietario {

	private int id, edad;
	private String nombre, telefono;

	public Propietario(int id, int edad, String nombre, String telefono) {
		this.id = id;
		this.edad = edad;
		this.nombre = nombre;
		this.telefono = telefono;
	}

	public Propietario(int edad, String nombre, String telefono) {
		this.id = 0;
		this.edad = edad;
		this.nombre = nombre;
		this.telefono = telefono;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	@Override
	public String toString() {
		return nombre;
	}

}
