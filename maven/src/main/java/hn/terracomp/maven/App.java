package hn.terracomp.maven;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "CALCULADORA" );
        int opcion = 0;
       
        while(opcion != 5) {
        	imprimirMenu();
        	opcion = leerEnteroTeclado("");
        	Double resultado = null;
        	if(opcion == 1) {
        		resultado = sumar(leerDecimalTeclado("Número 1 a sumar:"),leerDecimalTeclado("Número 2 a sumar:"));
        	}else if(opcion == 2) {
        		resultado = restar(leerDecimalTeclado("Número 1 a restar:"),leerDecimalTeclado("Número 2 a restar:"));

        	}else if(opcion == 3) {
        		resultado = multiplicar(leerDecimalTeclado("Multiplicando:"),leerDecimalTeclado("Multiplicador:"));

        	}else if(opcion == 4) {
        		resultado = dividir(leerDecimalTeclado("Dividendo:"),leerDecimalTeclado("Divisor:"));

        	}else {
        		System.out.println("Finalizando la aplicación.");
        	}
        	System.out.println("El resultado de la operación es: "+resultado);
        }
    }

	

	private static double leerDecimalTeclado(String mensaje) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		System.out.println(mensaje);
		return teclado.nextDouble();
	}



	private static int leerEnteroTeclado(String mensaje) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		System.out.println(mensaje);
		return teclado.nextInt();
	}



	private static void imprimirMenu() {
		// TODO Auto-generated method stub
		System.out.println("..CALCULADORA..");
		System.out.println("1. SUMAR");
		System.out.println("2, RESTAR");
		System.out.println("3, MULTIPLICAR");
		System.out.println("4. DIVIDIR");
		System.out.println("5. SALIR");
		System.out.println("..ELIJA UNA OPCION..");
	}



	public static double sumar(double d, double e) {
		// TODO Auto-generated method stub
		return d+e;
	}

	public static Double restar(double d, double e) {
		// TODO Auto-generated method stub
		return d-e;
	}

	public static double multiplicar(double d, double e) {
		// TODO Auto-generated method stub
		return d*e;
	}

	public static Double dividir(double d, double e) {
		// TODO Auto-generated method stub
		Double resultado = 0.0;
		if(e == 0.0) {
			resultado = null;
			System.err.println("nose puede dividir "+d+"/"+e);
			System.err.println("no se puede dividir entre 0");
		}
		else {
			resultado = d/e;
		}
		return resultado;
	}
}
