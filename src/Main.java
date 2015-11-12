import java.util.Scanner;

public class Main {
	//esto es una prueba de comentario
	//esto es una segunda línea de comentario
	/*
	 * Esto es bloque de comentarios
	 * De varias líneas
	 */
	/*para ejecutar código hay que poner esto*/
	public static void main(String[] args){
		
		int num1; //variable de tipo entero
		float num2; //tipo flotante
		num1 = 90;
		int num3 = 45;
		num2 = 10.1f; //poner la f obligatiorio
		//sacar por pantalla
		System.out.println(num1);
		System.out.println(num3);
		System.out.println(num2);
		
		int numerof = 10/3;
		System.out.println(numerof);
		//sale entero, cuidado con los tipos
		float numerof2 = 10/3f;
		System.out.println(numerof2);
		
		//int numerazo = 7543578758575 --> fuera de rango
		
		double num4 = 10.3456; //poner la d es opcional
		double num5 = 10.4432d;
		System.out.println(num4);
		System.out.println(num5);
		
		String cadena1 = "cadena de tezto";
		System.out.println(cadena1);
		String cadena2 = "\"1234567\"";
		System.out.println(cadena2);
		
		//Leer desde el teclado
		System.out.println("Escribe un número");
		Scanner leer = new Scanner(System.in);
		int numerico = leer.nextInt(); 
		//hay que escribir un entero o dara error
		System.out.println(numerico);
		
		System.out.println("Escribe tu nombre");
		Scanner leer2 = new Scanner(System.in);
		String nombrecico = leer.next();
		System.out.println(nombrecico);
		
		
	}
	
}
