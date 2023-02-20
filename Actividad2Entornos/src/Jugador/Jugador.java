package Jugador;

	/**
	 * La clase Jugador representa un jugador de fútbol.
	 * Tiene un dorsal y un registro de tarjetas amarillas y rojas.
	 * @author Eric Kroff
	 */
	public class Jugador {
	
	
	/**
	 * Número que identifica al jugador
	 */
	private int dorsal;
	   

	/**
	 * Número de tarjetas amarillas que ha recibido el jugador
	 */
	private int numeroTarjetasAmarillas;
	  
	    
	
	/** 
	 * Número de tarjetas rojas que ha recibido el jugador
	 */
	private int numeroTarjetasRojas;

	    
	/**
	 * Constructor por defecto
	 */
	public Jugador() {
		super();
	}


	
	/**
	 * Constructor con parametros
	 * @param a representa el número del dorsal
	 * @param b representa el número de tarjetas amarillas
	 * @param c representa el número de tarjetas rojas
	 */
	public Jugador(int dorsal, int numeroTarjetasAmarillas, int numeroTarjetasRojas) {
		super();
		this.dorsal = dorsal;
		this.numeroTarjetasAmarillas = numeroTarjetasAmarillas;
		this.numeroTarjetasRojas = numeroTarjetasRojas;
	}

	//GETTERS AND SETTER
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
	
	// METODOS
	/**
     * El metodo establece el número del dorsal del jugador.
     * El dorsal debe estar entre 1 y 30, ambos inclusive. 
     * Si el dorsal es menor que 1 o mayor que 30, el dorsal se establece como -1.
     *
     * @param dorsal El número del dorsal del jugador.
     */
	
    public void ponerDorsal(int dorsal) {
        if(dorsal >= 1 && dorsal <= 30) {
            this.dorsal = dorsal;
        } else {
            this.dorsal = -1;
        }
    }
	
    /**
     * El metodo indica si el jugador está expulsado o no. 
     * Un jugador está expulsado si tiene dos tarjetas amarillas o una tarjeta roja.
     *
     * @return true si el jugador está expulsado, false en caso contrario.
     */
    public boolean estaExpulsado() {
        boolean expulsado = false;
        if(numeroTarjetasAmarillas == 2 || numeroTarjetasRojas == 1) {
            expulsado = true;
        }
        return expulsado;
    }
	}
