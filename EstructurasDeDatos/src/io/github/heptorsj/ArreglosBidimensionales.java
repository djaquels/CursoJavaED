/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package io.github.heptorsj;

/**
 *
 * @author daniel
 */
public class ArreglosBidimensionales {
    public static void main(String[] args) {
        System.out.println("Arreglos Multidimensionales 2D");
        int b[][];
        b = new int[3][];
        b[0] = new int[3];
        b[1] = new int[1];
        b[2] = new int[6];
        for(int i=0; i < b.length;i++){
          for(int j =0; j< b[i].length;j++){
             b[i][j] = j;
             System.out.println("b"+ i +" "+ j +"= "+ b[i][j]);
          }
        }
        
        
                
    }
    
}
