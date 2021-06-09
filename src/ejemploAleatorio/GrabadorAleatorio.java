package ejemploAleatorio;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.RandomAccessFile;

public class GrabadorAleatorio<T,K extends Comparable<K>> implements GrabadorObjetos<T> {
	private RandomAccessFile flujoAleatorio;
	private MapaIntervalo<K> mapaIntervalo;

	@Override
	public void iniciarOperacion(String path) throws IOException {
		flujoAleatorio = new RandomAccessFile(path, "rw");
		mapaIntervalo = new MapaIntervalo();
	}

	@Override
	public void insertaElemento(int obj) throws IOException {
		flujoAleatorio.writeInt(obj);

	}

	@Override
	public void insertaElemento(float obj) throws IOException {
		// TODO Auto-generated method stub

	}

	@Override
	public void insertaElemento(double obj) throws IOException {
		// TODO Auto-generated method stub

	}

	@Override
	public void insertaElemento(String obj) throws IOException {
		// TODO Auto-generated method stub

	}

	@Override
	public void insertaElemento(boolean obj) throws IOException {
		// TODO Auto-generated method stub

	}

	@Override
	public void cierraElemento() throws IOException {
		flujoAleatorio.close();

	}

	@Override
	public void inserta(Indicable obj) throws IOException {
		// creamos el flujo que convierte en tren de bytes
		ByteArrayOutputStream adaptadorByte = new ByteArrayOutputStream();
		// creamos el flujo que serializa
		ObjectOutputStream serializador = new ObjectOutputStream(adaptadorByte);
		serializador.writeObject(obj);
		// al escribir el objeto serializado sonre un adaptador bytes se convierte
		// el objeto en un tren de bytes (byteArray)
		serializador.close();
		// voy al final
		long inicio = flujoAleatorio.length();
		flujoAleatorio.seek(inicio);
		// escribo el tren de bytes en el flujo
		if (mapaIntervalo.insertar(obj, inicio, adaptadorByte.size())) {
			try {
				flujoAleatorio.write(adaptadorByte.toByteArray());
			} catch (IOException e) {
				//si estoy aqui es porque ha fallado la escritura en flujo
				//pero no ha fallado en mapa
				mapaIntervalo.borrar(obj);
			}
		}
	}
}
