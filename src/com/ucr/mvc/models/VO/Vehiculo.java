package com.ucr.mvc.models.VO;

public class Vehiculo {

	private int idVehiculo, idPropietario;
	private String placa;
	private Propietario propietario;

	public Vehiculo(int idVehiculo, int idPropietario, String placa) {
		this.idVehiculo = idVehiculo;
		this.idPropietario = idPropietario;
		this.placa = placa;
	}

	public Vehiculo(int idPropietario, String placa) {
		this.idVehiculo = 0;
		this.idPropietario = idPropietario;
		this.placa = placa;
	}

	public Vehiculo(int idVehiculo, int idPropietario, String placa, Propietario propietario) {
		this.idVehiculo = idVehiculo;
		this.idPropietario = idPropietario;
		this.placa = placa;
		this.propietario = propietario;
	}

	public Propietario getPropietario() {
		return propietario;
	}

	public void setPropietario(Propietario propietario) {
		this.propietario = propietario;
	}

	public int getIdVehiculo() {
		return idVehiculo;
	}

	public void setIdVehiculo(int idVehiculo) {
		this.idVehiculo = idVehiculo;
	}

	public int getIdPropietario() {
		return idPropietario;
	}

	public void setIdPropietario(int idPropietario) {
		this.idPropietario = idPropietario;
	}

	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}

	@Override
	public String toString() {
		return "Vehiculo [idVehiculo=" + idVehiculo + ", idPropietario=" + idPropietario + ", placa=" + placa + "Propietario:" + propietario;
	}

}
