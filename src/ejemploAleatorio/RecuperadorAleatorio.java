package ejemploAleatorio;

import java.io.ByteArrayInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.RandomAccessFile;
import java.util.ArrayList;

public class RecuperadorAleatorio<T, K  extends Comparable<K>>  implements RecuperadorObjetos<T, K> {
	RandomAccessFile randomAccessFile;
	MapaIntervalo<K> mapaIntervalo;
	
	@Override
	public boolean iniciaOperacion(String path) {
		try {
			randomAccessFile=new RandomAccessFile(path, "r");
			mapaIntervalo=new MapaIntervalo<K>();
			return true;
		} catch (FileNotFoundException e) {
			return false;
		}
	}

	@Override
	public int recuperaInt() throws IOException {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public float recuperaFloat() throws IOException {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double recuperaDouble() throws IOException {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public String recuperaString() throws IOException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean recuperaBoolean() throws IOException {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean cierraElemento()  {
		 try {
			randomAccessFile.close();
		} catch (Exception e) {
			return false;
		}
		return true;
	}

	@Override
	public T recupera(K k) throws Exception {
		Intervalo intervalo = mapaIntervalo.get(k);
		return getObject(intervalo);
	}

	private T getObject(Intervalo intervalo) throws IOException, ClassNotFoundException {
		randomAccessFile.seek(intervalo.inicio);
		byte[] lectura=new byte[(int) intervalo.getDiferencia()];
		randomAccessFile.readFully(lectura);
		ObjectInputStream ois=new ObjectInputStream(new ByteArrayInputStream(lectura));
		return (T) ois.readObject();
	}

	@Override
	public ArrayList<T> recupera() throws IOException, ClassNotFoundException {
		ArrayList<T> lista=new ArrayList<T>();
		for (Intervalo intervalo : mapaIntervalo.getTodos()) {
			lista.add(getObject(intervalo));
		}
		return lista;
	}

}
