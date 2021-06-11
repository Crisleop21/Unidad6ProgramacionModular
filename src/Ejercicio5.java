package src;
import java.util.*;

public class Ejercicio5{
	public static void main(String[] args) {
		Ejercicio5 ej = new Ejercicio5();
	}

	Scanner scanner = new Scanner(System.in);
	int numAlumnos = 1;
	int i;
	double suma = 0;
	double media = 0;
	double[] notas = new double[numAlumnos];
	
	public Ejercicio5(){
		iniciarArreglo(notas);
		rellenarNotas(notas);
		sumarNotas(notas);
		calcularMedia(notas);
		
	}

	public double iniciarArreglo(double[] notas){
		do {
			System.out.println("Numero de alumnos de la clase: ");
			numAlumnos = scanner.nextInt();
		} while(numAlumnos<=0);

		return numAlumnos;
	}

	public double rellenarNotas(double[] notas){
		for (i=0;i<notas.length ;i++ ) {
			System.out.println("Alumno "+(i+1)+" Nota final: ");
			notas[i] = scanner.nextDouble();
			
		}
		return notas[i];
	}

	public double sumarNotas(double[] notas){
		for (i=0; i<notas.length ; i++ ) {
			suma= suma+notas[i];		
		}
		return suma;
	}

	public double calcularMedia(double[] notas){
		media = suma/notas.length;
		System.out.println("Nota media del curso: "+media);
		return media;
	}


	
}