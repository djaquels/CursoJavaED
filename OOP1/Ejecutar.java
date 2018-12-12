class Ejecutar{
    public static void main(String[] args){
        Persona persona = new Persona();
        Persona persona2 = new Persona("Mauro Icardi");
        persona.setNombre("Hirving Lozano");
        persona.setEdad(25);
        persona.peso = 67f;
        persona.estatura = 1.78f;
        persona.hablar();
        System.out.println("Hola mi nombre es: " + persona.getNombre());
        System.out.println("Mi edad es:" + persona.getEdad());
        System.out.println("Hola mi nombre es: " + persona2.getNombre());
    }
}