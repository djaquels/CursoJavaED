class Ejecutar{
    public static void main(String[] args){
        Persona persona = new Persona();
        persona.setNombre("Hirving Lozano");
        persona.edad = 23;
        persona.peso = 67f;
        persona.estatura = 1.78f;
        persona.hablar();
        System.out.println("Hola mi nombre es: " + persona.getNombre());
    }
}