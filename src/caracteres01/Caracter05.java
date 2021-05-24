package caracteres01;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Caracter05 {
	//Ahora usando buffers
	public static void main(String[] args) {
		File file = new File("nueva.txt");
		if (!file.exists()) {
			try {
				if (file.createNewFile()) {
					FileWriter flujoW = null;
					BufferedWriter bufferW = null;
					// el flujo
					try {
						//add al final del fichero
						flujoW = new FileWriter(file, true);
						bufferW = new BufferedWriter(flujoW);
						System.out.println("Escribe lo que quieres grabar");
						Scanner leer = new Scanner(System.in);
						String cadena = leer.nextLine();
						leer.close();
						bufferW.write(cadena + "\n");
					} catch (Exception e) {
						// TODO: handle exception
					}
					bufferW.close();
					flujoW.close();
				}
			} catch (IOException e) {

				e.printStackTrace();
			}

		}
	}
}
