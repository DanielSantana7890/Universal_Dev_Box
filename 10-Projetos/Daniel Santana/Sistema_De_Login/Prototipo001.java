package com.mycompany.sistema_de_login;
import java.util.Scanner;

/**
 *
 * @author DanielSantana
 */
public class Sistema_De_LOGIN {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        boolean cadastro = false;
        
        while(true){
            
            System.out.println("====================================");
            System.out.println("             SISTEMA                ");
            System.out.println("====================================");
            System.out.println(" 1-Cadastrar\n 2-Logar\n 3-Sair");
            System.out.println("====================================");
            
            System.out.print("Faça sua escolha:");
            
            int esco = scanner.nextInt();      
            
            int num = 1;
            
            switch(esco){
                case 1:
                    System.out.println("Você se cadastrou!");
                    cadastro = true;
                    break;
                
                case 2:
                    if(cadastro == true){
                        System.out.println("Você está logado!");
                        System.exit(0);
                    }
                    else{
                        System.out.println("Você precisa se cadastrar primeiro!");
                        break;
                    }
                                
                case 3:
                    System.out.println("Saindo do Sistema...");
                    System.exit(0);
                               
            }
        }
    }
}
