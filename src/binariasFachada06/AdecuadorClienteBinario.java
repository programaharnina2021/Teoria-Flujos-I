package binariasFachada06;

import java.io.Closeable;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;

public class AdecuadorClienteBinario implements IAdecuador {

	@Override
	public boolean graba(Closeable flujoW, Object objeto) {
		boolean retorno = true;
		Cliente cliente = (Cliente) objeto;
		DataOutputStream conversorW = new DataOutputStream((FileOutputStream) flujoW);
		try {
			conversorW.writeInt(cliente.getNumero());
			conversorW.writeUTF(cliente.getNombre());
			conversorW.writeBoolean(cliente.isPreferente());
			conversorW.writeFloat(cliente.getSaldo());
		} catch (IOException e) {
			retorno = false;
		}
		return retorno;
	}

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
	public void recupera(Closeable flujoR, ArrayList lista) {
		DataInputStream conservorR=new DataInputStream((FileInputStream) flujoR);
		Cliente cliente = agregarCliente(conservorR);
		while (cliente != null) {
			lista.add(cliente);
			cliente = agregarCliente(conservorR);
		}
	}
}
