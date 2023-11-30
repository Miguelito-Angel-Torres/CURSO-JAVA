
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class CrearEventoFoco {
    public static void main(String[] args){
        MarcoFoco fo = new MarcoFoco();
        fo.iniciar();

        //fo.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
/*
 * Descadena una accion cuando la ventana coje el foco : windowGainedFocus(FocusEvent e)
 * Descadena una accion cuando la venta pierde el foco : windowLostFocus(FocusEvent e)
 * FocusAdapter
*/
/*Para focus a ventana : WindowFocusListener */
class MarcoFoco extends JFrame implements WindowFocusListener{
    /*MarcoFoco(){
        setVisible(true);
        setBounds(300,300,600,450);
        add(new LaminaFoco());
    }*/

    public void  iniciar(){
        marco1 = new MarcoFoco();
        marco2 = new MarcoFoco();
        marco1.setVisible(true);
        marco2.setVisible(true);
        marco1.setBounds(300,100,600,350);
        marco2.setBounds(400,100,600,350);
        marco1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        marco2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        marco1.add(new LaminaFoco());

        marco1.addWindowFocusListener(this);
        marco2.addWindowFocusListener(this);


    }
    // Ganar el Focus : Quien tiene el focus
    public void windowGainedFocus(WindowEvent e) {
        if(e.getSource() == marco1){
            marco1.setTitle("Tengo el foco!!");
        }else{
            marco2.setTitle("Tengo el foco!!");
        }

    }

    public void windowLostFocus(WindowEvent e){
        if(e.getSource() == marco1){
            marco1.setTitle("");
        }else{
            marco2.setTitle("");
        }

    }
    MarcoFoco marco1;
    MarcoFoco marco2;


}

class LaminaFoco extends JPanel{
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        
        // Invalidar el layout: Posicionamiento que java da a los componentes
        // dentro de una lamina por defecto.
        setLayout(null);

        cuadro1 = new JTextField();
        cuadro2 = new JTextField();
        
        cuadro1.setBounds(120,10,150,20);
        cuadro2.setBounds(120,50,150,20);

        add(cuadro1);
        add(cuadro2);

        LanzaFocus elFoco = new LanzaFocus();
        cuadro1.addFocusListener(elFoco);
        

    }

    private class LanzaFocus implements FocusListener{
        //Cuando gana el focus:
        public void focusGained(FocusEvent e) {
        
        }
        // Cuando pierda el focus:
        public void focusLost(FocusEvent e) {
            //System.out.println("Has perdido el foco");
            String email = cuadro1.getText();
            boolean comprobacion = false;

            for(int i =0; i < email.length();i++){
                if(email.charAt(i) == '@'){
                    comprobacion = true;
                }
            }
            if(comprobacion){
                cuadro1.setBackground(Color.BLUE);
            }else{
                cuadro1.setBackground(Color.RED);
            }
        }
    }

    JTextField cuadro1;
    JTextField cuadro2;


} 


