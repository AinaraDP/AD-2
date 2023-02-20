package testJunit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import Programa.Jugador;

class TestJugador {

	/**
	 * En este test vamos a probar el metodo "ponerDorsal" con el numero 5
	 */
	@Test
	public void ponerDorsal() {
		Jugador jugador = new Jugador();
		
		//Ponemos el valor de dorsal inicial a 0 
		jugador.setDorsal(0);
		//Mediante el metodo ponerDorsal se lo cambiamos a 5
		jugador.ponerDorsal(5);
		
		int resultadoEsperado = 5;
		int resultadoObtenido = jugador.getDorsal();;
		
		//Comprobamos que el resultadoEsperado y el obtenido sea el mismo
		assertEquals(resultadoEsperado, resultadoObtenido);
	}
	
	/**
	 * En este test vamos a probar el metodo "ponerDorsal" con el numero 31
	 */
	@Test
	public void ponerDorsalMenos1() {
		Jugador jugador = new Jugador();
		
		//Ponemos el valor de dorsal inicial a 0 
		jugador.setDorsal(0);
		//Mediante el metodo ponerDorsal se lo cambiamos a 31
		jugador.ponerDorsal(31);
		
		int resultadoEsperado = -1;
		//Con getDorsal lo que deveriamos de estar haciendo es coger el numero de 
		//dorsal que hemos puesto con el metodo, no con el set, por lo que en este
		//el numero que tiene que devolver es -1
		int resultadoObtenido = jugador.getDorsal();
		
		//Comprobamos que el resultadoEsperado y el obtenido sea el mismo 
		assertEquals(resultadoEsperado, resultadoObtenido);
	}
	
	
	/**
	 * En este test vamos a probar el metodo "estaExpulsado" con una tarjeta roja 
	 * y 1 amarilla
	 */
	@Test
	public void estaExpulsado() {
		//Creamos un objeto Jugador
		Jugador jugador = new Jugador();
		
		//Le damos valor de 1 a tarjetas amarillas (tendria que dar false)
		jugador.setNumeroTarjetasAmarillas(1);
		//Le damos valor de 1 a tarjetas rojas (tendria que dar true)
		jugador.setNumeroTarjetasRojas(1);
		
		//Comprobamos que da true ya que hay 1 tarjeta roja aunque haya tambien 1 
		//solo amarilla
		assertTrue (jugador.estaExpulsado());
		
	}

}
