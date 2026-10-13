package com.mycompany.multiplicacao;
import java.util.Scanner;

/**
 *
 * @author DanielSantana
 */
public class Multiplicacao {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("==================================");
        System.out.println("          Multiplicação           ");
        System.out.println("==================================");
        
        System.out.print("Digite um número:");
        int num1 = scanner.nextInt();
        
        System.out.print("Digite outro número:");
        int num2 = scanner.nextInt();
        
        
        int result = num1 * num2;
        
        System.out.println("A multiplicação de "+num1+" x "+num2+" = "+result);
        
        
    }
}
