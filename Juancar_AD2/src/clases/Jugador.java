package clases;

/**
 * Clase que representa a un jugador de fútbol.
 */
public class Jugador {

    private int dorsal;
    private int numeroTarjetasAmarillas;
    private int numeroTarjetasRojas;



	/**
     * Método para establecer el dorsal del jugador.
     * Si el dorsal está entre 1 y 30 (ambos inclusive), lo establece.
     * Si no, establece el dorsal a -1.
     * @param dorsal el dorsal a establecer
     */
    public void ponerDorsal(int dorsal) {
        if (dorsal >= 1 && dorsal <= 30) {
            this.dorsal = dorsal;
        } else {
            this.dorsal = -1;
        }
    }

    /**
     * Indica si el jugador está expulsado o no.
     * Un jugador está expulsado si tiene dos tarjetas amarillas o una tarjeta roja.
     * @return true si el jugador está expulsado, false en caso contrario
     */
    public boolean estaExpulsado() {
        return (numeroTarjetasAmarillas == 2) || (numeroTarjetasRojas == 1);
        
       
    }

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
        if (numeroTarjetasRojas >= 0) {
            this.numeroTarjetasRojas = numeroTarjetasRojas;
        } else {
            this.numeroTarjetasRojas = 0;
        }
    }
    
}