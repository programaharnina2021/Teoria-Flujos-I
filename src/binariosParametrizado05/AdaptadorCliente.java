package binariosParametrizado05;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;

public class AdaptadorCliente implements IAdaptador<Cliente> {
	private Cliente agregarCliente(DataInputStream conversorR) {
		Cliente cliente = null;
		try {
			cliente = new Cliente(conversorR.readInt(), conversorR.readUTF(), conversorR.readBoolean(),
					conversorR.readFloat());
		} catch (IOException e) {
		}
		return cliente;
	}

	@Override
	public ArrayList<Cliente> leer(String path) {
		assert path != null;
		File file = new File(path);
		ArrayList<Cliente> clientes = new ArrayList<>();
		FileInputStream flujoR = null;
		if (file.exists()) {
			try {
				flujoR = new FileInputStream(file);
				DataInputStream conversorR = new DataInputStream(flujoR);
				Cliente cliente = agregarCliente(conversorR);
				while (cliente != null) {
					clientes.add(cliente);
					cliente = agregarCliente(conversorR);
				}
			} catch (IOException e) {
				e.printStackTrace();
			}

			try {
				flujoR.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return clientes;
	}

	@Override
	public boolean grabar(String path, Cliente objeto) {
		assert path != null && objeto != null;
		File file = new File(path);
		boolean retorno = false;
		FileOutputStream flujoW = null;
		try {
			flujoW = new FileOutputStream(file, true);
			DataOutputStream conversorW = new DataOutputStream(flujoW);
			conversorW.writeInt(objeto.getNumero());
			conversorW.writeUTF(objeto.getNombre());
			conversorW.writeBoolean(objeto.isPreferente());
			conversorW.writeFloat(objeto.getSaldo());
			retorno = true;
		} catch (IOException e) {
			e.printStackTrace();
		}
		try {
			flujoW.close();
		} catch (IOException e1) {
			e1.printStackTrace();
		}
		return retorno;
	}

}
