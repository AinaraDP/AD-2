package Programa;

/**
 * Clase que representa un jugador con tres atributos, dorsal, numeroTarjetasAmarillas 
 * y numeroTarjetasRojas.
 */
public class Jugador {

	/**
	 * Muestra el numero del dorsal del jugador
	 */
	private int dorsal;
	
	/**
	 * Muestra el numero de tarjetas amarillas que tiene un jugador
	 */
	private int numeroTarjetasAmarillas;
	
	/**
	 * Muestra el numero de tarjetas rojas que tiene un jugador
	 */
	private int numeroTarjetasRojas;
	
	
	//Getter and setters
	public int getDorsal() {
		return dorsal;
	}
	public void setDorsal(int dorsal) {
		this.dorsal = dorsal;
	}
	public int getNumeroTarjetasAmarillas() {
		return numeroTarjetasAmarillas;
	}
	public void setNumeroTarjetasAmarillas(int numeroTarjetasAmarillas) {
		this.numeroTarjetasAmarillas = numeroTarjetasAmarillas;
	}
	public int getNumeroTarjetasRojas() {
		return numeroTarjetasRojas;
	}
	public void setNumeroTarjetasRojas(int numeroTarjetasRojas) {
		this.numeroTarjetasRojas = numeroTarjetasRojas;
	}
	
	
	//Metodos
	
	/**
	 * Este metodo pone un valor a la variable dorsal. Si el valor que le damos es
	 * mayor o igual que 1 y menor o igual de 30, el valor que le da es el que le 
	 * hemos pasado por parametro. 
	 * Si no el valor que le da es de -1.
	 * 
	 * @param dorsal representa el dorsal que queremos establecer
	 */
	  public void ponerDorsal(int dorsal) {

          if(dorsal >= 1 && dorsal <= 30) {
        	  this.dorsal = dorsal;
          }else {
              this.dorsal = -1;
          }
	  }
	
	  /**
	   * Metodo para saber si un jugador esta expulsado o no.
	   * 
	   * Expulsado parametro por defecto false para decir que no esta expulsado
	   * segun el numeroTarjetasAmarillas y el numeroTarjetasRojas se cambiara a true 
	   * o no
	   * 
	   * @return El metodo devuelve el valor de la variable expulsado, en este caso true o false
	   * Si el parametro expulsado no se modifica devuelve false
	   * Si el numero de tarjetas amarillas es igual a 2 devuelve true
	   * Si el numero de tarjetas rojas es 1 devuelve true
	   * 
	   * 
	   */
	  public boolean estaExpulsado() {

          boolean expulsado = false; 
          
          if(numeroTarjetasAmarillas == 2) {
        	  expulsado = true;
          }                          
          if(numeroTarjetasRojas == 1) {
              expulsado = true;
          }                          
          return expulsado;

	  }            

  
}
