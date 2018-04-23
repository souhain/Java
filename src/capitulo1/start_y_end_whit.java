package capitulo1;

public class start_y_end_whit {
	public static void  main(String[]args) {
		
		String s = "Esto es un buen libro de java";

		boolean b1 = s.startsWith("Esto es");
		boolean b2 = s.startsWith("java");
		boolean b3 = s.endsWith("java");
		boolean b4 = s.endsWith("un buenisimo");
		
		System.out.println(b1);
		System.out.println(b2);
		System.out.println(b3);
		System.out.println(b4);
	}
}


