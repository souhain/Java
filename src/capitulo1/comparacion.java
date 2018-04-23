package capitulo1;

import java.util.Scanner;

public class comparacion {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("introducir una cadena: ");
		String c1 = scanner.next();
		
		System.out.println("introducir otra cadena: ");
		String c2 = scanner.next();
		
		
		System.out.println("c1 = ["+c1+"]\n"
						 + "c2 = ["+c2+"]");
		if(c1==c2) {
			System.out.println("son iguales");
		}
		else
		{
			System.out.println("son diferentes");
		}
		
		
		
		
		// elemento equals para comparar cadenas 
		
		System.out.println("introducir una cadena: ");
		String s1 = scanner.next();
		
		System.out.println("introducir otra cadena: ");
		String s2 = scanner.next();
		
		
		System.out.println("s1 = ["+s1+"]\n"
						 + "s2 = ["+s2+"]");
		if(s1.equals(s2)) {
			System.out.println("son iguales");
		}
		else
		{
			System.out.println("son diferentes");
		}
		

		
		
	}
}
