
package modelo;

/**
 * @ControladorJarra clase que representa un dato de tipo Jarra y la logica asociada a la misma
 * @since 23.12.15
 */
public class Jarra{
	
	private int capacidad;
	private int contenido;	
	
	
	/**
	 * Construcctor con parametros
	 * @param capacidad:capacidad de la jarra establecida por usuario.
	 * @param cotenido: numero de litros de cada jarra establecida por usuario.
	 */
	public Jarra(int capacidad, int cotenido) {
		super();
		this.capacidad = capacidad;
		this.contenido = cotenido;
	}
	/**
	 * @Metodo get.
	 * @return capacidad.
	 */
	public int getCapacidad() {
		return capacidad;
	}
	/**
	 * @Metodo set.
	 * @param capacidad: recoge capacidad de las jarras establecida por el usuario.
	 */
	public void setCapacidad(int capacidad) {
		this.capacidad = capacidad;
	}
	/**
	 * @Metodo get.
	 * @return contenido: devuelve el contenido establecido por usuario.
	 */
	public int getContenido() {
		return contenido;
	}
	/**
	 * @Metodo set.
	 * @param cotenido: recoge contenido de las jarras por el usuario.
	 */
	public void setContenido(int cotenido) {
		this.contenido = cotenido;
	}	
	
}
