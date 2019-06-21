package practica6;

/**
 * clase Moto
 * @author Javier Escudero - GrupoStudium
 * @author Refactorización - Ismael Carracedo
 */
public class Moto {
	private String matricula;
	private int cilindrada;

	/**
	 * Constructor por defecto de la clase Moto
	 */
	public Moto() {
		setMatricula("");
		setCilindrada(0);
	}

	/**
	 * Constructor con parámetros de la clase Moto
	 * @param m matricula
	 * @param c cilindrada
	 */
	public Moto(String m, int c) {
		setMatricula(m);
		setCilindrada(c);
	}

	/**
	 * Devuelve función matricula
	 * @return String ""
	 */
	public String getMatricula() {
		return matricula;
	}

	/**
	 * Devuelve función cilindrada
	 * @return String ""
	 */
	public int getCilindrada() {
		return cilindrada;
	}

	/**
	 * Parámetro entrada matricula
	 * @param matricula
	 */
	public void setMatricula(String m) {
		matricula = m;
	}

	/**
	 * Parámetro entrada cilindrada
	 * @param cilindrada
	 */
	public void setCilindrada(int c) {
		cilindrada = c;
	}
}
