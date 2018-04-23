package capitulo1;

public class metodo_length {
	public static void main(String[]args) {
		
		// el atributo length es invocado solo con su nombre para contar la longitud del arreglo 
		System.out.println("Longitud de un arreglo de chars {'H','O','L','A'} ");
		char c[] = {'H','O','L','A'};
		System.out.println(c.length +"\n");
		
		
		// el metodo length() cuenta letras de un string se invoca con parentecis 
		System.out.println("longitud de un String \"HOLA\"");
		String s = "HOLA";
		System.out.println(s.length());
		
		
	}


}
