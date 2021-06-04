package Clases.poo.ito;

import java.time.LocalDate;

public class ViajesRealizados {

	private String CiudadDestino = "";
	private String Direccion = "";
	private java.time.LocalDate FechaViaje = null;
	private java.time.LocalDate FechaRegreso = null;
	private String DescripcionCarga = "";
	private float MontoViaje = 0F;
	
	public ViajesRealizados() {
		super();
	}
	
	public ViajesRealizados(String ciudadDestino, String direccion, LocalDate fechaViaje, LocalDate fechaRegreso,
			String descripcionCarga, float montoViaje) {
		super();
		CiudadDestino = ciudadDestino;
		Direccion = direccion;
		FechaViaje = fechaViaje;
		FechaRegreso = fechaRegreso;
		DescripcionCarga = descripcionCarga;
		MontoViaje = montoViaje;
	}
	
	public String getCiudadDestino() {
		return this.CiudadDestino;
	}
	
	public void setCiudadDestino(String newCiudadDestino) {
		this.CiudadDestino = newCiudadDestino;
	}

	public String getDireccion() {
		return this.Direccion;
	}

	public void setDireccion(String newDireccion) {
		this.Direccion = newDireccion;
	}

	public LocalDate getFechaViaje() {
		return this.FechaViaje;
	}

	public void setFechaViaje(LocalDate newFechaViaje) {
		this.FechaViaje = newFechaViaje;
	}

	public LocalDate getFechaRegreso() {
		return this.FechaRegreso;
	}

	public void setFechaRegreso(LocalDate newFechaRegreso) {
		this.FechaRegreso = newFechaRegreso;
	}

	public String getDescripcionCarga() {
		return this.DescripcionCarga;
	}

	public void setDescripcionCarga(String newDescripcionCarga) {
		this.DescripcionCarga = newDescripcionCarga;
	}

	public float getMontoViaje() {
		return this.MontoViaje;
	}

	public void setMontoViaje(float newMontoViaje) {
		this.MontoViaje = newMontoViaje;
	}

	@Override
	public String toString() {
		return "ViajesRealizados [CiudadDestino=" + CiudadDestino + ", Direccion=" + Direccion + ", FechaViaje="
				+ FechaViaje + ", FechaRegreso=" + FechaRegreso + ", DescripcionCarga=" + DescripcionCarga
				+ ", MontoViaje=" + MontoViaje + "$]";
	}

}
