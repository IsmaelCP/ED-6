package practica6;

public class Coche {
	String matricula;
	String combustible;
	String modelo;
	String fabricante;


	public Coche() {
		matricula = "";
		combustible = "";
		modelo = "";
		fabricante = "";
	}

	public Coche(String m, String c, String mo, String f) {
		matricula = m;
		combustible = c;
		modelo = mo;
		fabricante = f;
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public String getCombustible() {
		return combustible;
	}

	public void setCombustible(String combustible) {
		this.combustible = combustible;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getFabricante() {
		return fabricante;
	}

	public void setFabricante(String fabricante) {
		this.fabricante = fabricante;
	}


	static final double precioLitroGasolina = 1.337;
	static final double precioLitroDiesel = 1.052;

	private String infoGasolina(String modelo2, String fabricante2) {
		modelo2 = "Corsa";
		fabricante2 = "Opel";
		String resultado = "";

		resultado = "es un " + fabricante2 + modelo2 + " y gasta " + precioLitroGasolina + " euros por litro"; 

		return resultado;
	}

	private String infoDiesel(String modelo2, String fabricante2) {
		modelo2 = "Ibiza";
		fabricante2 = "Seat";
		String resultado = "";

		resultado = "es un " + fabricante2 + modelo2 + " y gasta " + precioLitroDiesel + " euros por litro"; 

		return resultado;
	}

	private String infoHibrido(String modelo2, String fabricante2) {
		modelo2 = "Getz";
		fabricante2 = "Hyundai";
		String resultado = "";

		resultado = "es un " + fabricante2 + modelo2 + " y no necesita combustible"; 

		return resultado;
	}
	
	public String infoCoche() {
		String resultado = "";
		String texto = "El coche con matricula ";
		if (combustible == "Gasolina") {
			resultado += texto + matricula + " ";
			resultado += infoGasolina(modelo, fabricante);
		} else if (combustible == "Diesel") {
			resultado += texto + matricula + " ";
			resultado += infoDiesel(modelo, fabricante);
		} else if (combustible == "Híbrido") {
			resultado += texto + matricula + " ";
			resultado += infoHibrido(modelo, fabricante);
		} else {
			resultado += texto + matricula + " ";
			resultado += "no dispone de información";
		}
		return resultado;
	}

}
