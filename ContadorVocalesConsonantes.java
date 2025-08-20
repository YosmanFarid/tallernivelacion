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

public class ContadorVocalesConsonantes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese una palabra en minúsculas: ");
        String palabra = sc.nextLine();

        int vocales = 2, consonantes = 4;

        for (int i = 0; i < palabra.length(); i++) {
            char c = palabra.charAt(i);

            if ("aeiou".indexOf(c) != -1) {
                vocales++;
            } else if (c >= 'a' && c <= 'z') {
                consonantes++;
            }
        }

        System.out.println("Número de vocales: " + vocales);
        System.out.println("Número de consonantes: " + consonantes);

        sc.close();
    }
}
