package capitulo1;

public class caracter_y_acsii {
	public static void main(String[] args) {
		System.out.println("Cadena de caracteres (A) en un for");
		for (int i = 0; i < 5; i++) {
			System.out.println(i + "A");
		}

		System.out.println("\nvalor de A en codigo ascii en un for");
		for (int i = 0; i < 5; i++) {
			System.out.println(i + 'A');
		}
		
		System.out.println("\ncasteando el caracter (A)");
		int a='A';
		char b= (char)a;
		System.out.println(b);
		
		
		System.out.println("\nvalor de caracter casteado(A) en un for ");
		for (int i = 'A'; i <= 'Z'; i++) {
			char c = (char) i;
			System.out.println(c);
		}
		
		System.out.println("\nvalor de caracter ascii(A) en un for ");
		for (int i = 'A'; i <= 'Z'; i++) {
			
			System.out.println(i);
		}
		
		

	}
}
