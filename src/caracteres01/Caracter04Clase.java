package caracteres01;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Caracter04Clase {
	public static void main(String[] args) {
		File file = new File("nuevo.txt");
		// vamos a crear un archivo que no existe
		// como es un main
		boolean banderaCrear = false;
		if (!file.exists()) {
			try {
				banderaCrear = file.createNewFile();				
			} catch (IOException e) {
				// TODO Auto-generated catch block
				// Tira una excepcion si no tienes permisos
				e.printStackTrace();
				banderaCrear=false;
			}
		}
		System.out.println("llego aqui");
		if (banderaCrear) {
			System.out.println("la bandera es true");
			// creamos el flujo de escritura
			FileWriter flujoW = null;
			try {
				//en forma de sobreescitura
				flujoW = new FileWriter(file);
				//en forma de adicion
//				flujoW = new FileWriter(file,true);
				System.out.println("Escribe lo que quieres grabar");
				// Scanner tb es un flujo pero que tiene como fuente el teclado
				Scanner leer = new Scanner(System.in);
				String cadena = leer.nextLine();
				// si le queremos insertar un salto de linea /r+/n el retorno de
				// carro
				// o salto de linea hay que meterlo si no lo hace el flujo
				// fuente como
				// en este caso hace Scanner
				flujoW.write(cadena+"\n");
				flujoW.flush();
				//supongamos esta parte opcional
//				System.out.println("Escribe lo que quieres grabar");
				// Scanner tb es un flujo pero que tiene como fuente el teclado
//				cadena = leer.nextLine();
				leer.close();
//				flujoW.write(cadena+"\n");
				flujoW.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
