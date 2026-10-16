package com.mycompany.arrays_e_matrizes;
import java.util.Scanner;
import java.util.Arrays;

/**
 *
 * @author DanielSantana
 */
public class Arrays_e_Matrizes {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in); // Criei um objeto de Scanner chamado input
        
        System.out.print("Digite um número[1]:");
        int n1 = input.nextInt();
        System.out.print("Digite um número[2]:");
        int n2 = input.nextInt();
        System.out.print("Digite um número[3]:");
        int n3 = input.nextInt();
        System.out.print("Digite um número[4]:");
        int n4 = input.nextInt();
        System.out.print("Digite um número[5]:");
        int n5 = input.nextInt();
        
        int[] numeros = new int[5]; // Tamanho da ARRAY = 5
        
        numeros[0] = n1; //Vai adicionar no indice 0
        numeros[1] = n2;  
        numeros[2] = n3;
        numeros[3] = n4;
        numeros[4] = n5;
        
        System.out.print("Array: ");
        System.out.println(Arrays.toString(numeros));
        
    }
}
