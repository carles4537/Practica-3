/**
 * Clase principal que contiene el método main para comparar edades.
 */
public class Main {

    /**
     * Método principal que compara la edad de una persona con una edad predefinida.
     *
     * @param args Argumentos de la línea de comandos (no utilizado en este caso).
     */
    public static void main(String[] args) {
        int edadComparacion = 28;

        String nombreComparacion = "Alumno";

        Persona dani = new Persona("Dani", 35, "11234567A");

        int edadPersona = dani.getEdad();
        String nombrePersona = dani.getNombre();

        if (edadPersona > edadComparacion) {
            System.out.println(nombrePersona + " es mayor que " + nombreComparacion);
        } else if (edadPersona == edadComparacion) {
            System.out.println(nombrePersona + " y " + nombreComparacion + " tienen la misma edad");
        } else {
            System.out.println(nombrePersona + " es menor que " + nombreComparacion);
        }
    }
}
