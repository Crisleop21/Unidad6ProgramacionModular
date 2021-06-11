package src;
import java.util.*;
import java.math.*;

public class Ejercicio7{
	public static void main(String[] args) {
		Ejercicio7 ej = new Ejercicio7();
	}

	int [][] arreglo = new int [4][3];


	public Ejercicio7(){
		rellenarArreglo();
		System.out.println("\nMatriz:");
		mostraraArreglo(arreglo);
		int suma = sumaPar(arreglo);
        System.out.println("\nLa suma es: " + suma+"\n");

	}

	public void rellenarArreglo() {
		for(int i=0 ; i<4 ; i++){
			for(int j=0;j<3 ; j++){
				arreglo[i][j]=(int)(Math.random()*555+1);
			}
		}
	}

	
	public int sumaPar(int [][] numeros){
		int sumatoria=0;
        for (int i = 0; i < numeros.length; i++) {
            for (int j = 0; j < numeros.length-1; j++) {
                if (i%2 == 0) {
                    sumatoria += numeros[i][j];
                }
            }
        }
        return sumatoria;
	}

	public void mostraraArreglo(int [][] numeros){
	 	System.out.println();
        for (int i = 0; i < numeros.length; i++) {
            for (int j = 0; j < numeros.length-1; j++) {
                System.out.print(numeros[i][j]+"  ");
            }
            System.out.println();
        }
	}
}