package clases;



/**

Clase que representa a un soldado capaz de disparar a otro soldado.
*/
public class Soldado {

private boolean estaMuerto;
private int numeroBalas;

/**

Devuelve un booleano que indica si el soldado actual tiene balas para disparar.
@return true si el soldado tiene al menos una bala, false en caso contrario.
*/
public boolean puedeDisparar() {
if (this.numeroBalas > 0) {
return true;
}
return false;
}
/**

Dispara al soldado pasado como argumento, reduciendo en uno el número de balas del soldado actual
y estableciendo el atributo "estaMuerto" del soldado pasado como verdadero.
@param sol el soldado a disparar.
*/
public void disparar(Soldado sol) {
this.numeroBalas--;
sol.estaMuerto = true;
}
// Se incluyen los métodos "get" y "set" necesarios.
public boolean isEstaMuerto() {
	return estaMuerto;
}
public void setEstaMuerto(boolean estaMuerto) {
	this.estaMuerto = estaMuerto;
}
public int getNumeroBalas() {
	return numeroBalas;
}
public void setNumeroBalas(int numeroBalas) {
	this.numeroBalas = numeroBalas;
}


}



