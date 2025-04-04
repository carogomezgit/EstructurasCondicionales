package ejerciciosCondicionales;

import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String operacion;

        int num1, num2, total;

        System.out.println("Ingrese el primer número:");
        num1 = sc.nextInt();
        System.out.println("Ingrese el segundo número:");
        num2 = sc.nextInt();

        System.out.println("Elige la operación a realizar: \n 1. Suma (s) \n 2. Resta (r) \n 3. Multiplicación (m) \n 4. División (d)");
        operacion = sc.next();

        // usamos switch para condicionales múltiples
        switch (operacion){
            case "s":
                total = num1 + num2;
                System.out.println("La suma de " + num1 + " y " + num2 + " es: " + total);
                break;
            case "r":
                total = num1 - num2;
                System.out.println("La resta de " + num1 + " y " + num2 + " es: " + total);
                break;
            case "m":
                total = num1 * num2;
                System.out.println("La multiplicación de " + num1 + " y " + num2 + " es: " + total);
                break;
            case "d":
                total = num1 / num2;
                System.out.println("La división de " + num1 + " y " + num2 + " es: " + total);
                break;
        }

    }
}