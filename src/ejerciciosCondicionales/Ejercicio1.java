package ejerciciosCondicionales;

import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num1, num2, num3;

        // declaramos números enteros
        System.out.println("Ingrese el primer número entero:");
        num1 = sc.nextInt();
        System.out.println("Ingrese el segundo número entero:");
        num2 = sc.nextInt();
        System.out.println("Ingrese el tercer número entero:");
        num3 = sc.nextInt();

        // comparamos números enteros
        if (num1 > num2 && num1 > num3){
            System.out.println("El primer número entero es mayor: " + num1);
        } else if (num2 > num1 && num2 > num3){
            System.out.println("El segundo número entero es mayor: " + num2);
        } else{ //
            System.out.println("El tercer número entero es mayor: " + num3);
        }
    }
}