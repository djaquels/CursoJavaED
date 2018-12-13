package paquete_b;
import paquete_a.Modificadores;
public class EnOtroPaquete{
    public static void main(String[] args){
    Modificadores m = new Modificadores();
    m.publico = "Accediendo Desde Otro Paquete";
    System.out.println(m.publico);
    }
}
