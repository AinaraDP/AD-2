package junit5;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import clases.Soldado;

/**
 * Esta clase contiene las pruebas unitarias para la clase Soldado.
 */
class TestSoldado {

    /**
     * Comprueba si un soldado puede disparar.
     */
    @Test
    public void testPuedeDisparar() {
        Soldado s = new Soldado();
        s.setNumeroBalas(1);
        assertTrue(s.puedeDisparar());
        s.setNumeroBalas(0);
        assertFalse(s.puedeDisparar());
    }

    /**
     * Comprueba si un soldado puede disparar a otro soldado, matándolo.
     */
    @Test
    public void testDisparar() {
        Soldado s1 = new Soldado();
        Soldado s2 = new Soldado();
        s1.setNumeroBalas(1);
        s1.disparar(s2);
        assertTrue(s2.isEstaMuerto());
        assertEquals(0, s1.getNumeroBalas());
    }
}
