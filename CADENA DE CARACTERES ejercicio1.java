import java.util.Scanner;

public class Ejercicio1 {

	   public static void main(String[] args) {
			
		
	   String nombre;
	   
	   // Crear un objeto Scanner para leer la entrada del usuario
	   Scanner scanner = new Scanner(System.in);
	        
	   // Pedir al usuario que ingrese su nombre
	   System.out.print("Por favor, ingresa tu nombre: ");
	   nombre = scanner.nextLine();
	        
	   System.out.println("Hola, " + nombre);
	        scanner.close();
	   }
}
