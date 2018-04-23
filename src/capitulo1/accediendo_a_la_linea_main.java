package capitulo1;

public class accediendo_a_la_linea_main {

	public static void main(String[] args) {
		for (int i = 0; i < args.length; i++) {
			System.out.println(args[i]);
		}
		System.out.println("total: " + args.length + " argumentos");
	}

}

