package ejemploAleatorio;

import java.io.IOException;

public interface GrabadorObjetos<T> extends Grabador {
	public void inserta(Indicable obj) throws IOException;
}
