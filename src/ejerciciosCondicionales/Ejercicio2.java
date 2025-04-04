package ejerciciosCondicionales;

import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num1, num2, total; // variables para números enteros y total

        // declaramos números enteros
        System.out.println("Ingrese el primer número entero:");
        num1 = sc.nextInt();
        System.out.println("Ingrese el segundo número entero:");
        num2 = sc.nextInt();

        String operacion;

        System.out.println("Elije la operación a realizar \n 1. Suma \n 2. Resta \n 3. Multiplicación \n 4. División");
        operacion = sc.next(); // se define la operación
        if (operacion.equals("s")){
            total = num1 + num2;
            System.out.println("La suma de " + num1 + " y " + num2 + " es: " + total);
        } else if (operacion.equals("r")){
            total = num1 - num2;
            System.out.println("La resta de " + num1 + " y " + num2 + " es: " + total);
        } else if (operacion.equals("m")) {
            total = num1 * num2;
            System.out.println("La multiplicación de " + num1 + " y " + num2 + " es: " + total);
        } else{
            total = num1 / num2;
            System.out.println("La división de " + num1 + " y " + num2 + " es: " + total);
        }
    }
}