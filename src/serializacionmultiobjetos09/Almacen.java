package serializacionmultiobjetos09;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import javax.print.attribute.standard.Sides;

public class Almacen {

	private String path;
	private File file;
	private FileOutputStream flujoW;
	private FileInputStream flujoR;
	private ObjectInputStream adaptadorR;
	private ObjectOutputStream adaptadorW;

	public Almacen(String path) {
		super();
		this.path = path;
		file = new File(path);
	}

	public boolean almacena(Object obj) {
		boolean retorno = false;
		boolean existe = file.exists();
		try {
			flujoW = new FileOutputStream(file, true);
			// Se ha creado el archivo para adicion
			// si se ha creado bien existira
			// Si antes de crear el flujo el objeto no existe
			if (!existe) {
				//uso el output de primer objeto (es decir con cabecera)
				adaptadorW = new ObjectOutputStream(flujoW);
			}
			else{
				adaptadorW = new MyObjectOutputStream(flujoW);
			}
			adaptadorW.writeObject(obj);
		} catch (IOException e) {
			e.printStackTrace();
		}
		try {
			adaptadorW.close();
			flujoW.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return retorno;
	}

	public Object recuperar(int posicion) {
		Object obj = null;
		try {
			flujoR = new FileInputStream(file);
			adaptadorR = new ObjectInputStream(flujoR);
			//como es secuencial y no se el tamano de cada objeto no me queda mas remedio que leer los anteriores
			for (int i = 0; i < posicion; i++) {
				obj = adaptadorR.readObject();
			}
			obj = adaptadorR.readObject();
		} catch (IOException | ClassNotFoundException e) {
			e.printStackTrace();
		}
		try {
			adaptadorR.close();
			flujoR.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return obj;
	}

}
