/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MisWrappers;

import java.util.Scanner;

/**
 *
 * @author daniel
 */
public class Wrappers {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String entrada;
        int a;
        entrada = teclado.nextLine();
        a = Integer.parseInt(entrada);
        System.out.println("N: "+a);
    }
    
}
