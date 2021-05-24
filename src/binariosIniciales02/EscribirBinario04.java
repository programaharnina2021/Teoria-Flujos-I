package binariosIniciales02;

import java.io.DataOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class EscribirBinario04 {
	public static void main(String[] args) {
		Persona persona = new Persona("luis", (byte) 56, .5f, true);
		FileOutputStream flujoW = null;
		File archivo = new File("persona.data");
		try {
			flujoW = new FileOutputStream(archivo);
			// resulta que el flujo SOLO sabe escribir bytes
			// necesitamos un conversor que interprete datos mas complejos que el byte
			DataOutputStream conversorW = new DataOutputStream(flujoW);
			//no hace falta cerrar el conversor
			conversorW.writeUTF(persona.getNombre());
			conversorW.writeByte(persona.getEdad());
			conversorW.writeFloat(persona.getDioptrias());
			conversorW.writeBoolean(persona.isEnfermo());			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
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
	}
}
