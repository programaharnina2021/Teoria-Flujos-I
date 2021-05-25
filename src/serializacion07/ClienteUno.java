package serializacion07;

import java.io.Serializable;

public class ClienteUno implements Serializable{
	/*
	 * Las propiedades son publicas para comodidad de la explicacionpero
	 * nosotros NO DEBEMOS trabajar con Objetos POJO
	 */
	public String nombre;
	public int edad;
	public boolean asociado;
	
	public ClienteUno(String nombre, int edad, boolean asociado) {
		this.nombre = nombre;
		this.edad = edad;
		this.asociado = asociado;
	}
	public ClienteUno() {
		// TODO Auto-generated constructor stub
	}
	
}
