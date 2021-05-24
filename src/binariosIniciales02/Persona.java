package binariosIniciales02;

public class Persona {
	private String nombre;
	private byte edad;
	private float dioptrias;
	private boolean enfermo;

	public Persona(String nombre, byte edad) {
		super();
		this.nombre = nombre;
		this.edad = edad;
		this.dioptrias = 0f;
		this.enfermo = false;
	}

	public Persona(String nombre, byte edad, boolean enfermo) {
		this(nombre, edad);
		this.enfermo = enfermo;
	}
	

	public Persona(String nombre, byte edad, float dioptrias, boolean enfermo) {
		this(nombre, edad,enfermo);
		this.dioptrias = dioptrias;
	}

	@Override
	public String toString() {
		return nombre+" "+edad+" "+dioptrias+" "+enfermo;
	}
	public byte getEdad() {
		return edad;
	}

	public void setEdad(byte edad) {
		this.edad = edad;
	}

	public float getDioptrias() {
		return dioptrias;
	}

	public void setDioptrias(float dioptrias) {
		this.dioptrias = dioptrias;
	}

	public boolean isEnfermo() {
		return enfermo;
	}

	public void setEnfermo(boolean enfermo) {
		this.enfermo = enfermo;
	}

	public String getNombre() {
		return nombre;
	}

}
