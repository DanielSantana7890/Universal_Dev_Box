package com.mycompany.condicionais;
import java.util.Scanner;

/**
 *
 * @author Daniel
 */
public class Condicionais {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Digite a sua escolha:");
        int esco = scanner.nextInt();
        
        switch(esco){
            case 1:
                System.out.println("Feito!");
        }
    }
}
