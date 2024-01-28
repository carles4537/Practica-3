public class Main {
    public static void main(String[] args) {
        int edad = 28;
        String nombre = "Alumno";
        Persona Dani=new Persona("Dani",35,"11234567A");
        if (Persona.getEdad() > edad){
            System.out.println(Persona.getNombre() + "es mayor que " + nombre);
        } else if (Persona.getEdad() == edad){
            System.out.println(Persona.getNombre() + " y " + nombre + " tienen la misma edad");
        } else {
            System.out.println(Persona.getNombre() + "es menor que " + nombre);
        };
    }
}