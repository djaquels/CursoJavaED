package paquete_b;
import paquete_a.Modificadores;
public class Heredada extends Modificadores {
    public void saludar(){
        protegido = "Accediendo desde otro paquete heredando";
        System.out.println(protegido); 
    }
    public static void main(String[] args) {
       Heredada m = new Heredada();
       m.saludar();
    } 

}