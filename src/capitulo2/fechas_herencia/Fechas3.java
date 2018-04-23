package capitulo2.fechas_herencia;

import java.util.Scanner;

public class Fechas3 {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Ingrese fecha(dd/mm/aaaa): ");
		
	String sFecha = scanner.next();
	
	Fecha f =  new Fecha(sFecha);
	
	System.out.println("La fecha ingresada es: " +f +"\n");
	
	System.out.println("Ingrese dias a sumar o restar: ");
	
	int diasSum = scanner.nextInt();
	
    f.addDias(diasSum);
	
	System.out.println("sumando "+ diasSum+" dias, queda: "+f);
	}
	
}
