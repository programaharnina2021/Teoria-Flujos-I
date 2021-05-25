package serializacionmultiobjetos09;

import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.OutputStream;

//Sobreescribir la clase ObjectOutputStream para que pueda almacenar varios objetos seguidos en el mismo flujo
public class MyObjectOutputStream extends ObjectOutputStream {

	public MyObjectOutputStream(OutputStream out) throws IOException {
		super(out);
	}

	@Override
	protected void writeStreamHeader() throws IOException {
		System.out.println("soy la  otra");
	}
}
