package testJunit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import Programa.Soldado;

class TestSoldado {

	
	//Test para comprobar que el metodo "puedeDisparar" devuelve true
	@Test
	public void puedeDisparar() {
		
		System.out.println("Test 1");
		Soldado sol = new Soldado();
		//Le decimos que tiene 6 balas por lo que deveria de dar true
		sol.setNumeroBalas(6);
		//Comprobamos que pasa la prueba devolviendo true
		assertTrue(sol.puedeDisparar());	
	}

	//Test para comprobar que el metodo "puedeDisparar" devuelve false
	@Test
	public void noPuedeDisparar() {
		System.out.println("Test 2");
		Soldado sol = new Soldado();
		//Le decimos que tiene 0 balas por lo que deveria de dar true
		sol.setNumeroBalas(0);
		//Comprobamos que pasa la prueba devolviendo true
		assertFalse(sol.puedeDisparar());
	}
	
	@Test
	public void disparar() {
		System.out.println("Test 3");
		Soldado sol = new Soldado();
		
		sol.setEstaMuerto(true);
		
	}
}
