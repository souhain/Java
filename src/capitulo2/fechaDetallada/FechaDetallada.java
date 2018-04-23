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
	
	public FechaDetallada(int dia, int mes, int anio) {
		super(dia,mes,anio);
	}
	
	public FechaDetallada() {
		super();
	}

	public String toString() {
		return getDia()+" de "+meses[getMes()-1]+" de "+getAnio();
	}
	
	public FechaDetallada(String f){
		super(f);
	}
	
	
}


