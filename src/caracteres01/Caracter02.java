package caracteres01;

import java.io.FileReader;
import java.io.IOException;

public class Caracter02 {
public static void main(String[] args) {
	FileReader archivo = null;
	try {
		//esta falla porque el archivo no existe
//		archivo=new FileReader("datos.dat");
		archivo=new FileReader("datos.txt");
		int uno=archivo.read();
		while(uno!=-1){
			System.out.print(Character.toChars(uno));
			//Si utilizamos una pausa
			Thread.sleep(100);
			uno = archivo.read();
		}
		archivo.close();
	} catch (IOException | InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}
}
