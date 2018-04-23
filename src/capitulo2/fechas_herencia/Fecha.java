package capitulo2.fechas_herencia;

public class Fecha {
	
	private int dia;
	private int mes;
	private int anio;
	
	
	
	public int fechaToDias(){
		return anio*360+mes*30+dia;		
	}
	private void diasToFecha(int i){
		anio= (int) i/360;
		
		int resto= i%360;
		
		mes=(int) resto/30;
		
		dia= resto % 30;
		
		if(dia==0)
		{
			dia=30;
			mes--;
			
		}
		if(mes==0)
		{
			mes=12;
			anio--;
		}
	}
	
	public void addDias(int d) {
		
		int sum= fechaToDias()+d;
		
		diasToFecha(sum);
		
	}

	public Fecha(String s) {
		int pos1=s.indexOf('/');
		int pos2=s.lastIndexOf('/');
		
		String sDia = s.substring(0,pos1);
		dia= Integer.parseInt(sDia);
		
		String sMes = s.substring(pos1+1,pos2);
		mes= Integer.parseInt(sMes);
		
		String sAnio= s.substring(pos2+1);
		anio= Integer.parseInt(sAnio);
	}
	
	// constructor con argumentos
	public Fecha(int d, int m, int a) {
		dia= d;
		mes= m;
		anio= a;
	}
	// constructor sin argumentos
	public Fecha(){
	}
	
	
	// equals
	public boolean equals(Object o){
		Fecha otra = (Fecha) o;
		return (dia==otra.dia)&&(mes==otra.mes)&&(anio==otra.anio);
		
	}
	
	// setters y getters
	public int getDia() {
		return dia;
	}
	public void setDia(int dia) {
		this.dia = dia;
	}
	public int getMes() {
		return mes;
	}
	public void setMes(int mes) {
		this.mes = mes;
	}
	public int getAnio() {
		return anio;
	}
	public void setAnio(int anio) {
		this.anio = anio;
	}

	
	// toString
	public String toString() {
			return dia+"/"+mes+"/"+anio;
		}

}
