package com.mycompany.somando_dois_numeros;
import java.util.Scanner;

/**
 *
 * @author Daniel
 */
public class Somando_Dois_Numeros {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("================================================");
        System.out.println("               SOMANDO 2 NUMEROS!"               );
        System.out.println("================================================");
        
        System.out.println("Digite um número:");
        int num1 = scanner.nextInt();
        System.out.println("Digite outro número:");
        int num2 = scanner.nextInt();
        int result = num1 + num2;
        System.out.println("A soma de "+num1+"+"+num2+"="+result);
    }
}
