package hn.terracomp.calculadoraarea;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest {
	@BeforeClass
    public static void confguracioninicial () {
    System.out.println("Metodo de tipo setup, se ejecuta antes de cada prueba");
	}
	
	
	/**circulo**/
	@Test
	public void testareaci1() {
	    assertEquals(App.operarcr(2.0, 3.14), 12.56, 0.0000000000001);	
	}
	@Test
	public void testareaci2() {
	    assertTrue(App.operarcr(0.00, 3.14) == 0.00);	
	}
	@Test
	public void testareaci3() {
	    assertEquals(App.operarcr(3.25, 3.14), 33.16625, 0.0000000000001);	
	}
	
	
	/**cuadrado**/
	@Test
	public void areacd1() {
		assertEquals(App.operarcd(8.00, 8.00), 64.00, .000000001);
	}
	@Test
	public void areacd2() {
		assertTrue(App.operarcd(8.00, 0.00) == 0.00);
	}
	@Test
	public void areacd3() {
		assertEquals(App.operarcd(8.00, -8.00), -64.00, .000000001);
	}
	
	
	/**triangulo**/
	@Test
	public void areactr1() {
		assertEquals(App.operartr(8.00, 7.00), 28.00, .000000001);
	}
	@Test
	public void areactr2() {
		assertTrue(App.operartr(8.00, 0.00) == 0.00);
	}
	@Test
	public void areactr3() {
		assertEquals(App.operartr(8.00, -7.00), -28.00, .000000001);
	}
	
	
	/**rectangulo**/
	@Test
	public void arearec1() {
		assertEquals(App.operarrc(6.00, 5.00), 30.00, .000000000000001);
	}
	@Test
	public void arearec2() {
		assertTrue(App.operarrc(6.00, 0.00) == 0.00);
	}
	@Test
	public void arearec3() {
		assertEquals(App.operarrc(6.00, -5.00), -30.00, .000000000000001);
	}
  
	
    @AfterClass
    public static void finalizacionPruebas() {
	System.out.println("Metodo de tipo Teardown, se ejecuta despues de cada prueba");
}
}
