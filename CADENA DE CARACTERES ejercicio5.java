import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio5 {
    public static boolean sonAnagramas(String cadena1, String cadena2) {
        // Eliminar espacios en blanco y convertir a minúsculas
        cadena1 = cadena1.replaceAll(" ", "").toLowerCase();
        cadena2 = cadena2.replaceAll(" ", "").toLowerCase();

        // Verificar si tienen la misma longitud
        if (cadena1.length() != cadena2.length()) {
            return false;
        }

        // Convertir cadenas a arreglos de caracteres y ordenarlos
        char[] arrCadena1 = cadena1.toCharArray();
        char[] arrCadena2 = cadena2.toCharArray();
        Arrays.sort(arrCadena1);
        Arrays.sort(arrCadena2);

        // Verificar si los arreglos son iguales
        return Arrays.equals(arrCadena1, arrCadena2);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa la primera cadena: ");
        String cadena1 = scanner.nextLine();

        System.out.print("Ingresa la segunda cadena: ");
        String cadena2 = scanner.nextLine();

        if (sonAnagramas(cadena1, cadena2)) {
            System.out.println("¡Las cadenas son anagramas!");
        } else {
            System.out.println("Las cadenas no son anagramas.");
        }
    }
}
