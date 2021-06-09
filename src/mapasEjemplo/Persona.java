package mapasEjemplo;

public class Persona implements Indicable<String> {
	private String dni;
	private String nombre;
	

	public Persona(String dni, String nombre) {
		super();
		this.dni = dni;
		this.nombre = nombre;
	}

	@Override
	public String getKey() {
		return this.dni;
	}

	@Override
	public void setKey(String t) {
		this.dni = t;

	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@Override
	public String toString() {
		return "Persona [dni=" + dni + ", nombre=" + nombre + "]";
	}

}
