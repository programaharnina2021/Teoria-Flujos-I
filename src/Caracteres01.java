import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Caracteres01 {
	private static final int tamano = 80;
	private static final String ruta = "datos.txt";

	public static void main(String[] args) {
		// Aqui se declara el flujo
		FileReader flujo = null;
		char[] uno = new char[tamano];
		try {
			//SIEMPRE en un flujo, se abre, se lee o escribe y se cierra
			flujo = new FileReader(ruta);
			for (int i = 0; i < 3; i++) {
				flujo.read(uno);
				System.out.println(uno);
				System.out.println("lectura numero "+i);
			}
			flujo.close();
			System.out.println("y yo que hago?");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("ese archivo no existe");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("no he podido leer");
		}
		System.out.println("que habra pasado alli?");
	}
}
