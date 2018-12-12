class Persona{
    // Atributos
    String nombre;
    int edad;
    float peso;
    float estatura;
    // MÉTODOS
    // Comportamiento
    // 1.- Modificador de acceso 2.- Tipo De Retorno 3.- Nombre
    // Constructor: 1.- Modificador de acceso 2.- Nombre de clase
    // 3.- Parametros
    public Persona(){
        nombre = "";
        edad = 0;
        peso = 0f;
        estatura = 0f;

    }
    // Sobre carga: mismo metodo con mismo nombre
    // Siempre y cuando tenga diferente numero de metodos
    public Persona(String nombre){
        this.setNombre(nombre);
    }
    void hablar(){
        System.out.println("Hola Amigo");

    }
    void comer(){
        System.out.println("Estoy Comiendo");
    }
    // Métodos Getter y Setter
    String getNombre(){
        return this.nombre;
    }
    void setNombre(String nombre){
        this.nombre = nombre;
    }
    int getEdad(){
        return edad;
    }
    void setEdad(int edad){
        if(edad > 0){
            this.edad = edad;
        }
    }

}