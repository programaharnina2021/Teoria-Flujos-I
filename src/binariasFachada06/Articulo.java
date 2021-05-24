package binariasFachada06;

public class Articulo {

	private int numeroID;
	private String nombre;


	public Articulo(int numeroID, String nombre) {
		super();
		this.numeroID = numeroID;
		this.nombre = nombre;
	}

	public int getNumeroID() {
		return numeroID;
	}

	public void setNumeroID(int numeroID) {
		this.numeroID = numeroID;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
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
		if (!(obj instanceof Articulo))
			return false;
		// 4º parte establece tus condiciones para igualar aqui
		Articulo instancia = (Articulo) obj;
		// Si son mas, se ponen mas
		return this.numeroID == instancia.numeroID && this.nombre.equals(instancia.nombre);
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
		return hash * this.numeroID + this.nombre.hashCode();
	}
}
