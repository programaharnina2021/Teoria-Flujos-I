package caracteres01;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
/**
 * 
 * @author estar
 *
 */
public class Caracter03 {
	// usamos mim primer buffer
	public static void main(String[] args) {
		FileReader flujo = null;
		BufferedReader buffer = null;
		File file = new File("JuegoTronos.txt");
		// Lo primero siempre es?
		if (file.exists()) {
			// abrir flujo}
			try {
				flujo = new FileReader(file);
				buffer = new BufferedReader(flujo);
				// este metodo permite leer de un buffer hasta que encuentre un
				// caracter /n
				String linea = buffer.readLine();
				linea = buffer.readLine();
				//mark permite marcar una punto del flujo ponemos limites en bytes
				buffer.mark(1000);
				int tamano=1;
				while(linea!=null&&tamano<21){
					System.out.println(linea);
					linea=buffer.readLine();
					tamano++;
					//reset vuelve al punto de la marca si está dentro del limmite
					if(tamano%5==0)buffer.reset();
				}
				
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
