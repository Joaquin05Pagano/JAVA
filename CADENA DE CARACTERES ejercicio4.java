import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa una palabra/oracion: ");
        String istring = scanner.nextLine();
        System.out.print("Ingresa el carácter a reemplazar: ");
        char vchar = scanner.next().charAt(0);
        System.out.print("Ingresa un carácter: ");
        char nchar = scanner.next().charAt(0);

        String nstring = replaceChar(istring, vchar, nchar);
        System.out.println("oracion ingresada: " + istring);
        System.out.println("oracion final: " + nstring);

        scanner.close();
    }

    public static String replaceChar(String istring, char vchar, char nchar) {
        char[] charArray = istring.toCharArray();
        for (int i = 0; i < charArray.length; i++) {
            if (charArray[i] == vchar) {
                charArray[i] = nchar;
            }
        }
        return new String(charArray);
    }
}
