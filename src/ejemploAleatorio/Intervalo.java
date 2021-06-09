package ejemploAleatorio;

import java.io.Serializable;

public class Intervalo implements Serializable {
	public long inicio;
	public long longitud;

	public Intervalo(long inicio, long longitud) {
		super();
		this.inicio = inicio;
		this.longitud = longitud;
	}

	public long getDiferencia() {
		return longitud;
	}

}
