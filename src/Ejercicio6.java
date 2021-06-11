package src;
import java.util.*;

public class Ejercicio6{
	public static void main(String[] args) {
		Ejercicio6 ej = new	 Ejercicio6();
		ej.imprimirResultados();
	}

	int matriz[][] = {{5,6,13},{14,2,4},{21,7,6}};
	int matrizDos [][] = new int [3][3];

	public void imprimirResultados(){
		verMatriz(matriz);
		System.out.println("Los valores de la matriz se multiplicaran por 2");
		multiMatriz();
		verMatriz(matrizDos);
		System.out.println("\nResultados de la matriz multiplicada");

	}

	public void verMatriz(int [][] matriz){
		for (int i = 0; i<matriz.length ;i++ ) {
			for (int j = 0; j<matriz.length ; j++ ) {
				System.out.println(matriz[i][j]+" ");
			}
		System.out.println();
		}
	}

	public void multiMatriz(){
		for(int i=0 ; i<matriz.length ; i++){
			for(int j=0;j<matriz.length ; j++){
				matrizDos [i][j] = (matriz[i][j])*2;
			}
		}
	}
}