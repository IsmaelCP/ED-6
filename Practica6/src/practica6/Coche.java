package practica6;

public class Coche {
	String matricula;
	String atrib;
	String modelo;
	String fabricante;

	public Coche() {
		matricula = "";
		atrib = "";
		modelo = "";
		fabricante = "";
	}

	public Coche(String m, String c, String mo, String f) {
		matricula = m;
		atrib = c;
		modelo = mo;
		fabricante = f;
	}

	public String metodo1() {
		String resultado = "";
		if (atrib == "Gasolina") {
			resultado += "El coche con matricula " + matricula + " ";
			resultado += metodoA(modelo, fabricante);
		} else if (atrib == "Diesel") {
			resultado += "El coche con matricula " + matricula + " ";
			resultado += metodoB(modelo, fabricante);
		} else if (atrib == "Híbrido") {
			resultado += "El coche con matricula " + matricula + " ";
			resultado += metodoC(modelo, fabricante);
		} else {
			resultado += "El coche con matricula " + matricula + " ";
			resultado += "no dispone de información";
		}
		return resultado;
	}

	private String metodoA(String modelo2, String fabricante2) {
		modelo2 = "Corsa";
		fabricante2 = "Opel";
		String resultado = "";

		resultado = "es un " + fabricante2 + modelo2 + " y gasta 1,337 euros por litro"; 

		return resultado;
	}

	private String metodoB(String modelo2, String fabricante2) {
		modelo2 = "Ibiza";
		fabricante2 = "Seat";
		String resultado = "";

		resultado = "es un " + fabricante2 + modelo2 + " y gasta 1,337 euros por litro"; 

		return resultado;
	}

	private String metodoC(String modelo2, String fabricante2) {
		modelo2 = "Getz";
		fabricante2 = "Hyundai";
		String resultado = "";

		resultado = "es un " + fabricante2 + modelo2 + " y gasta 1,337 euros por litro"; 

		return resultado;
	}

}
