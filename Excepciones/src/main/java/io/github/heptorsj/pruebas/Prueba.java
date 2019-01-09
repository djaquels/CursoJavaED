/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package io.github.heptorsj.pruebas;
import java.util.InputMismatchException;
import java.util.Scanner;
/**
 *
 * @author daniel
 */
public class Prueba {
    public static void main(String[] args) {
      Scanner teclado = new Scanner(System.in);
      int a,b,c;
       try {
        System.out.println("Digite el primer valor: ");
        a = teclado.nextInt();
        System.out.println("Digite el segundo valor: ");
        b = teclado.nextInt();
        c = a/b;
        System.out.println("El resultado es" + c);
       } catch(ArithmeticException ae){
           System.out.println("No es posible dividir entre 0");
       }catch(InputMismatchException e){
           System.out.println("Debe digitar un numero entero");
           System.out.println(e.getMessage());
       }
       
       finally {
           System.out.println("Desea otro proceso?");
       }
    }
    
}
