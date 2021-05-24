package binariasFachada06;

import java.io.Closeable;
import java.io.IOException;
import java.util.ArrayList;

public class Adaptador {

	public ArrayList leer(String path, IAdecuador adecuador) {
		// TODO
		return null;
	};

	protected boolean grabar(Closeable flujoW, Object objeto, IAdecuador adecuador) {
		assert objeto != null;
		boolean retorno = false;
		retorno = adecuador.graba(flujoW, objeto);
		try {
			flujoW.close();
		} catch (IOException e1) {
			e1.printStackTrace();
		}
		return retorno;
	}
}
