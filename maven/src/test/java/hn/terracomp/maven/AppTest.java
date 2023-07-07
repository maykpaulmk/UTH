package hn.terracomp.maven;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;


import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest{
	
	@BeforeClass
  public static void confguracioninicial () {
	  System.out.println("Metodo de tipo setup, se ejecuta antes de cada prueba");
  }
  
	@Test
  public void testsuma1() {
	  assertEquals(App.sumar(5.0, 6.0), 11.0, .000000000000001);
  }
	@Test
	public void testsuma2() {
	  assertTrue(App.sumar(4.5, 6.3) == 10.8);
  }
	
	@Test
	public void testsuma3() {
		assertTrue(App.sumar(-2.0, 3.0 ) == 1.0); 
	}
	
	@Test
	public void testsuma4() {
		assertTrue(App.sumar(-5.0, -6.00) == -11.0);		
	}
	
	@Test
	public void testsuma5() {
		assertTrue(App.sumar(0.0, 0.0) == 0.0);
	}
	
	@Test
	public void testresta1() {
		assertEquals(App.restar(2.7, 3.5), -0.8, .000000001);
	}
	
	@Test
	public void testresta2(){
		assertTrue(App.restar(5.0, 6.0) == -1.0);
	}
	@Test 
	public void testresta3() {
		assertTrue(App.restar(-2.0, -5.0) == 3.0);
	}
	
	@Test
	public void testresta4() {
		assertTrue(App.restar(2, 2) == 0.0);
	}
	
	@Test
	public void testmultiplicar1() {
		assertEquals(App.multiplicar(3.0, 4.0), 12.0, .0000001);
	}
	
	@Test
	public void testmultiplicar2() {
		assertEquals(App.multiplicar(3.0, 0.0), 0.0, .0000001);
	}
	
	@Test
	public void testmultiplicar3() {
		assertEquals(App.multiplicar(-3.0, 5.0), -15.0, .0000001);
	}
  
	@Test 
	public void testdiv1() {
		assertEquals(App.dividir(4.0, 2.0), 2.0, 000001);
	}
	
	@Test 
	public void testdiv2() {
		assertEquals(App.dividir(2.0, 4.0), 0.5, 000001);
	}
	
	@Test 
	public void testdiv3() {
		assertEquals(App.dividir(0.0, 5.0), 0.0, 000001);
	}
	
	@Test 
	public void testdiv4() {
		assertEquals(App.dividir(2.0, -2.0), 0.0, 000001);
	}
	
	@Test 
	public void testdiv5() {
		assertNull(App.dividir(4.0, 0.0));
	}
	@AfterClass
	public static void finalizacionPruebas() {
		System.out.println("Metodo de tipo Teardown, se ejecuta despues de cada prueba");
  }
}
