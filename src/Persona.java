public class Persona {
    private static String nombre;
    private static int edad;
    private  String DNI;
    public Persona(String nuevoNombre,int nuevaEdad,String nuevoDni){
        Nuevonombre=nuevoNombre;
        Nuevaedad=nuevaEdad;
        DNI= nuevoDni;
    }
    public Persona(){}
    /**
     *@param no se pasa parametro
     *@return devuelve Nuevonombre valor de nombre
     */


    public static String getNombre(){
        return this Nuevonombre;
    }
    /**
     *@param param1 se le pasa el valor del nuevo nombre
     *@return no devuelve nada es un void
     */
    public void setNombre(String nuevoNombre){
        nombre=nuevoNombre;
    }
    public static int getEdad(){
        return edad;
    }
    public void setEdad(int nuevaEdad){
        this Nuevaedad=nuevaEdad;
    }
    public String getDNI(){
        return DNI;
    }

    public void setDNI(String NuevoDni) {
        DNI = NuevoDni;
    }

}