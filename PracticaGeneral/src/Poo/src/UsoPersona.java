    import java.util.*;


public class UsoPersona {
    public static void main(String[] args){

        Persona [] lasPersonas =new Persona[3];
        lasPersonas[0] =new Empleado2("Xa", 200, 2002, 01, 25);
        lasPersonas[1] = new Alumno("Xe","contador");
        lasPersonas[2] = new Jefatura2("Xi", 500, 2022, 01, 15);

        for (Persona persona : lasPersonas) {
            System.out.println(persona.GetNom() + " , " + persona.GetDescripcion());
            
        }

        Empleado2 empleado1 = new Empleado2("Xa", 200, 2002, 01, 25);
        System.out.println(Empleado2.GetIdSiguiente());
        System.out.println(empleado1.GetIdSiguiente());

    }
}
abstract class Persona{
    private String nombre;
    public Persona(String nombre){
        this.nombre = nombre;
    }

    public String GetNom(){
        return "Mi nombre es:" + nombre;
    }

    public abstract String GetDescripcion();

}

class Alumno extends Persona{
    private String carrera;
    public Alumno(String nom,String carrera) {
        super(nom);
        this.carrera = carrera;
    }

    public String GetDescripcion(){
        return "El alumno esta estudiante la carrera de " + carrera;
    }
}



class Empleado2 extends Persona{
    private String seccion;
    private double sue;
    private Date altaContrato;
    private int Id;
    // Propiedad de la class , eso indica que todos los objectos creado van a tener el misma propiedad(compartida).
    private static int IdSiguiente = 1;


    public Empleado2(String nom,double sueldo,int agno,int mes ,int dia){
        super(nom);
        
        sue = sueldo;

        GregorianCalendar calendario = new GregorianCalendar(agno,(mes-1),dia);
        altaContrato = calendario.getTime();

        seccion = "Administracion";
        Id = IdSiguiente;
        IdSiguiente++;
        
    }
    
    public double 
    GetSue(){
        return sue;
    }
    public Date GetFecha(){
        return altaContrato;
    }
    public void SubeSueldo(double porcentaje){
        double aumento = sue * porcentaje/100;
        sue+=aumento;
    }
    public void CambiaSeccion(String seccion){
        this.seccion = seccion;
    }

    public String GetSeccion(){
        return "La seccion es " + seccion + " " + Id;
    }
    public static String GetPruebaIdSiguiente(){
        return "Prueba" + IdSiguiente;
    }

    public static String GetIdSiguiente(){
        String x = GetPruebaIdSiguiente();
        return x;
    
    }

    public String GetDescripcion(){
        return "Este empleado tiene un Id = " + Id + "con un sueldo=" +
        sue;
    }

}

class Jefatura2 extends Empleado2{

    private double incentivo;

    public Jefatura2(String nom,double sue,int agno,int mes,int dia){
        super(nom,sue,agno,mes,dia);
    }

    public void estableceIncentivo(double b){
        incentivo = b;
    }   
    
    public double GetSue(){
        
        double sueldoJefe = super.GetSue();
        return sueldoJefe + incentivo;         
    }

    public String GetDescripcion(){
        return "Este jefatura su nombre es: " +  super.GetNom(); 
    }

}
