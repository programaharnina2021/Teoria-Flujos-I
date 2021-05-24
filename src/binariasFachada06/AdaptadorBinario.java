package binariasFachada06;

import java.io.FileOutputStream;
import java.util.ArrayList;

public class AdaptadorBinario extends Adaptador{

	public boolean grabar(FileOutputStream flujoW, Object objeto, IAdecuador adecuador) {
		return super.grabar(flujoW, objeto, adecuador);
	}

	@Override
	public ArrayList leer(String path, IAdecuador adecuador) {
		// TODO Auto-generated method stub
		return null;
	}

}
