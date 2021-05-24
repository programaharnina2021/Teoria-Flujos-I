package binariasFachada06;

import java.io.Closeable;
import java.io.IOException;
import java.util.ArrayList;

public interface IAdecuador {
	public boolean graba(Closeable flujoW, Object objeto);

	public void recupera(Closeable flujoR, ArrayList lista) throws IOException;
}
