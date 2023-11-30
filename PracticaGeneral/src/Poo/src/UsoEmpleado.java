import java.util.*;

public class UsoEmpleado {
    public static void main(String[] args) throws Exception {
        /*static en variable :Que comparta la variable a todos los objetos perteneciente
        de la clase "Empleado" */
        Jefatura jefe_RRHH = new Jefatura("Mi",100,2022,02,15);
        jefe_RRHH.estableceIncentivo(10);

        Empleado[] misempleado = new Empleado[4];
        misempleado[0] = new Empleado("Ma",500,2022,01,15);
        misempleado[1] = new Empleado("Me",600,2020,05,10);  
        misempleado[2] = new Empleado("Lu"); 
        misempleado[3] = jefe_RRHH; 
        
        
        Jefatura jefa_Finansas = (Jefatura) misempleado[3];
        jefa_Finansas.estableceIncentivo(55000);
        System.out.println("El jefe " + jefa_Finansas.GetNom() +
        " tiene un bonus de: " +  jefa_Finansas.establece_bonus(500));
        System.out.println(misempleado[1].GetNom() + "tiene un bonous de : " + misempleado[1].establece_bonus(500));

        /*Empleado director_comercial = new Jefatura("Mu",800,2020,04,15);

        Comparable ejemplo = new Empleado("La",1000,2022,15,01);

        if(director_comercial instanceof Empleado){
            System.out.println("Es de tipo Jefatura");
        }
        if(ejemplo instanceof Comparable){
            System.out.println("Implementa la interfaz comparable");}*/
        

        /*Director dir = new Director("Mo",50,2022,01,15);
        System.out.println(dir.GetNom());
        dir.SubeSueldo(10);
        dir.estableceIncentivo(50);
        System.out.println(dir.GetSue());*/
        
       

        /*for(int i=0;i<misempleado.length;i++){
            misempleado[i].SubeSueldo(5);
            System.out.print(misempleado[i].GetNom() + " " + 
            "Sueldo actual: " + misempleado[i].GetSue());
            
            System.out.println(" ");}*/
        
        
        System.out.println(jefa_Finansas.tomar_decisiones("Dar mas dias de vacaciones a los empleados"));
        Arrays.sort(misempleado);


        for(Empleado e: misempleado){
            e.SubeSueldo(5);
            System.out.print(e.GetNom() + " " + 
            "Sueldo actual: " + e.GetSue() + "\n" + 
            e.GetSeccion());
    
            System.out.println(" ");
        }
        System.out.println(Empleado.GetIdSiguiente());



    }
}

class Empleado implements Comparable,Trabajadores{
    private String seccion;
    private final String nom;
    private double sue;
    private Date altaContrato;
    private int Id;
    // Propiedad de la class , eso indica que todos los objectos creado van a tener el misma propiedad(compartida).
    private static int IdSiguiente = 1;


    public Empleado(String nombre,double sueldo,int agno,int mes ,int dia){

        nom = nombre;
        sue = sueldo;

        GregorianCalendar calendario = new GregorianCalendar(agno,(mes-1),dia);
        altaContrato = calendario.getTime();

        seccion = "Administracion";
        Id = IdSiguiente;
        IdSiguiente++;
        
    }
    public double establece_bonus(double gratificacion){
        return Trabajadores.bonus_base + gratificacion;
    }


    public int compareTo(Object miObjeto){
        Empleado otroEmpleado = (Empleado)miObjeto;
        if(this.Id<otroEmpleado.Id){
            return -1;
        }
        if(this.sue>otroEmpleado.sue){
            return 1;
        }
        return 0;
        
    }


    public Empleado(String nom){
        // En constructor: el this llama al otro constructor de la clase.
        this(nom,3000,2000,01,01);
        seccion = "Contador";
        
       
    }

    public String GetNom(){
        return "Mi nombre es: " + nom + Id;
    }
    public double GetSue(){
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
        return "El nombre es: " + nom + " y la seccion es " + seccion + " " + Id;
    }

    public static String GetIdSiguiente(){
        return "El Id Siguiente es: " + IdSiguiente;
    
    }}


class Jefatura extends Empleado implements Jefes{

    private double incentivo;

    public Jefatura(String nom,double sue,int agno,int mes,int dia){
        super(nom,sue,agno,mes,dia);
    }

    public void estableceIncentivo(double b){
        incentivo = b;
    }   
    
    public double GetSue(){
        
        double sueldoJefe = super.GetSue();
        return sueldoJefe + incentivo;         
    }
    
    public String tomar_decisiones(String decision){
        return "Un miembro de la direccion ha tomado la decision de: " + decision;
    }

    public double establece_bonus(double gratificacion){
        double prima = 2000;
        return Trabajadores.bonus_base + gratificacion + prima;
    }

}


/*class Director extends Jefatura{
    
    public Director(String nom,double sue,int agno,int mes,int dia){
        super(nom, sue, agno, mes, dia);
    }

}*/

//https://www.youtube.com/watch?v=0fifCsOYbXw&list=PLU8oAlHdN5BktAXdEVCLUYzvDyqRQJ2lk&index=55


