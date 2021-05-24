package binariasFachada06;

import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.Serializable;

public class Cliente implements Serializable {
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

	@Override
	public boolean equals(Object obj) {
		// nota: todas las salidas sucias se permiten sólopara explicar esto
		// 1º parte: dos objetos son iguales si son el mismo
		if (this == obj)
			return true;
		// 2º parte: si el obj es null entonces no son iguales
		if (obj == null)
			return false;
		// 3º parte deben pertenece a la misma clase
		if (!(obj instanceof Cliente))
			return false;
		// 4º parte establece tus condiciones para igualar aqui
		Cliente instancia = (Cliente) obj;
		// Si son mas, se ponen mas
		return this.numero == instancia.numero && this.nombre.equals(instancia.nombre);
	}

	/*
	 * Según java no puedes sobreescribir equals y dejar hashcode igual El contrato
	 * te obliga a cambiar hashcode si cambias equals porque si son iguales por
	 * equals son iguales por hashcode pero no al reves es decir si son iguales por
	 * hashcode no tienen porque ser iguales segun equals
	 */
	@Override
	public int hashCode() {
		// para cumplir con lo anterior estamos obligados a crear un valor hash que
		// dependa de los
		// atributos que usamos para comparar
		// 1º usa un valor primo para la constante hash
		int hash = 13;
		// 2º genera la clave hash usando el valor anterior y algún factor numérico de
		// los campos
		// que tratamos podemos complicarlo un poco tanto como queramos dentro de las
		// leyes
		return hash * this.numero + this.nombre.hashCode();
	}
}
