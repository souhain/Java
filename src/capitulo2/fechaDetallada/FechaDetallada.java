package capitulo2.fechaDetallada;
import capitulo2.fechas_herencia.Fecha;
public class FechaDetallada extends Fecha {
	
	
	private static String meses[]= {
			 "Enero"
			,"Febrero"
			,"Marzo"
			,"Abril"
			,"Mayo"
			,"junio"
			,"julio"
			,"Agosto"
			,"Septiembre"
			,"Octubre"
			,"Noviembre"
			,"Diciembre"};

	public String toString() {
		return getDia()+" de "+meses[getMes()-1]+" de "+getAnio();
	}
	
	public FechaDetallada(String f){
		super(f);
	}
	
	
	public FechaDetallada() {
		
	}
	}


