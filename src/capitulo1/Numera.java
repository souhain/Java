package capitulo1;

public enum Numera {
	DATO_UNO,
	DATO_DOS,
	REGISTRO_UNO;
	
	public String value() {
		switch(this) {
		case DATO_UNO: return "dato_uno";
		case DATO_DOS: return "dato_dos";
		case REGISTRO_UNO: return "registro_uno";
		}
		return "Error";
	}
}
