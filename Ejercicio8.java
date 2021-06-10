import java.util.*;
public class Ejercicio8 {

	public static void main(String [] args){

		int aleatorio;
		char opciones;

		Scanner entrada = new Scanner(System.in);


		 	 opciones = 'a'; 

	 	while ( opciones == 'a' ){

	 		System.out.println (" Multiplos de 5");
	 		aleatorio = (int)(Math.random()*50+1);

	 		System.out.println( aleatorio*5);
	 		System.out.println (" a.- Continuar \n s.- Salir ");
	 		opciones = entrada.next().charAt(0);
	 	}
	}
}