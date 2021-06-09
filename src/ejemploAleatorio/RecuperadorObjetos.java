package ejemploAleatorio;

import java.io.IOException;
import java.util.ArrayList;

public interface RecuperadorObjetos<T,K> extends Recuperador {
	public T recupera(K k) throws Exception;
	public ArrayList<T> recupera() throws IOException, ClassNotFoundException;
	boolean iniciaOperacion(String path);
}
