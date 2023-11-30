import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class PruebaComboBox{
    public static void main(String[] args){
        MarcoComboBox ma = new MarcoComboBox(); 
        ma.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
    class MarcoComboBox extends JFrame{
        public MarcoComboBox() {
            setBounds(550,300,550,350);
            LaminaComboBox mi = new  LaminaComboBox();
            add(mi);
            setVisible(true);
            
        }
    }  

   
    class  LaminaComboBox extends JPanel{
        public LaminaComboBox() {
            setLayout(new BorderLayout());
            texto = new JLabel("En un lugar en la Mancha...");
            texto.setFont(new Font("Serif",Font.PLAIN,18));
            add(texto,BorderLayout.CENTER);

            JPanel lamina_norte = new JPanel();

            micombo = new JComboBox();
            micombo.setEditable(true);
            micombo.addItem("Serif");
            micombo.addItem("SansSerfir");
            micombo.addItem("Monospaced");

            Evento_combo miEvento = new Evento_combo();
            micombo.addActionListener(miEvento);
            
            lamina_norte.add(micombo);

            add(lamina_norte, BorderLayout.NORTH);
            


        }
        private JLabel texto;
        private JComboBox micombo;

        private class Evento_combo implements ActionListener{

            public void actionPerformed(ActionEvent e) {
                texto.setFont(new Font((String)micombo.getSelectedItem(),Font.PLAIN,18));
            }

        }
    }

