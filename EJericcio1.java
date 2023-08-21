import java.util.Scanner;

public class EJericcio1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese números del 1 al 100. Si desea finalizar, ingrese 0.");

        int numero;
        do {
            System.out.print("Ingrese un número: ");
            numero = scanner.nextInt();

            if (numero != 0) {
                System.out.println("Número ingresado: " + numero);
                if (numero % 2 == 0) {
                    System.out.println("Este número es par: " + numero);
                } else {
                    System.out.println("Este numero es impar: " + numero);
                }
            }
        } while (numero != 0);
        scanner.close();
    }
}