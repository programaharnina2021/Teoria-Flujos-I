package mapasEjemplo;

public interface Indicable<K extends Comparable> {
	public K getKey();
	public void setKey(K t);
}
