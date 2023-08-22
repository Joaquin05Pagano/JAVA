import java.util.Scanner;

public class Ejercicio4 {

    public static void main(String[] args){
        int num;
        int arit;
        int acum = 0;
        int opcion = 1;
        int total;
        Scanner scanner = new Scanner(System.in);
            System.out.println("Ingrese el calculo que quiera hacer, tiene: 1 + , 2 - , 3 * , 4 /");
            arit = scanner.nextInt();
            if(arit == 1){
                int opcion1 = 1;
                System.out.println("Usted ha elegido suma");
                do {
                    System.out.println("Ingrese Numero: ");
                    num = scanner.nextInt();
                    acum = acum + num;
                    System.out.println("Para dejar de sumar ingrese 0, sino 1");
                    opcion1 = scanner.nextInt();
                    System.out.println("El resultado final es: " + acum);
                }while(opcion1 != 0);
            }
            if(arit == 2){
                int opcion1 = 1;
                System.out.println("Usted ha elegido resta");
                System.out.println("Ingrese el numero a restar");
                acum = scanner.nextInt();
                do {
                    System.out.println("Ingrese la resta: ");
                    num = scanner.nextInt();
                    acum -= num;
                    System.out.println("Para dejar de restar ingrese 0, sino 1");
                    opcion1 = scanner.nextInt();
                    System.out.println("El resultado final es: " + acum);
                }while(opcion1 != 0);
            }
            if(arit == 3){
            int opcion1 = 1;
            System.out.println("Usted ha elegido multiplicacion");
            System.out.println("Ingrese el numero a multiplicar");
            acum = scanner.nextInt();
            do {
                System.out.println("Ingrese Numero: ");
                num = scanner.nextInt();
                acum = acum * num;
                System.out.println("Para dejar de multiplicar ingrese 0, sino 1");
                opcion1 = scanner.nextInt();
                System.out.println("El resultado final es: " + acum);
            }while(opcion1 != 0);
        }
        if(arit == 4){
            int opcion1 = 1;
            System.out.println("Usted ha elegido divicion");
            System.out.println("Ingrese el numero a dividir");
            acum = scanner.nextInt();
            do {
                System.out.println("Ingrese Numero: ");
                num = scanner.nextInt();
                acum = acum / num;
                System.out.println("Para dejar de dividir ingrese 0, sino 1");
                opcion1 = scanner.nextInt();
                System.out.println("El resultado final es: " + acum);
            }while(opcion1 != 0);
        }
        scanner.close();
    }

}
