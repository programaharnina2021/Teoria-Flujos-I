package binariasFachada06;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class AdaptadorText extends Adaptador {

	@Override
	public ArrayList leer(String path, IAdecuador adecuador) {
		assert path != null;
		File file = new File(path);
		ArrayList objetos = new ArrayList<>();
		FileReader flujoR = null;
		if (file.exists()) {
			try {
				flujoR = new FileReader(file);
				BufferedReader conversorR = new BufferedReader(flujoR);
				adecuador.recupera(conversorR, objetos);
			} catch (IOException e) {
				e.printStackTrace();
			}
			try {
				flujoR.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		return objetos;
	}

	public boolean grabar(FileWriter flujoW, Object objeto, IAdecuador adecuador) {
		return super.grabar(flujoW, objeto, adecuador);
	}

}
