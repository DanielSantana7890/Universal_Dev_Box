package com.mycompany.ternario;
import java.util.Scanner;

/**
 *
 * @author Daniel
 */
public class Ternario {

    public static void main(String[] args) {
        int num1 = 5;
        //            condicao----if--=-else
        int result = (num1 > 5)? num1: -num1;
        System.out.println("O resultado é:" + num1);
        
        System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
        
        String result2 = (num1 >= 5) ? "É maior!": "É menor!";
        System.out.println(result2);
        
        
        
    }
}
