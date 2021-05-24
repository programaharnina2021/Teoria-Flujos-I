package binariasFachada06;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;

public class Fachada {
//simplifica el acceso a un sistema complejo
	public boolean graba(Cliente cliente) {
		Adaptador adaptadorBinario=new AdaptadorBinario();
		String path = "./cliente.cli";	
		FileOutputStream flujoW = null;
		try {
			flujoW = new FileOutputStream(path);
			return adaptadorBinario.grabar(flujoW, cliente, new AdecuadorClienteBinario());
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		return false;
	}
	
	public boolean graba(Articulo articulo) {
		Adaptador adaptadorTexto=new AdaptadorText();
		String path = "./articulo.cli";	
		FileWriter flujoW;
		try {
			flujoW = new FileWriter(path);
			return adaptadorTexto.grabar(flujoW, articulo, new AdecuadorArticuloTexto());
		} catch (IOException e) {
			e.printStackTrace();
		}
		return false;
	}
}
