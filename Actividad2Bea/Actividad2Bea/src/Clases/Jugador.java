package Clases;
 /**
  * Jugador con dorsal, numeroTarjetasAmarillas y numeroTarjetasRojas
  * 
  * Clase formada por dos métodos que proporcionan la información referente a un jugador y su número
  * de dorsal y si está o no expulsado.
  * 
  * @author Bea
  * @version 1.0
  */
public class Jugador {
	   //ATRIBUTOS

	    /**
	     * Número de dorsal
	     */
        private int dorsal;
        
        /**
         * Número de tarjetas amarillas
         */

        private int numeroTarjetasAmarillas;

        /**Numero de tarjetas rojas
         * 
         */ 
        private int numeroTarjetasRojas;
        
        //GETTER AND SETTER

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
        
		
		//MÉTODOS PRIVADOS
		
		/**
		 * Método que asigna el número de dorsal recibido por parámetro siempre y cuando este sea
		 * mayor o igual a 1 y menor o igual a 30, de otra forma, se le asignará automáticamente el dorsal "-1".
		 * 
		 * @param dorsal Numero de dorsal
		 */
		public void ponerDorsal(int dorsal) {

            if(dorsal >= 1 && dorsal <= 30) {

                          this.dorsal = dorsal;

            }else {

                          this.dorsal = -1;

            }

}

         /**
          * Método que informa de si un jugador está o no expulsado teniendo en cuenta el número de tarjetas amarillas o rojas que
          * este tenga.
          * 
          * @return el jugador no estará expulsado si se retorna false. De otro modo, el jugador se encontrará expulsado, retornándose
          * true, si el jugador tiene dos tarjetas amarillas o una tarjeta roja.
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

