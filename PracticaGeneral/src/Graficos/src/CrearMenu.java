import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class CrearMenu {
    public static void main(String[] args){
        MenuFrame frame = new MenuFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

}
class MenuFrame extends JFrame {
    public MenuFrame(){
        setBounds(500,400,550,350);
        Lamina_Menu m = new Lamina_Menu();
        add(m);
        setVisible(true);
    }

}
class Lamina_Menu extends JPanel{
    public Lamina_Menu(){
        JMenuBar mibarra = new JMenuBar();

        JMenu archivo = new JMenu("Archivo");
        JMenu edicion = new JMenu("Edicion");
        JMenu herramientas = new JMenu("Herramientas");
        JMenu opciones = new JMenu("Opciones");

        JMenuItem guardar = new JMenuItem("Guardar");
        JMenuItem guardarcomo = new JMenuItem("Guardar Como");

        JMenuItem cortar = new JMenuItem("Cortar",new ImageIcon("bin/graficos/copiar.jpg"));
        JMenuItem copiar = new JMenuItem("Copiar");
        JMenuItem pegar = new JMenuItem("Pegar");
    
        JMenuItem generales = new JMenuItem("Generales");
        // Item de opciones:
        JMenuItem opciones1 = new JMenuItem("Opcion 1");
        JMenuItem opciones2 = new JMenuItem("Opcion 2");
        
        

        archivo.add(guardar);
        archivo.add(guardarcomo);

        edicion.add(cortar);
        edicion.add(copiar);
        edicion.add(pegar);
        edicion.addSeparator();

        opciones.add(opciones1);
        opciones.add(opciones2);
        edicion.add(opciones);


        herramientas.add(generales);

        mibarra.add(archivo);
        mibarra.add(edicion);
        mibarra.add(herramientas);
        add(mibarra);


        //https://www.youtube.com/watch?v=JEy3hb8Fpig&list=PLU8oAlHdN5BktAXdEVCLUYzvDyqRQJ2lk&index=103
    }
}
