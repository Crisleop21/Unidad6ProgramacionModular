package src;
import java.util.*;

public class Ejercicio4{
	public static void main(String[] args) {
		Ejercicio4 ej = new	Ejercicio4();
	}

	Scanner scanner = new Scanner(System.in);
	int[] numeros = new int[10];

	public Ejercicio4(){
		rellenarArreglo(numeros);
		mostraraArreglo(numeros);
		mostrarDatos(numeros);
	}

	public void rellenarArreglo(int[] numeros){
		for (int i = 0; i<10 ; i++ ) {
			numeros[i] = (int)(Math.random()*99);
			
		}
	}

	public void mostraraArreglo(int[] numeros){
	 	for (int i = 0; i < 10; i++) {
	 		System.out.print(numeros[i]);
	  		System.out.print("\n");
	 }
	}

	public int determinarMayor(int[] numeros) {
		int mayor = numeros[0];
	 	
	 	for (int i = 0; i < 10; i++) {
			if (mayor < numeros[i]) {
		  		mayor = numeros[i];
		  	}
		}
	 	return mayor;
	}

	public void mostrarDatos(int[] numeros) {
		int mayor = determinarMayor(numeros);
	 	int distancia = 0;
	 	for (int i = 0; i < 5; i++) {
	 		 distancia = mayor - numeros[i];
			  System.out.print("La distancia que separa al ");
			  System.out.print(i + 1);
			  System.out.print(" elemento del mayor es: ");
			  System.out.print(distancia);
			  System.out.print("\n");
		}
	 System.out.print("Si la distancia es de 0, es porque ese es el elemento mayor!");
	 System.out.print("\n");
	}

}