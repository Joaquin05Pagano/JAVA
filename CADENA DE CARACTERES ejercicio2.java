import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String nombre;
		int numvocales = 0;
		
		System.out.println("Ingrese su nombre: ");
		nombre = scanner.nextLine().toLowerCase();
		
		for(int i = 0; i < nombre.length(); i++) {
			char caracter = nombre.charAt(i);
			if(caracter == 'a'|| caracter == 'e' || caracter == 'i' || caracter == 'o' || caracter == 'u') {
				numvocales++;
			}
		}
	System.out.println("La palabra " + nombre + " tiene " + numvocales + " vocales.");
	}
}
