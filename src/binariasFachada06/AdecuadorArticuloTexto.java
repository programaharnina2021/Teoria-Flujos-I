package binariasFachada06;

import java.io.BufferedReader;
import java.io.Closeable;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class AdecuadorArticuloTexto implements IAdecuador {

	private void insertaCampo(String objeto, FileWriter flujoW, boolean last) throws IOException {
		flujoW.write(objeto);
		if (!last) {
			flujoW.write(":");
		} else {
			flujoW.write("\n");
		}
	}

	@Override
	public boolean graba(Closeable flujoW, Object objeto) {
		boolean retorno = false;
		FileWriter flujoMio = (FileWriter) flujoW;
		Articulo articulo = (Articulo) objeto;
		try {
			insertaCampo(String.valueOf(articulo.getNumeroID()), flujoMio, false);
			insertaCampo(String.valueOf(articulo.getNombre()), flujoMio, false);
			retorno = true;
		} catch (IOException e) {
		}
		return retorno;
	}

	@Override
	public void recupera(Closeable flujoR, ArrayList lista) throws IOException {
		BufferedReader lectura = new BufferedReader((FileReader) flujoR);
		String cadenaString = lectura.readLine();
		while (cadenaString != null) {
			String[] split = cadenaString.split(":");
			lista.add(new Cliente(Integer.parseInt(split[0]), split[1], Boolean.parseBoolean(split[2]),
					Float.parseFloat(split[3])));
			cadenaString = lectura.readLine();
		}

	}
}
