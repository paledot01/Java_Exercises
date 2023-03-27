package clases;

import static org.junit.Assert.*; // esto evita que coloquemos: "Assert." antes de cada validacion del test.
import org.junit.Test;

public class StringValidatorTest {

	@Test
	public void testEliminarEspacios () {
		System.out.println("PRIMER TEST - ESPACIOS");
		StringValidator obj = new StringValidator();
		assertEquals("KevinBasilio", obj.eliminarEspacios(" Ke vin    B asilio "));
		System.out.println("");
	}

	@Test
	public void testEliminarNumeros () {
		System.out.println("SEGUNDO TEST - NUMEROS");
		StringValidator obj = new StringValidator();
		assertEquals("KevinBasilio", obj.eliminarNumeros("Kev3in6Ba1si8li4o"));
		System.out.println("");
	}
	
	@Test
	public void testConvertirAMayusculas () {
		System.out.println("TERCER TEST - MAYUSCULAS");
		StringValidator obj = new StringValidator();
		assertEquals("KEVINBASILIO", obj.convertirAMayusculas("kEvInBasiLio"));
		System.out.println("");
	}
	
	@Test
	public void testEliminarEspaciosNumerosYConvertirAMayusculas() {
		System.out.println("EXTRA TEST - TODOS");
		StringValidator obj = new StringValidator();
		assertEquals("KEVINBASILIO", obj.aplicarLosTresMetodos(" K8 477 10 evi n ba38 si lI    67 O 85 "));
		System.out.println("");
	}
	
}
