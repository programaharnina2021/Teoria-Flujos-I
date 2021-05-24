package binarioInterface04;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.io.File;

import org.junit.Ignore;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class AdaptadorTest {
	Cliente cliente = new Cliente(1, "javierito", true, 12.5f);
	String path = "./cliente.cli";
	Articulo articulo = new Articulo();
	String pathDos = "articulo.data";
	Adaptador adaptador;
	File file = null;
	File fileArt = null;

	@BeforeEach
	void setUp() throws Exception {
		adaptador = new Adaptador();
		file = new File(path);
		fileArt = new File(pathDos);
	}

	@AfterEach
	void tearDown() throws Exception {
		file.delete();
		fileArt.delete();
	}

	@Test
	private void testArticuloGraba() {
		assertFalse(fileArt.exists());
		assertTrue(adaptador.grabar(path, articulo, new AdecuadorArticuloTexto()));
		assertTrue(fileArt.exists());
	}

	private void pruebaCreacion() {
		assertFalse(file.exists());
		assertTrue(adaptador.grabar(path, cliente, new AdecuadorClienteBinario()));
		assertTrue(file.exists());
	}

	// @Test
	@Ignore
	void testLeer() {
		// Cujmplo el requisito de que debe existir un archivo
		pruebaCreacion();
		// Hacer la prueba de leer
		assertEquals(cliente, adaptador.leer(path));

	}

	@Test
	void testGrabar() {
		pruebaCreacion();
	}

}
