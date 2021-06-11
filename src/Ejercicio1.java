package src;
import java.util.*;

public class Ejercicio1{
	public static void main(String[] args) {
		Ejercicio1 ej = new	Ejercicio1();
	}

	//definimos arreglos e inicializamos scanner
	Scanner scanner = new Scanner(System.in);
	int [] arreglo = new int[5];
	
	public Ejercicio1(){
		for (int i = 0; i<5 ; i++) {
			pedirValor(i);				
			}	

			for (int i = 0 ; i<5 ; i++) {
				mostrarDato(i);				
			}
	}
	
	public 	void mostrarDato(int numero){
		System.out.println("El indice es "+numero+" el valor es: "+arreglo[numero]);
	}

	public void pedirValor(int numero){
		System.out.println("\n Ingrese el valor No. "+numero+": ");
		arreglo[numero] = scanner.nextInt();

	}
}

	