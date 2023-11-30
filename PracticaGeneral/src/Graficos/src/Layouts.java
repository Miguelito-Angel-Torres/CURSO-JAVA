import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.*;
import java.awt.*;

/* Disposicion por defecto:
    * GridLayout: Consiste en el contenedor,dividirlo varias filas y colummnas.
    * BorderLayout:Consiste dividir el contenedor en zonas(superior:north,abajo:south
    izquierda:west,derecha:east,center:centro)
    *FlowLayout: Lamina por defecto , disposicion defecto,se puede hacer modificaciones
    a la alinacion.
    * Una alternativa crear tu disposicion.
*/ 

public class Layouts {
    public static void main(String[] args){
        Marco_Layout layout = new Marco_Layout();
        layout.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        layout.setVisible(true);
    }
}
class Marco_Layout extends JFrame{
    public Marco_Layout(){
        setTitle("layouts");
        setBounds(600,500,600,200);
        Panel_Layout laLa = new Panel_Layout();

        Panel_Layout2 lala2 = new Panel_Layout2();

      
        add(laLa,BorderLayout.NORTH);
        add(lala2,BorderLayout.SOUTH);

    }
}
class Panel_Layout extends JPanel{
    public Panel_Layout(){
        //FlowLayout disposicion = new FlowLayout(FlowLayout.CENTER,75,20);
        //setLayout(disposicion);

        setLayout(new FlowLayout(FlowLayout.LEFT));


        add(new JButton("Amarillo"));
        
        add(new JButton("Rojo"));

    }
}

class Panel_Layout2 extends JPanel{
    public Panel_Layout2(){
        setLayout(new BorderLayout());

        add(new JButton("Azul"),BorderLayout.EAST);

        add(new JButton("Verde"),BorderLayout.SOUTH);

        add(new JButton("Negro"),BorderLayout.CENTER);

    }
}