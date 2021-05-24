package binariosIniciales02;

import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class LeerBinario03 {

	public static void main(String[] args) {
		File archivo = new File("persona.data");
		Persona persona;
		FileInputStream flujoR = null;
		try {
			flujoR=new FileInputStream(archivo);
			DataInputStream conversorR=new DataInputStream(flujoR);
			//si no se el orden en que se almacenan  no lo puedo recuperar
			persona=new Persona(
					conversorR.readUTF(), 
					conversorR.readByte(),
					conversorR.readFloat(),
					conversorR.readBoolean());
			System.out.println(persona.toString());
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("siempre se ejecuta aunque hay excepcion");
		try {
			flujoR.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
