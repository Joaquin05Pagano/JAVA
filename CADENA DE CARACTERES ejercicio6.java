import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] palabras = new String[5];

        System.out.println("Ingresa 5 palabras:");

        for (int i = 0; i < 5; i++) {
            System.out.print("Palabra " + (i + 1) + ": ");
            palabras[i] = scanner.nextLine();
        }

        String palabraMasLarga = encontrarPalabraMasLarga(palabras);
        System.out.println("La palabra más larga es: " + palabraMasLarga);
    }

    public static String encontrarPalabraMasLarga(String[] palabras) {
        String palabraMasLarga = palabras[0];

        for (int i = 1; i < palabras.length; i++) {
            if (palabras[i].length() > palabraMasLarga.length()) {
                palabraMasLarga = palabras[i];
            }
        }

        return palabraMasLarga;
    }
}
