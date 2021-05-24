package binarioInterface04;

import java.io.DataOutputStream;
import java.io.IOException;

public class AdecuadorClienteBinario implements Adecuador {

	@Override
	public boolean graba(DataOutputStream conversor, Object objeto) {
		assert objeto instanceof Cliente && conversor != null;
		boolean retorno = true;
		Cliente cliente = (Cliente) objeto;
		try {
			conversor.writeInt(cliente.getNumero());
			conversor.writeUTF(cliente.getNombre());
			conversor.writeBoolean(cliente.isPreferente());
			conversor.writeFloat(cliente.getSaldo());
		} catch (IOException e) {
			retorno = false;
		}
		return retorno;
	}

}
