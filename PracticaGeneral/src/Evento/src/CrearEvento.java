import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class CrearEvento {
    public static void main(String[] args) throws Exception {
        miM m = new miM();
    }
}

class miM extends JFrame{
    public miM(){
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(700,300,500,300);

        setTitle("Botones y Eventos");

        LaminaBotones milamina = new LaminaBotones();
        add(milamina);
    }
}

/*class LaminaBotones extends JPanel implements ActionListener{
    
    JButton botonAzul = new JButton("Azul");
    JButton botonAmarillo = new JButton("Amarillo");
    JButton botonVerde = new JButton("Verde");
    
   public LaminaBotones(){
    add(botonAzul);
    add(botonAmarillo);
    add(botonVerde);
    botonAzul.addActionListener(this);
    botonAmarillo.addActionListener(this);
    botonVerde.addActionListener(this);
    //addWindowListener : otro evento
    

   }
   // Metodo que marca hacer cuando recibe un evento
   public void actionPerformed(ActionEvent e){
    // Metodo getSource: obtiene el objeto que dio click
    Object botonPulsado = e.getSource();
    if(botonPulsado==botonAzul){
        setBackground(Color.BLUE);
    }else if(botonPulsado == botonVerde){
        setBackground(Color.GREEN);
    }else if(botonPulsado == botonAmarillo){
        setBackground(Color.YELLOW);
    }
    //WindowEvent
    // Programar lo que tiene que hacer,cuando ocurra el evento:
   }}*/

class LaminaBotones extends JPanel{
    
    JButton botonAzul = new JButton("Azul");
    JButton botonAmarillo = new JButton("Amarillo");
    JButton botonVerde = new JButton("Verde");
    
   public LaminaBotones(){
    add(botonAzul);
    add(botonAmarillo);
    add(botonVerde);
    botonAzul.addActionListener(new ColorFondo(Color.BLUE));
    botonAmarillo.addActionListener(new ColorFondo(Color.YELLOW));
    botonVerde.addActionListener(new ColorFondo(Color.GREEN));
   }

   private class ColorFondo  implements ActionListener{
    
    public ColorFondo(Color c){
        colorDeFondo = c;
    }

    public void actionPerformed(ActionEvent e){
        
        setBackground(colorDeFondo);

    };
    private Color colorDeFondo;


}
}




