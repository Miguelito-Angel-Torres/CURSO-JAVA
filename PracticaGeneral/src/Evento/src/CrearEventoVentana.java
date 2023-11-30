import javax.swing.*;
import java.awt.event.*;

import java.awt.*;

public class CrearEventoVentana{
    public static void main(String[] args){
        MarcoVentana mimarco = new MarcoVentana();
        //Cuando cierra la ventana , quiero que se cierre el programa
        mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mimarco.setTitle("Ventana 1 ");
        mimarco.setBounds(300,300,500,350);

        /*M_Ventana oyente_ventana = new M_Ventana();
        mimarco.addWindowListener(oyente_ventana);*/


        /*MarcoVentana mimarco2 = new MarcoVentana();
        mimarco2.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        mimarco2.setTitle("Ventana 2 ");
        mimarco2.setBounds(900,300,500,350);*/
        
    }
}
class MarcoVentana extends JFrame{
    public MarcoVentana(){
        //setTitle("Respondiendo");
        //setBounds(300, 300, 300, 300);
        setVisible(true);
        
        //M_Ventana oyente_ventana = new M_Ventana();
        //addWindowListener(oyente_ventana);
        //M_ventana oyenta_venta1 = new M_ventana();
        //addWindowListener(new M_ventana());

        /*Cambio de Estado:*/
        CambiaEstado n = new CambiaEstado();
        

        addWindowStateListener(n);
       

        
    }
}
class CambiaEstado implements WindowStateListener{

    public void windowStateChanged(WindowEvent e){
        //System.out.println("La venta ha cambiado de Estado");
        //System.out.println(e.getNewState());
        if(e.getNewState() == Frame.MAXIMIZED_BOTH){
            System.out.println("La ventana esta a pantalla completa");
        }else if(e.getNewState() == Frame.NORMAL ){
            System.out.println("La ventana esta normal");
        }else if(e.getNewState() == Frame.ICONIFIED){
            System.out.println("La ventana esta minimizada");
        }


    }
}



/*class M_Ventana implements WindowListener{

    // Metodo que se activa , como se abre la ventana
    public void windowActivated(WindowEvent e){
        System.out.println("Ventana activada");
    }

    public void windowClosed(WindowEvent e){
        System.out.println("La venta ha sido cerrando");
    }

    public void windowClosing(WindowEvent e){
        System.out.println("Cerrando Ventana");
    }

    public void windowDeactivated(WindowEvent e){
        System.out.println("Ventana desactivada");
    }

    public void windowDeiconified(WindowEvent e){
        System.out.println("Ventana restaurada");
    }

    public void windowIconified(WindowEvent e){
            System.out.println("Ventana minimizada");

    }
    public void windowOpened(WindowEvent e){
        // Este es como un arranque cuando se abre la ventana,una sola vez
        System.out.println("Ventana abierta");
    }
}*/
// Esa clase heredada contiene toda los metodos de los interfaces que hace referencia a ventana
/*class M_ventana extends WindowAdapter{
    public void windowIconified(WindowEvent e){
        System.out.println("Ventana minimizada");
    }
}*/
//https://www.youtube.com/watch?v=H_1kldp-d7I&list=PLU8oAlHdN5BktAXdEVCLUYzvDyqRQJ2lk&index=72