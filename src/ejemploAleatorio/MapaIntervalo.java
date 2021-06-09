package ejemploAleatorio;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Collection;
import java.util.Comparator;
import java.util.TreeMap;

public class MapaIntervalo<K extends Comparable<K>> {
	private String mapaString = "mapa.data";
	private TreeMap<K, Intervalo> mapaTreeMap;
	private K max;

	public MapaIntervalo() {
		super();
		try {
			ObjectInputStream sInputStream = new ObjectInputStream(new FileInputStream(mapaString));
			mapaTreeMap = (TreeMap<K, Intervalo>) sInputStream.readObject();
			sInputStream.close();
		} catch (IOException | ClassNotFoundException e) {
			mapaTreeMap = new TreeMap<K, Intervalo>();
		}
		// mantengo esta forma de buscar el elemento mayor
//		Set<Integer> keySet = mapaTreeMap.keySet();
//		Integer[] noseIntegers = new Integer[keySet.size()];
//		keySet.toArray(noseIntegers);
//		for (Integer integer : noseIntegers) {
//			if (max < integer) {
//				max = integer;
//			}
//		}
		// cuando utilizas la herramienta correcta
//		max = mapaTreeMap.lastKey();

	}

	public Intervalo get(Object key) {
		return mapaTreeMap.get(key);
	}

	public boolean insertar(Indicable<K> clave, long inicio, long fin) {
		assert clave != null && inicio >= 0 && fin > inicio;
		if (mapaTreeMap.containsKey(clave.getKey())) {
			return false;
		}
		mapaTreeMap.put(clave.getKey(), new Intervalo(inicio, fin));
		ObjectOutputStream ooStream = null;
		try {
			ooStream = new ObjectOutputStream(new FileOutputStream(mapaString));
			ooStream.writeObject(mapaTreeMap);
		} catch (IOException e) {
			return false;
		} finally {
			try {
				ooStream.close();
			} catch (IOException e) {
				return false;
			}
		}
		return true;
	}

	public Collection<Intervalo> getTodos() {
		return mapaTreeMap.values();
	}

	public void borrar(Indicable obj) {
		mapaTreeMap.remove(obj.getKey());
	}
}
