import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class PruebaChecks {
    public static void main(String[] args){
        MarchoCheck mim = new MarchoCheck();
        mim.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

}

class MarchoCheck extends JFrame {
    public MarchoCheck() {
        setBounds(550,300,550,350);
        setVisible(true);
        LaminaCheck milamina = new LaminaCheck();
        add(milamina);
    }
}
class LaminaCheck extends JPanel {
    public LaminaCheck() {
        setLayout(new BorderLayout());

        Font miletra = new Font("Serif",Font.PLAIN,24);
        texto = new JLabel("En un lugar de la mancha...");
        texto.setFont(miletra);

        JPanel laminatexto = new JPanel();
        laminatexto.add(texto);

        add(laminatexto,BorderLayout.CENTER);

        check1 = new JCheckBox("Negrita");
        check2 = new JCheckBox("Cursiva") ;

        check1.addActionListener(new ManejaChecks());
        check2.addActionListener(new ManejaChecks());

        JPanel laminachecks = new JPanel();

        laminachecks.add(check1);
        laminachecks.add(check2);
        add(laminachecks, BorderLayout.SOUTH);


    }
    private JLabel texto;
    private JCheckBox check1, check2;

    private class ManejaChecks implements ActionListener{

        public void actionPerformed(ActionEvent e) {
            int tipo = 0;
            if(check1.isSelected()){
                tipo += Font.BOLD;  
            }

            if(check2.isSelected()){
                tipo+= Font.ITALIC;
            }
            texto.setFont(new Font("Serif",tipo,24));
            

        }

    } 
}



