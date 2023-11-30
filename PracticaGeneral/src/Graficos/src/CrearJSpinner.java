import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class CrearJSpinner {
    public static void main(String[] args){
        Frame_Spinners mi = new Frame_Spinners();
        mi.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
}
class Frame_Spinners extends JFrame {
    public Frame_Spinners(){
        setBounds(500,400,550,350);
        Lamina_Spinners lps = new Lamina_Spinners();
        add(lps);
        setVisible(true);
    }
}

class Lamina_Spinners extends JPanel{
    public Lamina_Spinners(){
        // Clases: SpinnerDateModel:fecha SpinnerListMolde:array
            /*String lista[] = {
                "Enero",
                "Febrero"
            };/* */
            //String lista[] = GraphicsEnvironment.getLocalGraphicsEnvironment().getAvailableFontFamilyNames();

            //SpinnerDateModel fecha = new SpinnerDateModel();
            //SpinnerListModel list = new SpinnerListModel(lista);
            JSpinner control = new JSpinner(new SpinnerNumberModel(5,0,10,1){
                public Object getNextValue(){
                    return super.getPreviousValue();
                }
                public Object getPreviousValue(){
                    return super.getNextValue();
                }
            });
            Dimension d = new Dimension(200,20);
            control.setPreferredSize(d);
            add(control);
    }
    /*private class MiModeloJspinner extends SpinnerNumberModel{
        public MiModeloJspinner(){
            super(5,0,10,1);
        }
        
        public Object getNextValue(){
            return super.getPreviousValue();
        }
        public Object getPreviousValue(){
            return super.getNextValue();
        }
    }*/
    // CLASES INTERNAS ANONIMAS:
     
}
