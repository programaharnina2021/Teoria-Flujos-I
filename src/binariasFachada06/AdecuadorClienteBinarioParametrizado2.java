package binariasFachada06;

import java.io.Closeable;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.ArrayList;

public class AdecuadorClienteBinarioParametrizado2<FileOutputStream, Cliente> implements IAdecuadorParametrizado2<FileOutputStream, Cliente> {

	@Override
	public boolean graba(FileOutputStream flujoW, Cliente objeto) {
		DataOutputStream conversorW = new DataOutputStream(flujoW);
		conversorW.writeInt(objeto.getNumero());
		return false;
	}

	@Override
	public void recupera(FileOutputStream flujoR, ArrayList lista) throws IOException {
		// TODO Auto-generated method stub
		
	}

	
	}
}
