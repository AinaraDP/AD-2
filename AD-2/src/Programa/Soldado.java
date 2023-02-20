package Programa;

/**
 * Clase que representa un soldado con dos atributos, estaMuerto y numeroBalas.
 */
public class Soldado {

	
	/**
	 * Muestra si el soldado esta muerto mediante true o false
	 */
	private boolean estaMuerto;
	
	/**
	 * El numero de balas que tiene el soldado. Con un valor mayor que el 0 podra 
	 * disparar y con 0 o menor no.
	 */
	private int numeroBalas;
	

	//Getter and setters
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
	
	/**
	 * Este metodo nos da informacion sobre el parametro "numeroBalas" y nos dice
	 * si puede disparar o no.
	 * 
	 * @return Si su valor es mayor que 0 devuelve true significando esto que si 
	 * puede disparar. 
	 * Si por lo contrario su valor es igual a 0 devuelve false
	 * y no puede disparar. 
	 */
	
	//Metodo "puede disparar"
	public boolean puedeDisparar() {
		 if (this.numeroBalas > 0) {
			 return true;
		 }
		 return false;
	}
	
	/**
	 * Este metodo nos muestra el numero de balas que quedan en el parametro 
	 * "numeroBalas" y si la variable "sol" esta muerta mediante un true
	 * 
	 * @param sol representa al soldado
	 */
	
	//Metodo "disparar"
	public void disparar(Soldado sol) {
		this.numeroBalas--;
		sol.estaMuerto = true;
	}
	
	

}