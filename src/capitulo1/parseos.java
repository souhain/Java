package capitulo1;

public class parseos {
	
	public static void main (String[]args) {
		int i = 45;
		
		String i_parse_string = Integer.toString(i);
		
		int i_parse_int = Integer.parseInt(i_parse_string);
		
		
		
		double d = 4.90;
		
		String dDouble= Double.toString(d);
		
		double d2 = Double.parseDouble(dDouble);
		
		
		System.out.println("int de i: "+i+
						   "\nString de i: "+i_parse_string+
						   "\nDe string de i regresando a entero: "+ i_parse_int+"\n\n");
		
		System.out.println("doble de d: "+d+
				   "\nString de d: "+dDouble+
				   "\nDe string de d regresando a entero: "+ d2);
		
		
		
	}

}
