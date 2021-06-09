package mapasEjemplo;

import java.util.Comparator;
import java.util.TreeMap;

public class Ejemplo {
	public static void main(String[] args) {
		Comparator<Intervalo> comparator = new Comparator<Intervalo>() {

			@Override
			public int compare(Intervalo o1, Intervalo o2) {
				return o1.mostoles - o2.mostoles;
			}
		};
		TreeMap<Intervalo, Persona> personas = new TreeMap<>(comparator);
		Persona uno = new Persona("1", "Liucrecio");
		System.out.println(personas.put(new Intervalo(1, 1), uno));
		// personas.put(uno.getKey(), uno);
		System.out.println(personas.get(new Intervalo(1, 1)).toString());
		uno = new Persona("1", "Justiniano");
		System.out.println(personas.put(new Intervalo(1, 2), uno));
		System.out.println(personas.get(new Intervalo(1, 2)).toString());
	}
}
