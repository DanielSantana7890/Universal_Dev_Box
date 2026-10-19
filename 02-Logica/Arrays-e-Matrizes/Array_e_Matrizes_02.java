package com.mycompany.array_e_matrizes_02;
import java.util.Scanner;
import java.util.Arrays;

/**
 *
 * @author DanielSantana
 */
public class Array_e_Matrizes_02 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        
        String[] nomes = new String[3];
        
        System.out.print("Digite o primeiro nome: ");
        nomes[0] = input.nextLine();
        
        System.out.print("Digite o segundo nome: ");
        nomes[1] = input.nextLine();
        
        System.out.print("Digite o terceiro nome: ");
        nomes[2] = input.nextLine();
        
        System.out.println("Nomes: "+ Arrays.toString(nomes));
        input.close();
    }
}
