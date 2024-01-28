public class Persona {
    private static String nombre;
    private static int edad;
    private  String DNI;
    public Persona(String nuevoNombre,int nuevaEdad,String nuevoDni){
        nombre=nuevoNombre;
        edad=nuevaEdad;
        DNI= nuevoDni;
    }
    public Persona(){}



    public static String getNombre(){
        return nombre;
    }
    public void setNombre(String nuevoNombre){
        nombre=nuevoNombre;
    }
    public static int getEdad(){
        return edad;
    }
   public void setEdad(int nuevaEdad){
       edad=nuevaEdad;
   }
   public String getDNI(){
        return DNI;
    }

    public void setDNI(String NuevoDni) {
        DNI = NuevoDni;
    }

}
