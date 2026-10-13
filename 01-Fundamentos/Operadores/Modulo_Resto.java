package com.mycompany.modulo_resto;
import java.util.Scanner;

/**
 *
 * @author DanielSantana
 */
public class Modulo_Resto {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("==================================");
        System.out.println("         Resto da Divisão         ");
        System.out.println("==================================");
        
        System.out.print("Digite um número:");
        int num1 = scanner.nextInt();
        System.out.print("Digite outro número:");
        int num2 = scanner.nextInt();
        
        float result = num1 % num2;
        
        System.out.println("O resto da divisão de "+num1+"/"+num2+" = "+result);
    }
}
