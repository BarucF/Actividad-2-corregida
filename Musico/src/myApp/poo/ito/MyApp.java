package myApp.poo.ito;

import java.time.LocalDate;
import clases.poo.ito.Composiciones;
import java.util.HashSet;

public class MyApp {

	public static void run() {
		HashSet<String> interpretesSolicitados = new HashSet<String>();
		interpretesSolicitados.add("Franco de Vita");
		interpretesSolicitados.add("Mario Castañera");
		Composiciones c = new Composiciones("Tu de que vas", "3:45",interpretesSolicitados, "Pop", LocalDate.of(2003, 2, 18),LocalDate.of(2004, 3, 23));
		System.out.println(c);
		c.AgregarInterprete("Alexander Acha");
		System.out.println(c);
		c.AgregarInterprete("Aleandro Sanz");
		System.out.println(c);
	}

	public static void main(String[] args) {

		run();
	}

}
