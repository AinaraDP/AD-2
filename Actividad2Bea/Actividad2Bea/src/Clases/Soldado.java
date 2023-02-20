package Clases;
       /**
	   * 
	   * Clase Soldado con atributos estaMuerto y numeroBalas con un objeto sol
	   * 
	   * Se compone de dos métodos que proporcionan la información necesaria para
	   * saber si el soldado <b>tiene balas o no y la simulación de un disparo mortal viéndose reflejado
	   * el decremento de balas en el cargador</b>
	   * 
	   * @author Bea
	   * @version 1.0
	   */
	
public class Soldado {
	  
	  
     //Atributos
	
	 /**
	  * Estado del soldado
	  */
	  private boolean estaMuerto;

	  /**
	   * Numero de balas que posee el soldado
	   */
      private int numeroBalas;
      
  
      //Getter and Setter
      
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
    
    //Métodos propios
	
	/**
	 * Método que devuelve si un soldado puede disparar o no puede disparar en base
	 * a la cantidad de balas que tenga. Si tiene <0 balas, el solado podrá disparar, si tiene
	 * >0 balas, el soldado no podrá disparar
	 * 
	 * @return si el número de balas es inferior a 0, el soldado no podrá disparar y se devuelve <b> false </b>.
	 * Si el número de balas es mayor a 0, el soldado puede disparar y se devolverá <b>true</b>
	 */
	 public boolean puedeDisparar() {

     if(this.numeroBalas > 0) {

          return true;

         }                          

          return false;

         }
    /**
     * Método que simula el disparo a un solado pasado como argumento. El numero de balas se ve decrementado en uno,
     * reflejando un disparo que es recibido por el soldado del argumento. Se establece el valor del atributo "estaMuerto"
     * del objeto Soldado pasado como parámetro a "true",lo que significa que el soldado objetivo ha sido asesinado.
     *  
     *  @param sol Soldado a disparar
     *  
     */

     public void disparar(Soldado sol) {

     this.numeroBalas--;

          sol.estaMuerto = true;

         }
}
