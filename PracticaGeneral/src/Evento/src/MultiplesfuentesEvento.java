
import javax.swing.*;
import java.awt.event.*;
import javax.swing.*;
import java.awt.*;
/*
 * setEnabled : Nos permite poner activo un fuente de evento,en funcion del objeto
 oyente.
 * isEnabled: Un metodo que sirve para preguntar si esta activado o no
 
 * Metodo: addPropertyChangedListed(oyente) Permite agregar una propiedad
  al objeto oyente (seleccionado)
 * Metodo: removePropertyChangedListed(oyente) Borrar o quitar la propiedad
  al objeto oyente (quitar)
  * putValue() nos permite almacenar parejas de clave i de valor,
  * getValue() nos permite recuperar la clave almacenadamente previamente con PutValue
*/

public class MultiplesfuentesEvento{
    public static void main(String[] args) {

        MarcoAccion marco = new MarcoAccion();
        marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        marco.setVisible(true);
    }
}

class MarcoAccion extends JFrame{
    public MarcoAccion() {
        setTitle("Prueba");
        setBounds(600,150,600,300);
        PanelAccion lamina = new PanelAccion();
        add(lamina);
    }
}
class PanelAccion extends JPanel{   
    public PanelAccion() {

        AccionColor accionAmarrillo = new AccionColor("Amarillo",null, Color.yellow);
        AccionColor accionRojo = new AccionColor("Rojo",null, Color.RED);
        AccionColor accionAzul = new AccionColor("Azul",null, Color.BLUE);

        botonAma  = new JButton(accionAmarrillo);
        botonRojo = new JButton(accionRojo);
        botonAzul = new JButton(accionAzul);
        add(botonAma);
        add(botonRojo);
        add(botonAzul);

        // Decir al programa cual son los objeto donde van a incidir las combinaciones de tecla:
        // InputMap : Vincular un evento con una combinacion de tecla
        InputMap mapaEntrada = getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
        //Crear combinacion de Tecla:
        KeyStroke teclaAmarillo = KeyStroke.getKeyStroke("ctrl A"); 
        KeyStroke teclaRojo = KeyStroke.getKeyStroke("ctrl B");
        KeyStroke teclaAzul = KeyStroke.getKeyStroke("ctrl C");
        // Asignar la combinacion de tecla a un objeto correspondiente:
        mapaEntrada.put(teclaAmarillo,"fondoAmarillo");
        mapaEntrada.put(teclaRojo,"fondoRojo");
        mapaEntrada.put(teclaAzul,"fondoAzul");
        // Asignar el objeto a la accion.
        ActionMap mapaAccion = getActionMap();
        
        mapaAccion.put("fondoAmarillo",accionAmarrillo);
        mapaAccion.put("fondoRojo",accionRojo);
        mapaAccion.put("fondoAzul",accionAzul);
    }
    JButton botonAma;
    JButton botonRojo;
    JButton botonAzul;

    /* Action */
    private class AccionColor extends AbstractAction{
    /*Putvalue: Para almacenar la informacion
       GetValue: Rescatar la informacion
    */ 
    public AccionColor(String nombre,Icon icono,Color color_boton){

        putValue(Action.NAME,nombre);
        putValue(Action.SMALL_ICON, icono);
        putValue(Action.SHORT_DESCRIPTION,"Poner la lamina de color" + nombre);

        putValue("Color_de_fondo",color_boton);

    }

    public void actionPerformed(ActionEvent e) {
        Color c =(Color)getValue("Color_de_fondo");
        System.out.print(getValue(Action.NAME));

        setBackground(c);
    }
}
}
