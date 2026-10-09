
package com.mycompany.projeto_java;

import java.util.Scanner;

public class Projeto_Java {

    public static void main(String[] args) {
        
        Scanner pergunta = new Scanner(System.in);
        
        System.out.println("Qual o seu nome:");
        String nome = pergunta.nextLine();
        
        
        System.out.println("Qual a sua idade:");
        int idade = pergunta.nextInt();
        
        if (nome.equals("Daniel")&& idade == 25){
            System.out.println("Você pode passar!");
        }else{
            System.out.println("Infelizmente você não pode passar!");
        }
    }
}
