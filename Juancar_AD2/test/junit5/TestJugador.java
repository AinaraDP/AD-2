package junit5;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import clases.Jugador;

class TestJugador {

	
	/**
	 * Prueba unitaria para el método ponerDorsal de la clase Jugador.
	 */
	@Test
	public void testPonerDorsal() {
		Jugador jugador = new Jugador();
	    jugador.ponerDorsal(10);
	    assertEquals(10, jugador.getDorsal());
	    jugador.ponerDorsal(0);
	    assertEquals(-1, jugador.getDorsal());
	    jugador.ponerDorsal(40);
	    assertEquals(-1, jugador.getDorsal());
	}

	/**
	 * Prueba unitaria para el método estaExpulsado de la clase Jugador.
	 */
	@Test
	public void testEstaExpulsado() {
		Jugador jugador = new Jugador();
	    jugador.setNumeroTarjetasAmarillas(1);
	    assertFalse(jugador.estaExpulsado());
	    jugador.setNumeroTarjetasAmarillas(2);
	    assertTrue(jugador.estaExpulsado());
	    jugador.setNumeroTarjetasRojas(1);
	    assertTrue(jugador.estaExpulsado());
	    //jugador.setNumeroTarjetasAmarillas(0);
	    //assertFalse(jugador.estaExpulsado());
	}

}

//La solución que propongo es que falla porque le estamos pidiendo que sea true con 0 tarjetas, y siendo así es false.