import java.util.Scanner;

public class Ejercicio2 {
    private static boolean Nprimo(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i * i <= num; ++i) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = 1;
        while(num != 0) {
            System.out.print("Ingrese numero (1-100), sino 0: ");
            num = scanner.nextInt();

            if (num <= 100) {
                if (Nprimo(num)) {
                    System.out.println(num + " es primo");
                } else {
                    System.out.println("El numero " + num + " no es primo");
                    System.out.println("Divisores:");

                    for (int i = 2; i <= num / 2; i++) {
                        if (num % i == 0) {
                            System.out.print(i + " ");
                        }
                    }
                }
            } else {
                System.out.println("El numero debe estar entre 1 y 100.");
            }
        }

        scanner.close();
    }
}
