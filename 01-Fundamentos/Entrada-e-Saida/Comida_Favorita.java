package com.mycompany.comida_favorita;
import java.util.Scanner;

/**
 *
 * @author Daniel
 */
public class Comida_Favorita {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Qual a sua comida favorita:");
        String pergunta1 = scanner.nextLine();
        
        System.out.println("Hmmmm... Agora que você me disse sobre sua comida favorita me deu até vontade de experimentar a famosa "+pergunta1);
        
    }
}
