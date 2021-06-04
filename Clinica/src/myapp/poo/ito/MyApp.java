package myapp.poo.ito;
import java.time.LocalDate;
import java.util.HashSet;

import clases.poo.ito.Consultas;
import clases.poo.ito.Paciente;

public class MyApp {

	static Paciente p;
	
	static void run() {
		HashSet<String> sintomas = new HashSet<String>();
		HashSet<String> diagnostico = new HashSet<String>();
		HashSet<String> receta = new HashSet<String>();
		sintomas.add("38ºC");
		sintomas.add("65kg");
		sintomas.add("169cm");
		diagnostico.add("tos");
		diagnostico.add("fiebre");
		receta.add("opamisina");
		receta.add("paracetamol");
		HashSet<Consultas> consultas = new HashSet<Consultas>();
		consultas.add(new Consultas(LocalDate.of(2020, 12, 25),sintomas,diagnostico,receta));
		p=new Paciente("Mario Pérez","EAFV2IA23",LocalDate.of(1987, 11, 15),consultas);
		System.out.println(p);
		agregaConsulta();
		System.out.println(p);
		System.out.println("La edad del paciente es de: "+p.calculaEdad()+" años");
	}
	
	public static void agregaConsulta() {
		HashSet<String> sintomas = new HashSet<String>();
		HashSet<String> diagnostico = new HashSet<String>();
		HashSet<String> receta = new HashSet<String>();
		sintomas.add("37ºC");
		sintomas.add("67kg");
		sintomas.add("169cm");
		diagnostico.add("vomito");
		diagnostico.add("diarrea");
		receta.add("onmeprasol");
		p.agregaConsulta(new Consultas(LocalDate.of(2021, 05, 25),sintomas,diagnostico,receta));
	}
	public static void main(String [] Args) {
		run();
	}
	
}
