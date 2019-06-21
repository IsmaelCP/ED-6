package practica6;

/**
 * clase Coche
 * @author Javier Escudero - GrupoStudium
 * @author Refactorización - Ismael Carracedo
 */
public class Coche {
	String matricula;
	String combustible;
	String modelo;
	String fabricante;

	/**
	 * Constructor por defecto de la clase Coche
	 */
	public Coche() {
		matricula = "";
		combustible = "";
		modelo = "";
		fabricante = "";
	}

	/**
	 * Constructor con parámetros de la clase Coche
	 * @param m matricula
	 * @param c combustible
	 * @param mo modelo
	 * @param f fabricante
	 */
	public Coche(String m, String c, String mo, String f) {
		matricula = m;
		combustible = c;
		modelo = mo;
		fabricante = f;
	}

	/**
	 * Devuelve función matricula
	 * @return String ""
	 */
	public String getMatricula() {
		return matricula;
	}

	/**
	 * Parámetro entrada matricula
	 * @param matricula
	 */
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	/**
	 * Devuelve función combustible
	 * @return String ""
	 */
	public String getCombustible() {
		return combustible;
	}

	/**
	 * Parámetro entrada combustible
	 * @param combustible
	 */
	public void setCombustible(String combustible) {
		this.combustible = combustible;
	}

	/**
	 * Devuelve función modelo
	 * @return String ""
	 */
	public String getModelo() {
		return modelo;
	}

	/**
	 * Parámetro entrada modelo
	 * @param modelo
	 */
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	/**
	 * Devuelve función fabricante
	 * @return String ""
	 */
	public String getFabricante() {
		return fabricante;
	}

	/**
	 * Parámetro entrada fabricante
	 * @param fabricante
	 */
	public void setFabricante(String fabricante) {
		this.fabricante = fabricante;
	}

	/**
	 * Constante precioLitroGasolina
	 * Constante precioLitroDiesel
	 */
	static final double precioLitroGasolina = 1.337;
	static final double precioLitroDiesel = 1.052;

	/**
	 * Método que obtenemos la información del modelo, fabricante y consumo precio/litro de un coche de gasolina
	 * @param modelo2 
	 * @param fabricante2
	 * @return String ""
	 */
	private String infoGasolina(String modelo2, String fabricante2) {
		modelo2 = "Corsa";
		fabricante2 = "Opel";
		String resultado = "";

		resultado = "es un " + fabricante2 + modelo2 + " y gasta " + precioLitroGasolina + " euros por litro"; 

		return resultado;
	}

	/**
	 * Método que obtenemos la información del modelo, fabricante y consumo precio/litro de un coche de diesel
	 * @param modelo2 
	 * @param fabricante2
	 * @return String ""
	 */
	private String infoDiesel(String modelo2, String fabricante2) {
		modelo2 = "Ibiza";
		fabricante2 = "Seat";
		String resultado = "";

		resultado = "es un " + fabricante2 + modelo2 + " y gasta " + precioLitroDiesel + " euros por litro"; 

		return resultado;
	}

	/**
	 * Método que obtenemos la información del modelo, fabricante y consumo precio/litro de un coche de híbrido
	 * @param modelo2 
	 * @param fabricante2
	 * @return String ""
	 */
	private String infoHibrido(String modelo2, String fabricante2) {
		modelo2 = "Getz";
		fabricante2 = "Hyundai";
		String resultado = "";

		resultado = "es un " + fabricante2 + modelo2 + " y no necesita combustible"; 

		return resultado;
	}

	/**
	 * Método que obtenemos la información de un coche dependiendo del combustible que usa
	 * return String ""
	 */
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
