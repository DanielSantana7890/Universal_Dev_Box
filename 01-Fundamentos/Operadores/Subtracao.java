package com.mycompany.subtracao;
import java.util.Scanner;

/**
 *
 * @author Daniel
 */
public class Subtracao {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("==================================");
        System.out.println("            SUBTRAÇÃO             ");
        System.out.println("==================================");
        
        System.out.println("Digite um número:");
        int num1 = scanner.nextInt();
        System.out.println("Digite outro número:");
        int num2 = scanner.nextInt();
        int result = num1 - num2;
        System.out.println("A subtração dê "+num1+"-"+num2+"="+result);
    }
}
