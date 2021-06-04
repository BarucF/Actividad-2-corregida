package Clases.poo.ito;

import java.time.LocalDate;
import java.util.HashSet;

public class vehiculo {
	
	private String marca = "";
	private int modelo = 0;
	private float cargaMax = 0F;
	private java.time.LocalDate fechaAdquisicion = null;
	private HashSet<ViajesRealizados> viajes = new HashSet<ViajesRealizados>();

	public vehiculo() {
		super();
	}
	
	public vehiculo(String marca, int modelo, float cargaMax, LocalDate fechaAdquisicion
			,HashSet<ViajesRealizados> viajes) {
		super();
		this.marca = marca;
		this.modelo = modelo;
		this.cargaMax = cargaMax;
		this.fechaAdquisicion = fechaAdquisicion;
		this.viajes=viajes;
	}

	public void contratacion(ViajesRealizados viaje) {
		this.viajes.add(viaje);
	}
	
	public void cancelacion(ViajesRealizados viaje) {
		this.viajes.remove(viaje);
		viajes.remove(new ViajesRealizados("Orizaba","Norte 8",LocalDate.of(2012, 02, 12),LocalDate.of(2012, 03, 10)
				,"Carbon",1200F));
	}
	
	
	public String getMarca() {
		return this.marca;
	}

	public void setMarca(String newMarca) {
		this.marca = newMarca;
	}

	public int getModelo() {
		return this.modelo;
	}

	public void setModelo(int newModelo) {
		this.modelo = newModelo;
	}

	public float getCargaMax() {
		return this.cargaMax;
	}

	public void setCargaMax(float newCargaMax) {
		this.cargaMax = newCargaMax;
	}

	public LocalDate getFechaAdquisicion() {
		return this.fechaAdquisicion;
	}

	public void setFechaAdquisicion(LocalDate newFechaAdquisicion) {
		this.fechaAdquisicion = newFechaAdquisicion;
	}


	@Override
	public String toString() {
		return "vehiculo [Marca=" + marca + ", Modelo=" + modelo + ", CargaMax=" + cargaMax + "Kg, FechaAdquisicion="
				+ fechaAdquisicion + ", ViajesRealizados=" + viajes + "]";
	}

}
