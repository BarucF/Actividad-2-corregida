package myApp.poo.ito;
import java.time.LocalDate;
import java.util.HashSet;

import Clases.poo.ito.vehiculo;
import Clases.poo.ito.ViajesRealizados;
public class MyApp {

	public static void run() {
		HashSet<ViajesRealizados> viajes = new HashSet<ViajesRealizados>();
		viajes.add(new ViajesRealizados("Córdoba","Calle tampico",LocalDate.of(2014, 05, 12),LocalDate.of(2014, 06, 12)
				,"madera",1500F));
		vehiculo v=new vehiculo("Ford",1908,500F,LocalDate.of(2012, 02, 12),viajes);
		System.out.println(v);
		v.contratacion(new ViajesRealizados("Orizaba","Norte 8",LocalDate.of(2012, 02, 12),LocalDate.of(2012, 03, 10)
				,"Carbon",1200F));
		System.out.println(v);
		v.cancelacion(new ViajesRealizados("Córdoba","Calle tampico",LocalDate.of(2014, 05, 12),LocalDate.of(2014, 06, 12)
				,"madera",1500F));
		System.out.println(v);
	}
	public static void main(String[] args) {
		run();
	}

}
