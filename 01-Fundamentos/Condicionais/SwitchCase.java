package com.mycompany.switchcase;
import java.util.Scanner;

/**
 *
 * @author Daniel
 */
public class SwitchCase {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Escolha um numero:");
        int esco = scanner.nextInt();
        
        switch(esco){
            case 1:
                System.out.println("Você escolheu o 1");
                break;
            case 2:
                System.out.println("Você escolheu o 2");
                break;
        }
        
    }
}
