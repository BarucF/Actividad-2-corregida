
package clases.poo.ito;
import java.util.HashSet;
import java.time.LocalDate;

public class Composiciones {

	private String titulo = "";
	private String duracion = "";
	private HashSet<String> interpretesSolicitados = new HashSet<String>();
	private String genero = "";
	private LocalDate fecharegistro = null;
	private LocalDate fechaEstreno = null;
	
	public Composiciones() {

		super();

	}

	public Composiciones(String titulo, String duracion, HashSet<String> interpretesSolicitados, String genero,
			LocalDate fecharegistro, LocalDate fechaEstreno) {
		super();
		this.titulo = titulo;
		this.duracion = duracion;
		this.interpretesSolicitados = interpretesSolicitados;
		this.genero = genero;
		this.fecharegistro = fecharegistro;
		this.fechaEstreno = fechaEstreno;
	}

	public void AgregarInterprete(String Intreprete) {
		this.interpretesSolicitados.add(Intreprete);
	}

	public String getTitulo() {
		return this.titulo;
	}


	public void setTitulo(String newTitulo) {
		this.titulo = newTitulo;
	}


	public String getDuracion() {
		return this.duracion;
	}

	public void setDuracion(String newDuracion) {
		this.duracion = newDuracion;
	}


	public HashSet<String> getInterpretesSolicitados() {
		return this.interpretesSolicitados;
	}


	public String getGenero() {
		return this.genero;
	}


	public void setGenero(String newGenero) {
		this.genero = newGenero;
	}


	public LocalDate getFecharegistro() {
		return this.fecharegistro;
	}


	public void setFecharegistro(LocalDate newFecharegistro) {
		this.fecharegistro = newFecharegistro;
	}


	public LocalDate getFechaEstreno() {
		return this.fechaEstreno;
	}


	public void setFechaEstreno(LocalDate newFechaEstreno) {
		this.fechaEstreno = newFechaEstreno;
	}
	@Override
	public String toString() {
		return "Composiciones [Titulo=" + titulo + ", Duracion=" + duracion + ", InterpretesSolicitados="
				+ interpretesSolicitados + ", Genero=" + genero + ", Fecharegistro=" + fecharegistro + ", FechaEstreno="
				+ fechaEstreno + "]";
	}




}
