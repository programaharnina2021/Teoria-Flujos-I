package agregarObjetos;

import binariasFachada06.Cliente;
import serializacionmultiobjetos09.Almacen;

public class Principal {
	public static void main(String[] args) {
		Cliente federico = new Cliente(10, "fede", true, 34f);
		Cliente current = null;
		Almacen almacen = new Almacen("fede.data");
		almacen.almacena(federico);
		current = (Cliente) almacen.recuperar(0);
		System.out.println(current.getNombre());
		Cliente federicoII = new Cliente(10, "pedro", true, 34f);
		almacen.almacena(federicoII);
		current = (Cliente) almacen.recuperar(1);
		System.out.println(current.getNombre());
		
	}
}
