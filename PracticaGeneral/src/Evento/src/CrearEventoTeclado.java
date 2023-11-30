import javax.swing.JFrame;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.lang.UnsupportedOperationException.*;
public class CrearEventoTeclado {
    public static void main(String[] args){
        MarcoTeclado mimarco = new MarcoTeclado();
        mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
}

class MarcoTeclado extends JFrame {
    public MarcoTeclado(){
        setVisible(true);
        setBounds(700,300,600,450);

        EventoDeTeclado teclado = new EventoDeTeclado();

        addKeyListener(teclado);
    }
}

class EventoDeTeclado implements KeyListener{

    @Override
    public void keyTyped(KeyEvent e) {
        char letra = e.getKeyChar();
        System.out.println(letra);
    }

    @Override
    public void keyPressed(KeyEvent e) {
        // El presionado de tecla :
        try {
            //int codigo = e.getKeyCode();
        } catch (UnsupportedOperationException e1) {
            System.out.println("Error");
        }
    }
    @Override
    public void keyReleased(KeyEvent e) {
        // El levantado de tecla :
    }
}
