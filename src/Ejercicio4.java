package src;
import java.util.*;

public class Ejercicio4{
	public static void main(String[] args) {
		Ejercicio4 ej = new	Ejercicio4();
	}

	int[] numeros = new int[10];

	public Ejercicio4(){
		
	 	pedirDatos(numeros);
		mostrarDatos(numeros);

	}

	public static void pedirDatos(int[] numeros)
	{
	 System.out.print("Ingresa 5 elementos: ");
	 for (int i = 0; i < 5; i++)
	 {
		 numeros[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	 }
	}
	public static int determinarMayor(int[] numeros)
	{
	 int mayor = numeros[0];
	 for (int i = 0; i < 5; i++)
	 {
	  if (mayor < numeros[i])
	  {
		  mayor = numeros[i];
	  }
	 }
	 return mayor;
	}
	public static void mostrarDatos(int[] numeros)
	{
	 int mayor = determinarMayor(numeros);
	 int distancia = 0;
	 for (int i = 0; i < 5; i++)
	 {
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