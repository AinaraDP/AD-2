    package JUnit5;
    
    import static org.junit.jupiter.api.Assertions.*;
    
    import org.junit.jupiter.api.Test;

    import Clases.Jugador;

    class TestJugador {

   //Pruebas unitaria para comprobar el método ponerDorsal
	
   /** En este caso realizaremos 5 pruebas unitarias para comprobar el correcto funcionamiento del método. Probaremos las 5 opciones
    * o casos con los que nos podemos encontrar: que nos pasen un "1", un número menor que 1, un número mayor a 1,un número igual a "30",
    * un número superior a 30.
    * 
    */
	@Test
	
	//El resultado esperado sería 1, el mismo pasado por parámetro ya que el número es >=1 y <=30
	public void numeroDorsalIgualAUno() {
		Jugador jugador = new Jugador();
		jugador.setDorsal(0);
		jugador.ponerDorsal(1);
		
		int resultadoEsperado = 1;
		int resultado = jugador.getDorsal();
		
		assertEquals(resultadoEsperado, resultado);
	}
	
	
    @Test
  //El resultado esperado sería 20, el mismo pasado por parámetro ya que el número es >=1 y <=30
	public void numeroDorsalMayorQueUno() {
		Jugador jugador = new Jugador();
		jugador.setDorsal(0);
		jugador.ponerDorsal(20);
		
		int resultadoEsperado = 20;
		int resultado = jugador.getDorsal();
		
		assertEquals(resultadoEsperado, resultado);
	
}

    @Test
  //El resultado esperado sería 30, el mismo pasado por parámetro ya que el número es >=1 y <=30
	public void numeroDorsalIgualATreinta() {
		Jugador jugador = new Jugador();
		jugador.setDorsal(0);
		jugador.ponerDorsal(30);
		
		int resultadoEsperado = 30;
		int resultado = jugador.getDorsal();
		
		assertEquals(resultadoEsperado, resultado);
}
    @Test
  //El resultado esperado sería -1, valor por por defecto ya que es <30
	public void numeroDorsalMayorQueTreinta() {
		Jugador jugador = new Jugador();
		jugador.setDorsal(0);
		jugador.ponerDorsal(40);
		
		int resultadoEsperado = -1;
		int resultado = jugador.getDorsal();
		
		assertEquals(resultadoEsperado, resultado);
}
    @Test
  //El resultado esperado sería -1, valor por por defecto ya que es >1
	public void numeroDorsalInferiorAUno() {
		Jugador jugador = new Jugador();
		jugador.setDorsal(0);
		jugador.ponerDorsal(-6);
		
		int resultadoEsperado = -1;
		int resultado = jugador.getDorsal();
		
		assertEquals(resultadoEsperado, resultado);
}
    
    //Pruebas unitaria para comprobar el método estarEpulsado
    /**
     * En este caso se realizarán 4 pruebas unitarias para recoger todos los casos posibles. Que el jugador cuente con 1 tarjeta
     * amarilla, con 2, con una tarjeta roja o que no tenga ninguna tarjeta.
     */
    
    //Dentro de este método se podría considerar como fallo de validación en el método. No he tocado nada del método ya que soy mera
    //encarga de testear el código pero creo, qeu para un correcto funcionamiento, se debería de considerar la posbilidad de que 
    //un jugador tenga más de 2 tarjetas amarillas (aunque en la vida real sea imposible), para evitar cualquier tipo de error
    @Test
    public void testJugadorEstaExpulsadoConAmarillas(){	
    	Jugador jugador = new Jugador();
		jugador.setNumeroTarjetasAmarillas(2);
    
 
	//El resultado esperado es que el jugador esté expulsado
	 assertTrue(jugador.estaExpulsado());		
}
    @Test
    public void testJugadorEstaExpulsadoConRojas(){	
    	Jugador jugador = new Jugador();
		jugador.setNumeroTarjetasRojas(1);
    
 
	//El resultado esperado es que el jugador esté expulsado
	 assertTrue(jugador.estaExpulsado());	
    
 }
    @Test
    public void testJugadorNoEstaExpulsadoConUnaAmarilla(){	
    	Jugador jugador = new Jugador();
		jugador.setNumeroTarjetasAmarillas(1);
    
 
	//El resultado esperado es que el jugador no esté expulsado
	 assertFalse(jugador.estaExpulsado());	
 }
    @Test
    public void testJugadorNoEstaExpulsadoConNingunaRoja(){	
    	Jugador jugador = new Jugador();
		jugador.setNumeroTarjetasRojas(0);
    
 
	//El resultado esperado es que el jugador no esté expulsado
	 assertFalse(jugador.estaExpulsado());	
    
  }
  }