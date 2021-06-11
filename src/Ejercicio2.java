package src;
import java.util.*;
import java.math.*;

public class Ejercicio2{
	public static void main(String[] args) {
		Ejercicio2 ej = new Ejercicio2();

	}
	//definimos arreglos
	int [] numeros = new int[10];  

	public Ejercicio2(){
		rellenarArreglo(numeros);
		mostraraArreglo(numeros);
		mostrarMayor(numeros);

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

	public void mostrarMayor(int[] numeros){
	 	int mayor = numeros[0];
		int totalRepetidos = 0;
		
		for (int i = 0; i < 10; i++){
	  		if (mayor < numeros[i]){
		  		mayor = numeros[i];
			}
		}
	 
	 	for (int i = 0; i < 10; i++){
			if (mayor == numeros[i]){
		  		totalRepetidos++;
			}
	 	}
	 System.out.print("EL MAYOR ES: "+mayor);
	 System.out.print("\n");
	 System.out.print("Y SE REPITE "+totalRepetidos);
	 
	}

}