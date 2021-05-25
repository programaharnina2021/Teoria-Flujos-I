package serializacionListas08;

import java.util.ArrayList;

public class ProbarGuardarListas {

	public static void main(String[] args) {
		//Solo funciona una vez, en cada prueba debes borrar clientes.dat
		ArrayList<Cliente> clientes = new ArrayList<>();
		clientes.add(new Cliente(1, "1", true, 3));
		AlmacenUnico almacen = new AlmacenUnico("clientes.dat");
		System.out.println(almacen.almacena(clientes));
		Cliente cliente = new Cliente(2, "2", true, 3);
		// si anadimos un cliente debemos guardar inmediatamente
		guardarEnLista(clientes, almacen, cliente);
		ArrayList<Cliente> otra=(ArrayList<Cliente>) almacen.recuperar();
	}

	private static boolean guardarEnLista(ArrayList<Cliente> clientes, AlmacenUnico almacen, Cliente cliente) {
		boolean retorno=true;
		clientes.add(cliente);
		if(!almacen.almacena(clientes)){
			clientes.remove(cliente);
			retorno=false;
		}
		return retorno;
	}

}
