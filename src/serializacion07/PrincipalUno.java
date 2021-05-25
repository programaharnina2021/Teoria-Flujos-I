package serializacion07;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class PrincipalUno {
	public static void main(String[] args) {
		ClienteUno socio = new ClienteUno();
		socio.nombre = "Juan";
		socio.edad = 32;
		socio.asociado = true;
		ClienteUno socioD = new ClienteUno();
		socioD.nombre = "Alicia";
		socioD.edad = 12;
		socioD.asociado = true;
		File archivo = new File("Clientes.dat");
		// ahora el flujo de bytes
		FileOutputStream flujoW = null;

		// creamos el objeto conversor para serializacion
		ObjectOutputStream adaptadorW = null;
		try {
			archivo.createNewFile();
			//añadir el parametro para añadir
			flujoW = new FileOutputStream(archivo,true);
			adaptadorW = new ObjectOutputStream(flujoW);
			// aqui es donde aparece lo magico
			adaptadorW.writeObject(socio);
			adaptadorW.writeObject(socioD);

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			flujoW.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("terminado");
	}
}
