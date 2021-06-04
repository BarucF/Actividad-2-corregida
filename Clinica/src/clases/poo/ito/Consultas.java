package clases.poo.ito;

import java.time.LocalDate;
import java.util.HashSet;

public class Consultas {

	
	private LocalDate fechaConsulta;
	private HashSet<String> sintomas = new HashSet<String>();
	private HashSet<String> diagnostico = new HashSet<String>();
	private HashSet<String> receta = new HashSet<String>();
	
	
	public Consultas(LocalDate fechaConsulta, HashSet<String> sintomas, HashSet<String> diagnostico,
			HashSet<String> receta) {
		super();
		this.fechaConsulta = fechaConsulta;
		this.sintomas = sintomas;
		this.diagnostico = diagnostico;
		this.receta = receta;
	}
	
	
	
	public LocalDate getFechaConsulta() {
		return fechaConsulta;
	}
	public void setFechaConsulta(LocalDate fechaConsulta) {
		this.fechaConsulta = fechaConsulta;
	}
	public HashSet<String> getSintomas() {
		return sintomas;
	}
	public HashSet<String> getDiagnostico() {
		return diagnostico;
	}
	public HashSet<String> getReceta() {
		return receta;
	}



	@Override
	public String toString() {
		return "fechaConsulta=" + fechaConsulta + ", sintomas=" + sintomas + ", diagnostico=" + diagnostico
				+ ", receta=" + receta;
	}
}
