package capitulo2.poliformismo;
import capitulo2.fechaDetallada.FechaDetallada;
import capitulo2.fechas_herencia.Fecha;
public class TestPoliformismo {
	
	public static void main(String[] args) {
		Fecha fec = new FechaDetallada("25/02/2009");
		
		Object obj= new FechaDetallada("25/09/2007");
		
		System.out.println("fec = "+fec);
		System.out.println("obj = "+ obj);
		
	}
	
	
	
}
