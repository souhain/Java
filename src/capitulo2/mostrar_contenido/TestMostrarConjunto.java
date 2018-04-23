package capitulo2.mostrar_contenido;
import capitulo2.fechas_herencia.Fecha;
public class TestMostrarConjunto
{
	
	public static void main(String[] args)
	{
		
		Object[] arr = {new Fecha(2,10,1970),
						new Fecha("23/12/1948"),
						new String("Esto es una cadena"),
						new Integer(34)};			
			MostrarConjunto.mostrar(arr);
	
    }

}