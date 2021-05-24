package binarioInterface04;

import java.io.DataOutputStream;
import java.io.IOException;

public class AdecuadorArticuloTexto implements Adecuador {

	@Override
	public boolean graba(DataOutputStream conversor, Object objeto) {
		assert objeto instanceof Articulo && conversor != null;
		boolean retorno = true;
		Articulo articulo = (Articulo) objeto;
		try {
			conversor.writeInt(articulo.id);
			conversor.writeUTF(articulo.nombre);

		} catch (IOException e) {
			retorno = false;
		}
		return false;
	}

}
