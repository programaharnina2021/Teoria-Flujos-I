package binariosAdaptador03;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.io.File;

import org.junit.Ignore;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class AdaptadorTest {
	Cliente cliente=new Cliente(1, "javierito", true, 12.5f);
	String path = "./cliente.cli";
	Adaptador adaptador;
	File file=null;
	
	@BeforeEach
	void setUp() throws Exception {
		adaptador=new Adaptador();
		file=new File(path);
	}

	@AfterEach
	void tearDown() throws Exception {
		file.delete();
	}

	private void pruebaCreacion() {
		assertFalse(file.exists());
		assertTrue(adaptador.grabar(path, cliente));
		assertTrue(file.exists());
	}

//	@Test
	@Ignore
	void testLeer() {
		//Cujmplo el requisito de que debe existir un archivo
		pruebaCreacion();
		//Hacer la prueba de leer
		assertEquals(cliente, adaptador.leer(path));
		
	}


	@Test
	void testGrabar() {
		pruebaCreacion();
	}

}
