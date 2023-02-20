package junit5;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import Jugador.Jugador;


/**
 * Pruebas unitarias de los métodos de la clase Jugador
 * @author Eric Kroff
 */
public class JugadorTest {

    @Test
    // verifica que el método establece correctamente el dorsal del jugador cuando se proporciona un número de dorsal válido.
    public void testPonerDorsalCorrecto() {
        Jugador jugador = new Jugador();
        jugador.ponerDorsal(15);
        assertEquals(15, jugador.getDorsal());
    }

    @Test
    //verifica que el método establece -1 como dorsal del jugador cuando se proporciona un número de dorsal inválido.
    public void testPonerDorsalIncorrecto() {
        Jugador jugador = new Jugador();
        jugador.ponerDorsal(31);
        assertEquals(-1, jugador.getDorsal());
    }

    @Test
    // verifica que el método devuelve true cuando el jugador ha recibido dos tarjetas amarillas.
    public void testEstaExpulsadoConAmarillas() {
        Jugador jugador = new Jugador();
        jugador.setNumeroTarjetasAmarillas(2);
        boolean resultado = jugador.estaExpulsado();
        assertTrue(resultado);
    }

    @Test
    //verifica que el método devuelve true cuando el jugador ha recibido dos tarjetas amarillas.
    public void testEstaExpulsadoConRojas() {
        Jugador jugador = new Jugador();
        jugador.setNumeroTarjetasRojas(1);
        boolean resultado = jugador.estaExpulsado();
        assertTrue(resultado);
    }

    
    
    @Test
    // Verifica que el jugador no es expulsado cuando tiene una tarjeta amarilla y ninguna roja
    public void testNoEstaExpulsadoConAmarilla() {
        Jugador jugador = new Jugador();
        jugador.setNumeroTarjetasAmarillas(1);
        jugador.setNumeroTarjetasRojas(0);
        boolean resultado = jugador.estaExpulsado();
        assertFalse(resultado);
    }
    
 
    @Test
    // Verifica que el jugador es expulsado cuando tiene una tarjeta amarilla y una roja
    public void testEstaExpulsadoConAmarillaYRoja() {
        Jugador jugador = new Jugador();
        jugador.setNumeroTarjetasAmarillas(1);
        jugador.setNumeroTarjetasRojas(1);
        boolean resultado = jugador.estaExpulsado();
        assertTrue(resultado);
    }
    
 
    @Test
    // verifica que el jugador no es expulsado cuando no tiene tarjetas
    public void testNoEstaExpulsadoSinTarjetas() {
        Jugador jugador = new Jugador();
        jugador.setNumeroTarjetasAmarillas(0);
        jugador.setNumeroTarjetasRojas(0);
        boolean resultado = jugador.estaExpulsado();
        assertFalse(resultado);
    }
	}
