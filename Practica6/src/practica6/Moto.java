package practica6;

/**
 * clase Moto
 * @author Javier Escudero - GrupoStudium
 * @author Refactorizaci�n - Ismael Carracedo
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
	 * Constructor con par�metros de la clase Moto
	 * @param m matricula
	 * @param c cilindrada
	 */
	public Moto(String m, int c) {
		setMatricula(m);
		setCilindrada(c);
	}

	/**
	 * Devuelve funci�n matricula
	 * @return String ""
	 */
	public String getMatricula() {
		return matricula;
	}

	/**
	 * Devuelve funci�n cilindrada
	 * @return String ""
	 */
	public int getCilindrada() {
		return cilindrada;
	}

	/**
	 * Par�metro entrada matricula
	 * @param matricula
	 */
	public void setMatricula(String m) {
		matricula = m;
	}

	/**
	 * Par�metro entrada cilindrada
	 * @param cilindrada
	 */
	public void setCilindrada(int c) {
		cilindrada = c;
	}
}
