package JUnit5;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import Clases.Soldado;

public class TestSoldado {

	//Pruebas unitaria para comprobar el método puedeDisparar
	/**
	 * En este caso se realizarán dos pruebas para corroborar que los resultados obtenidos de este método sean las correctas, 
	 * comprobando los casos en los que el soldado tenga al menos una bala o no tenga ninguna.
	 */
	
	 @Test
	  public void testSoldadoPuedeDisparar(){	
	    Soldado soldado = new Soldado();
		soldado.setNumeroBalas(1);
	    
	 
	//El resultado esperado es que el soldado pueda disparar
	    assertTrue(soldado.puedeDisparar());	

}
	 @Test
	  public void testSoldadoNoPuedeDisparar(){	
	    Soldado soldado = new Soldado();
		soldado.setNumeroBalas(0);
	    
	 
	//El resultado esperado es que el soldado no pueda disparar
	    assertFalse(soldado.puedeDisparar());
}
	 
	

     //Pruebas unitaria para comprobar el método disparar
	 /**
	 * En este caso se realizarán dos pruebas para corroborar que los resultados obtenidos de este método sean las correctas, 
	 * comprobando los casos en los que el soldado tenga al menos una bala o no tenga ninguna.
	 */
	 
	 @Test
	  public void testDisparar(){	
		   Soldado soldado1= new Soldado();
		   Soldado soldado2= new Soldado();
		   
		   soldado1.setNumeroBalas(2);
		   soldado1.disparar(soldado2);
		   
		   //Soldado muerto
		   assertTrue(soldado2.isEstaMuerto());
		   
		   //Se decrementa en 1 el número de balas
		   assertEquals(1, soldado1.getNumeroBalas());


		         
	 }
}