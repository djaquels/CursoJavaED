import java.util.Scanner;

class LeerTeclado {

  public static void main(String[] args){
    Scanner deTeclado = new Scanner(System.in);
    String nombre;
    System.out.println("Por favor digite su nombre:");
    nombre = deTeclado.nextLine();
    System.out.println("Hola "+nombre);
  }
}
