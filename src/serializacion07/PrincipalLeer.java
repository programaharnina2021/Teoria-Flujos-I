package serializacion07;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class PrincipalLeer {
	public static void main(String[] args) {
		File archivo = new File("Clientes.dat");
		FileInputStream flujoEntrada = null;
		ObjectInputStream adaptadorLectura = null;
		ClienteUno socio = null;
		try {
			flujoEntrada = new FileInputStream(archivo);
			adaptadorLectura = new ObjectInputStream(flujoEntrada);
			socio = (ClienteUno) adaptadorLectura.readObject();
			// Obtendremos un error de stream corrupto
			// si guardamos varios objetos en un fichero
			// pero no en la misma sesion. Entendemos como una sesion
			// el proceso de abrir-guardar-cerra
			while (socio != null) {
				System.out.println(socio.nombre + " " + socio.edad);
				socio = (ClienteUno) adaptadorLectura.readObject();
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (EOFException e) {
			System.out.println("fin de fichero");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			flujoEntrada.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
