package capitulo1;

import java.util.Scanner;

import javax.jws.soap.SOAPBinding;

public class valor_binary_octal_hex {
	
	public static void main(String[]args) {
		
		Scanner scanner = new Scanner (System.in);
		
		System.out.println("ingrese un valor entero: ");
		
		int v = scanner.nextInt();
		
		System.out.println("valor ingresado: ");
		System.out.println("binario= "+Integer.toBinaryString(v));
		System.out.println("octal= "+Integer.toOctalString(v));
		System.out.println("hexadecimal= "+Integer.toHexString(v));
		
		System.out.println("\n"+"ingrese una base numerica: ");
		
		int b = scanner.nextInt();
		
		String base= Integer.toString(v,b);
		System.out.println(v + " en base "+ b +" = " + base);
		
	}

}
