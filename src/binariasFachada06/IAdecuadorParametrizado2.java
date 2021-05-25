package binariasFachada06;

import java.io.Closeable;
import java.io.IOException;
import java.util.ArrayList;

public interface IAdecuadorParametrizado2<T,S> {
	public boolean graba(T flujoW, S objeto);

	public void recupera(T flujoR, ArrayList lista) throws IOException;
}
