package serializacionListas08;

import java.io.Serializable;

public class Cliente implements Serializable{
	private int numero;
	private String nombre;
	private boolean preferente;
	private float saldo;
	public Cliente(int numero, String nombre, boolean preferente, float saldo) {
		super();
		this.numero = numero;
		this.nombre = nombre;
		this.preferente = preferente;
		this.saldo = saldo;
	}
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public boolean isPreferente() {
		return preferente;
	}
	public void setPreferente(boolean preferente) {
		this.preferente = preferente;
	}
	public float getSaldo() {
		return saldo;
	}
	public void setSaldo(float saldo) {
		this.saldo = saldo;
	}
	
}
