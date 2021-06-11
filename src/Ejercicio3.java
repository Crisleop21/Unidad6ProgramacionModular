package src;
import java.util.*;

public class Ejercicio3{
	public static void main(String[] args) {
		//definimos variables
	Scanner scanner = new Scanner(System.in);
	int [] numeros = new int[8];
	int numIngresado;
	boolean valor;

		System.out.println("Ingrese 8 numeros enteros: ");
			for (int i = 0; i < 8 ; i++ ) {
				numeros[i]= scanner.nextInt();

			}
		System.out.println("Ingrese un N a buscar en el vector: ");
		numIngresado = scanner.nextInt();
		valor = buscarNum(numeros, numIngresado);
	 	
	 	if (valor != false){
			 System.out.println("Valor encontrado!!!");
		 }
	 	else{
			 System.out.println("No se encontro valor!!!");
	 	}
	}
	
	public static boolean buscarNum(int [] numeros, int valor){
		for (int i = 0; i<8 ; i++ ) {
			if (valor == numeros[i]) {
				return true;
			}
		}
		return false;
	}
}