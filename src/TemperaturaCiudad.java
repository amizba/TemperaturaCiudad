/**
* Aprende Java desde cero (https://empezandojava.blogspot.com)
*
*
* @author Amparo Izquierdo Ba�ez
* @mail amizba@gmail.com
*/
import java.util.Scanner;
public class TemperaturaCiudad {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("1. Primavera");
		System.out.println("2. Verano");
		System.out.println("3. Oto�o");
		System.out.println("4. Invierno");
		System.out.print("Seleccione la estaci�n del a�o (1-4): ");
		int estacion = sc.nextInt();
		int temperaturaMinima = 0;
		int temperaturaMaxima = 0;
		String cielo = "";
		switch(estacion) {
		case 1: // Primavera
			temperaturaMinima = (int)(Math.random() * 16 + 15);
			temperaturaMaxima = (int)(Math.random() * 16 + 15);
			cielo = Math.random() <= 0.6 ? "Soleado" : "Nublado";
			break;
		case 2: // Verano
			temperaturaMinima = (int)(Math.random() * 21 + 25);
			temperaturaMaxima = (int)(Math.random() * 21 + 25);
			cielo = Math.random() <= 0.8 ? "Soleado" : "Nublado";
			break;
		case 3: // Oto�o
			temperaturaMinima = (int)(Math.random() * 11 + 20);
			temperaturaMaxima = (int)(Math.random() * 11 + 20);
			cielo = Math.random() <= 0.4 ? "Soleado" : "Nublado";
			break;
		case 4: // Invierno
			temperaturaMinima = (int)(Math.random() * 26);
			temperaturaMaxima = (int)(Math.random() * 26);
			cielo = Math.random() <= 0.2 ? "Soleado" : "Nublado";
			break;
		default:
			System.out.println("La estaci�n seleccionada no es correcta.");
		}
		// Si la m�nima es mayor, se intercambian las temperaturas
		if (temperaturaMinima > temperaturaMaxima) {
			int aux = temperaturaMinima;
			temperaturaMinima = temperaturaMaxima;
			temperaturaMaxima = aux;
		}
		System.out.println("Previsi�n del tiempo para ma�ana");
		System.out.println("--------------------------------");
		System.out.println("Temperatura m�nima: " + temperaturaMinima);
		System.out.println("Temperatura m�xima: " + temperaturaMaxima);
		System.out.println(cielo);
	}
}
