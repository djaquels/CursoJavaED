import java.util.Scanner;

class TriangulosReto {
    public static void main(String[] args){
    Scanner tecladoI = new Scanner(System.in);
    int dimension = 0; // profundidad de los triangulos
    int filas,columnas; // variables de iteracion
    System.out.println("Ingresa Dimension de los triangulos:");
    dimension = tecladoI.nextInt();
    for(filas = 0 ; filas <= dimension; filas++){
     // nueva fila
     for( columnas = 0; columnas < filas;columnas++){
         System.out.print("*");
     }
     System.out.println("");
 	    
    }

   }

}
