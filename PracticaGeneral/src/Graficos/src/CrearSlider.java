import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

import java.awt.*;
import java.awt.event.*;


public class CrearSlider {
    public static void main(String[] args){
        Frame_Sliders mimarco = new Frame_Sliders();
        mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}

class Frame_Sliders extends JFrame {
    public Frame_Sliders() {
        setBounds(500,400,550,350);
        Lamina_Sliders milamina = new Lamina_Sliders();
        add(milamina);
        setVisible(true);
    }
}

class Lamina_Sliders extends JPanel{
    public Lamina_Sliders() {
        setLayout(new BorderLayout());
        rotulo = new JLabel("Un lugar en la mancha...");
        add(rotulo , BorderLayout.CENTER);
        control = new JSlider(8,50,12);
        control.setOrientation(SwingConstants.HORIZONTAL);
        control.setMajorTickSpacing(20);
        control.setMinorTickSpacing(5);
        control.setPaintTicks(true);
        control.setFont(new Font("Serif",Font.ITALIC,12));
        control.setPaintLabels(true);

        control.setSnapToTicks(true);
        control.addChangeListener(new EventoSlider());

        JPanel laminaSlider = new JPanel();

        laminaSlider.add(control);

        add(laminaSlider, BorderLayout.NORTH);



    }

    private JLabel rotulo;
    private JSlider control;
    //private static int contador;

    private class EventoSlider implements ChangeListener {

        @Override 
        public void stateChanged(ChangeEvent e) {
            //contador++;
            //System.out.println("Esta manipuland el deslizante" + contador);
            rotulo.setFont(new Font("Serif", Font.PLAIN,control.getValue()));
            
        }

        //https://www.youtube.com/watch?v=06acFKm-kcQ&list=PLU8oAlHdN5BktAXdEVCLUYzvDyqRQJ2lk&index=100
        
    }


}
