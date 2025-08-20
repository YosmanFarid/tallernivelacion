/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tallernivelacion;

/**
 *
 * @author yosman murillo
 */
import java.util.Scanner;

public class CalculadoraBasica {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double num1, num2, resultado;
        int opcion;

        System.out.println("=== Calculadora Básica ===");
        System.out.print("Ingrese el primer número: ");
        num1 = sc.nextDouble();

        System.out.print("Ingrese el segundo número: ");
        num2 = sc.nextDouble();

        System.out.println("Seleccione una operación:");
        System.out.println("1. Suma");
        System.out.println("2. Resta");
        System.out.println("3. Multiplicación");
        System.out.println("4. División");
        opcion = sc.nextInt();

        switch(opcion) {
            case 1: 
                resultado = num1 + num2;
                System.out.println("Resultado: " + resultado);
                break;
            case 2: 
                resultado = num1 - num2;
                System.out.println("Resultado: " + resultado);
                break;
            case 3: 
                resultado = num1 * num2;
                System.out.println("Resultado: " + resultado);
                break;
            case 4: 
                if(num2 != 0) {
                    resultado = num1 / num2;
                    System.out.println("Resultado: " + resultado);
                } else {
                    System.out.println("Error: No se puede dividir entre 0.");
                }
                break;
            default: 
                System.out.println("Opción no válida.");
        }

        sc.close();
    }
}
