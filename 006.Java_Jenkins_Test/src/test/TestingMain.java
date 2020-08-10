package test;

import static org.junit.Assert.*;

import org.junit.Test;

import main.Main;

public class TestingMain {

	@Test
	public void test() {
		String[] params = new String[3];

		params[0] = "001";
		params[1] = "002";
		params[2] = "003";
		
		Main.main(params);
	}

	@Test
	public void testSuma() {
		int resultado = Main.suma(5, 6);
		
		assertTrue(resultado == 11);
	}

	@Test
	public void testResta() {

		int resultado = Main.resta(22, 10);
		
		assertTrue(resultado == 12);
	}

	@Test
	public void testMultiplicacion() {
		int resultado = Main.multiplicacion(4, 12);
		
		assertTrue(resultado == 48);
	}
	
	
}
