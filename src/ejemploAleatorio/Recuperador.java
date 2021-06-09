package ejemploAleatorio;

import java.io.IOException;

public interface Recuperador {

	public boolean iniciaOperacion(String path);

	public int recuperaInt() throws IOException;

	public float recuperaFloat() throws IOException;

	public double recuperaDouble() throws IOException;

	public String recuperaString() throws IOException;

	public boolean recuperaBoolean() throws IOException;

	public boolean cierraElemento() throws IOException;
}
