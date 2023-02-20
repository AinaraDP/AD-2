package Soldado;

/** 
 * La clase soldado representa un soldado que puede disparar un arma
 * @author Eric Kroff
 * @version 1.0
 */

public class Soldado {
	
	/**
	 * Este atributo nos indica si el soldado esta muerto
	 */
	private boolean estaMuerto;
	
	/**
	 * Número de balas que posee el soldado en su arma
	 */
	private int numeroBalas;
	
	/**
	 * Constructor por defecto
	 */
	public Soldado() {
		super();
	}
	
	/**
	 *Constructor con parametros
	 *@param a representa si está vivo o muerto
	 *@param b representa el número de balas que tiene el soldado
	 */
	
	public Soldado(boolean a, int b) {
		super();
		estaMuerto = a;
		numeroBalas = b;
	}
	
	//GETTERS AND SETTER
	public boolean isEstaMuerto() {
		return estaMuerto;
	}

	public void setEstaMuerto(boolean estaMuerto) {
		this.estaMuerto = estaMuerto;
	}

	public int getNumeroBalas() {
		return numeroBalas;
	}

	public void setNumeroBalas(int numeroBalas) {
		this.numeroBalas = numeroBalas;
	}
	
	// METODOS
	
	/**
	 * Este método determina si el soldado puede disparar su arma.
	 * 
	 * @return true si el soldado tiene balas disponibles para disparar, false si no las tiene.
	 */
	public boolean puedeDisparar() {
        if(this.numeroBalas > 0) {
        	return true;
        }                          

        return false;
	}

 
	/**
	 * Este método determina que el soldado dispara su arma contra otro soldado.
	 * 
	 * @param sol es el soldado al que disparará.
	 */
	public void disparar(Soldado sol) {
		this.numeroBalas--;
        sol.estaMuerto = true;
}
}