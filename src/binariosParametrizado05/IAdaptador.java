package binariosParametrizado05;

import java.util.ArrayList;

public interface IAdaptador<T> {
	
	public  ArrayList<T> leer(String path);

	public boolean grabar(String path, T objeto);
}
