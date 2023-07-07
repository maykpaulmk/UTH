package hn.terracomp.calculadoraarea;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "AREA DE FIGURAS GEOMETRICAS" );
        int opcion = 0;
        double pi = 3.14;
        Double resultado = 0.00;
        
        while(opcion != 5) {
        	imprimirMenu();
        	opcion = leerEnteroTeclado("");
        	
        	if(opcion == 1) {
        		resultado = operarcr(leerDecimalTeclado("Ingrese el Radio:"), pi );
        	}else if(opcion == 2) {
        		resultado = operarcd(leerDecimalTeclado("Ingrese Lado A"), leerDecimalTeclado("Ingrese Lado B:"));

        	}else if(opcion == 3) {
        		resultado = operartr(leerDecimalTeclado("Ingrese la Base:"),leerDecimalTeclado("Ingrese la Altura:"));

        	}else if(opcion == 4) {
        		resultado = operarrc(leerDecimalTeclado("Ingrese la Base:"),leerDecimalTeclado("Ingrese la Altura:"));

        	}else {
        		System.out.println("Finalizando la aplicacion.");
        	}
        	System.out.println("El resultado de la operación es: "+resultado+" Cm2");
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
		System.out.println("**INGRESE DATOS EN CENTIMETROS**");
		System.out.println("================================");
		System.out.println("1. AREA DE CIRCULO");
		System.out.println("2, AREA DE CUADRADO");
		System.out.println("3, AREA DE TRIANGULO");
		System.out.println("4. AREA DE RECTANGULO");
		System.out.println("5. SALIR");
		System.out.println("================================");
		System.out.println("  **SELECCIONE UNA OPCION**");
	}

    public static Double operarcr(double radio, double pi) {
		return pi*radio*radio;
	}

	public static Double operarcd(double ladoa, double ladob) {
		return ladoa*ladob;
	}

	public static Double operartr(double base, double altura) {
		return base*altura/2;
	}

	public static Double operarrc(double ladoa, double ladob) {
		return ladoa*ladob;
	}
	
}
