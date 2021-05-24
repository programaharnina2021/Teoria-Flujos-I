package caracteres01;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Copiar {
	// Crea un programa que haga una copia del contenido de un fichero en otro
	public static void main(String[] args) {
		String rutaFuente = "datos.txt";
		String rutaDestino = "copia.dat";
		File fuente = new File(rutaFuente);
		if (fuente.exists()) {
			File destino = new File(rutaDestino);
			FileReader flujoFuente;
			FileWriter flujoDestino;
			BufferedReader bufferFuente;
			BufferedWriter bufferDestino;
			try {
				flujoFuente = new FileReader(fuente);
				bufferFuente = new BufferedReader(flujoFuente);
				// abierto para sobrescritura
				flujoDestino = new FileWriter(destino);
				bufferDestino = new BufferedWriter(flujoDestino);
				// comenzando el proceso de copia
				String readLine = bufferFuente.readLine();
				// uso alternativo
				// bufferFuente.read();
				while (!(readLine == null)) {
					// esto inserta al final mientras no se cierra
					// en la siguiente apertura una orden de escritura
					// si sobreescribe en el fichero
					bufferDestino.write(readLine + "\n");
					readLine = bufferFuente.readLine();
				}
				bufferDestino.close();
				flujoDestino.close();
				bufferFuente.close();
				flujoFuente.close();
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		} else {
			System.out.println(" el archivo fuente no existe");
		}
	}
}
