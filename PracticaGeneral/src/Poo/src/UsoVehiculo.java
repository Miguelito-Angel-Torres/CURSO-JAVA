import javax.swing.*;
//import java.util.*;
public class UsoVehiculo {
    public static void main(String[] args) throws Exception {
        /*Coche Torito = new Coche();
        //System.out.println("Ruedas: " + Torito.ruedas);
        System.out.println(Torito.GetLargo());
        Torito.SetColor(JOptionPane.showInputDialog("Introduce color:"));
        System.out.println(Torito.GetColor());
        System.out.println(Torito.GetDataGeneral());
        Torito.configurar_asiento(JOptionPane.showInputDialog("Tiene asiento de cuero?"));
        System.out.println(Torito.GetAsientos_Cuero());
        Torito.conf_climat(JOptionPane.showInputDialog("Tiene climatizador?"));
        System.out.println(Torito.GetConf_climat());
        System.out.println(Torito.Get_C_P());
        System.out.println("El precio final del coche es: " + Torito.precio_coche());*/

        Coche coche1 = new Coche();
        coche1.SetColor("Negro");
        

        Furgoneta furgoneta1 = new Furgoneta(7,580);
        furgoneta1.SetColor("Maroon");
        System.out.println(furgoneta1.GetColor());
        System.out.println(furgoneta1.GetDatosFurgoneta());


        


    }
}
