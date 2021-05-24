package binariosAdaptador03;

import java.io.DataOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class Adaptador {

	public Cliente leer(String path) {
		// TODO Auto-generated method stub
		return null;
	}

	public boolean grabar(String path, Cliente objeto) {
		assert path != null && objeto != null;
		File file = new File(path);
		boolean retorno = false;
		FileOutputStream flujoW = null;
		try {
			flujoW = new FileOutputStream(file);
			DataOutputStream conversorW = new DataOutputStream(flujoW);
			conversorW.writeInt(objeto.getNumero());
			conversorW.writeUTF(objeto.getNombre());
			conversorW.writeBoolean(objeto.isPreferente());
			conversorW.writeFloat(objeto.getSaldo());
			retorno = true;
		} catch (IOException e) {
			e.printStackTrace();
		}
		try {
			flujoW.close();
		} catch (IOException e1) {
			e1.printStackTrace();
		}
		return retorno;
	}

}
