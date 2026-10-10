package com.mycompany.condicionais;
import java.util.Scanner;

/**
 *
 * @author Daniel
 */
public class Condicionais {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Digite o seu nome:");
        String nome = scanner.nextLine();
        
        if(nome.equals("Daniel")){
            System.out.println("Pode passar!");
            
        }
        else if(nome.equals("Lucas")){
            System.out.println("Pode passar!");   
        }
        else if(nome.equals("Nathan")){
            System.out.println("Pode passar!");
        }
        else if(nome.equals("Willgner")){
            System.out.println("Pode passar!");
        }
        else{
            System.out.println("Você está proibido de passar!");
        }
    }
}
