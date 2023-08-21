import java.util.Scanner;                                                           //libreria para el scanner

public class Ejercicio5 {                                                           //nombre de la clase
    public static void main(String[] args){                                         //inicializar la clase
        int num, acum = 0, i, cant;                                                 //declarar las variables
                                   //Inicializo el scanner
        System.out.println("Ingrese cuantos numeros quiere sumar");                 //se ingresa la cantidad de numeros a sumar
        cant = scanner.nextInt();                                                   //se ingresa el valor ingresado a la variable cant
        System.out.println("Vamos a utilizar el ciclo for para este calculo");      //
        for(i = 0; i < cant; i++){                                                  //se inicializa el ciclo "for", se iguala i a 0, ya que se quiere empezar desde 0
                                                                                    //se pone que se repita el ciclo hasta que se "i"" sea mayor a el valor que tiene la variable cant
                                                                                    //y por cada iteracion la variable i va aumentando su valor en 1
            System.out.println("Ingrese el Numero " + i + 1);                       //se pide que se ingrese el valor del primer numero a sumar
            num = scanner.nextInt();                                                //se ingresa el valor ingresado a la variable num
            acum += num;                                                            //se suman los numeros ingresados
            System.out.println("El resultado es: " + acum);                         //se muestran los resultados
        }
    }
}
