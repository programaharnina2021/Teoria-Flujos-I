package binariasFachada06;

public class Consumidor {
	public static void main(String[] args) {
		Cliente cliente=new Cliente(1, "javierito", true, 12.5f);
		Articulo art=new Articulo(3,"brocha");
		Cancion can=new Cancion("give away",1,1);
		Fachada fachada=new Fachada();
		fachada.graba(cliente);
		fachada.graba(art);
		fachada.graba(can);
		
	}
}
