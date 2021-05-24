package binariosIniciales02;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class EscribirBinario01 {
	public static void main(String[] args) {
		// Vamos a empezar grabando
		File archivo = new File("prueba.ddc");
		byte[] array = new byte[8];
		// El flujo de salida binaria
		FileOutputStream flujoW = null;
		try {
			// Si no existe lo va a crear (si tiene permisos)
			flujoW = new FileOutputStream(archivo);
			for (int i = 0; i < array.length; i++) {
				array[i] = (byte) ((i + 1) * 2);
				System.out.println(array[i]);
			}
			flujoW.write(array);

		} catch (IOException e) {
			e.printStackTrace();
		}
		try {
			flujoW.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
