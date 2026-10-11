package com.mycompany.registrando_cliente;
import java.util.Scanner;

/**
 *
 * @author Daniel
 */
public class Registrando_Cliente {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Qual o seu nome completo:");
        String Nome = scanner.nextLine();
        System.out.println("Qual a sua idade:");
        int Idade = scanner.nextInt();
        
        System.out.println("O cliente "+ Nome + " de "+ Idade +" anos foi registrado no sistema com SUCESSO!");
    }
}
