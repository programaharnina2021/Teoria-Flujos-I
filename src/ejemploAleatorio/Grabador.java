package ejemploAleatorio;

import java.io.IOException;

public interface Grabador {
	public void iniciarOperacion(String path) throws IOException;

	public void insertaElemento(int obj) throws IOException;

	public void insertaElemento(float obj) throws IOException;;

	public void insertaElemento(double obj) throws IOException;;

	public void insertaElemento(String obj) throws IOException;;

	public void insertaElemento(boolean obj) throws IOException;;

	public void cierraElemento() throws IOException;
}
