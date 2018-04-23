package capitulo2.fechas_herencia;

public class Fechas {
	
	public static void main(String[] args) {
		Fecha f= new Fecha(1, 01, 2019); // parametros que resibe el constructor
			
		//f.setDia(3); 
		//f.setMes(3);
		//f.setAnio(3333);
		
		System.out.println(f.getDia()+"/"+f.getMes()+"/"+f.getAnio());	
		
		System.out.println(f);
	}

}
