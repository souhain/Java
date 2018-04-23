package capitulo1;

public class concatenacion_y_subbuffer {
	
	public static void main(String[]args) {
		
		
		
		String s = new StringBuffer().append("Concatenando utilizando la clase StringBuffer\n")
									 .append("hola ")
									 .append("como estas?\n")
									 .toString();
		System.out.println(s);
		
		
		String x="concatenando con el signo de mas (+)\n";
		x=x+"hola ";
		x=x+"como estas?";
		
		System.out.println(x);
	}

}  
