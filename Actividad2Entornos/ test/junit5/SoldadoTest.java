package junit5;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import Soldado.Soldado;

/**
 * Pruebas unitarias de los métodos de la clase Soldado
 * @author Eric Kroff
 */

public class SoldadoTest {

    @Test
    public void testPuedeDispararConBalas() {
        Soldado soldado = new Soldado();
        soldado.setNumeroBalas(1);
        boolean resultado = soldado.puedeDisparar();
        assertTrue(resultado);
    }

    @Test
    public void testPuedeDispararSinBalas() {
        Soldado soldado = new Soldado();
        soldado.setNumeroBalas(0);
        boolean resultado = soldado.puedeDisparar();
        assertFalse(resultado);
    }

    @Test
    public void testDisparar() {
        Soldado soldado1 = new Soldado();
        soldado1.setNumeroBalas(1);
        Soldado soldado2 = new Soldado();
        soldado1.disparar(soldado2);
        assertFalse(soldado1.puedeDisparar());
        assertTrue(soldado2.isEstaMuerto());
    }
}