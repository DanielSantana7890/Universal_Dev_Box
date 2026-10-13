package com.mycompany.divisao;
import java.util.Scanner;

/**
 *
 * @author DanielSantana
 */
public class Divisao {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite um número:");
        int num1 = scanner.nextInt();
        System.out.print("Digite outro número:");
        int num2 = scanner.nextInt();
        
        int result = num1 / num2;
        
        System.out.println("A divisão do número "+num1+"/"+num2+" = "+result);
    }
}
