package clases.poo.ito;

import java.time.LocalDate;
import java.util.HashSet;

public class Paciente {

	
	private String nombre;
	private String rfc;
	private LocalDate fechaNacimiento;
	private HashSet<Consultas> consultas = new HashSet<Consultas>();
	
	public Paciente(String nombre, String rfc, LocalDate fechaNacimiento, HashSet<Consultas> consultas) {
		super();
		this.nombre = nombre;
		this.rfc = rfc;
		this.fechaNacimiento = fechaNacimiento;
		this.consultas = consultas;
		
	}
	public void agregaConsulta(Consultas consultaN) {
		this.consultas.add(consultaN);
	}
	
	public int calculaEdad() {
		return (LocalDate.now().getYear()-this.fechaNacimiento.getYear());
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
		
	}
	public String getRfc() {
		return rfc;
	}
	public void setRfc(String rfc) {
		this.rfc = rfc;
	}
	public LocalDate getFechaNacimiento() {
		return fechaNacimiento;
	}
	public void setFechaNacimiento(LocalDate fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	@Override
	public String toString() {
		return "Paciente [nombre=" + nombre + ", rfc=" + rfc + ", fechaNacimiento=" + fechaNacimiento + ", consultas="
				+ consultas + "]";
	}
	
	
}
