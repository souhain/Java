package capitulo2.fechas_herencia;

import java.util.Scanner;

public class Fechas2 {
	public static void main(String[] args) {
	
		Scanner scanner = new Scanner(System.in);
		System.out.println("ingresar primera fecha dia mes y año separada por espacios");
		int dia = scanner.nextInt();
		int mes = scanner.nextInt();
		int anio = scanner.nextInt();
		
		Fecha f1 = new Fecha(dia,mes,anio);
		
		System.out.println("ingresar segunda fecha dia mes y año separada por espacios");
		dia = scanner.nextInt();
		mes = scanner.nextInt();
		anio = scanner.nextInt();
		
		Fecha f2 = new Fecha(dia,mes,anio);
		
		System.out.println("fecha 1= "+ f1);
		System.out.println("fecha 2= "+ f2);
		
		if(f1.equals(f2)) {
			System.out.println("son iguales");
		}
		else
		{
			System.out.println("son diferentes");
		}
		
		
}

}
