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

public class InversorCadena {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese una cadena de texto: ");
        String texto = sc.nextLine();

        String invertida = "";
        for (int i = texto.length() - 1; i >= 0; i--) {
            invertida += texto.charAt(i);
        }

        System.out.println("Texto invertido: " + invertida);

        sc.close();
    }
}
