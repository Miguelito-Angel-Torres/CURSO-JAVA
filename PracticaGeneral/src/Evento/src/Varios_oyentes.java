import java.awt.event.*;
import javax.swing.*;


public class Varios_oyentes {
    public static void main(String[] args){
        Marco_Principal m = new Marco_Principal();
        m.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        m.setVisible(true);
    }
}
class Marco_Principal extends JFrame {
    public Marco_Principal() {
        setTitle("Pruena Varios");
        setBounds(1300,100,300,200);
        Lamina_P la = new Lamina_P();
        add(la);
    }
}

class Lamina_P extends JPanel{

    public Lamina_P() {
        JButton boton_nuevo = new JButton("Nuevo");
        add(boton_nuevo);
        boton_cerrar = new JButton("Cerrar todo");
        add(boton_cerrar);

        OyenteNuevo oyente = new OyenteNuevo();

        boton_nuevo.addActionListener(oyente);



    }
    JButton boton_cerrar;

    private class OyenteNuevo implements ActionListener{
        public void actionPerformed(ActionEvent e){

            Marco_Emergente m = new Marco_Emergente(boton_cerrar);
            //m.setTitle("Maria");
        }
    }
}

class Marco_Emergente extends JFrame{
    private static int contador = 0;

    public Marco_Emergente(JButton boton_de_principal){
        contador++; 
        setVisible(true);   
        setTitle("Ventana" + contador);

        setBounds(40*contador,40*contador,300,150);
        
        CierraTodos oyenteCerrar = new CierraTodos();
        boton_de_principal.addActionListener(oyenteCerrar);

    }
    
    private class CierraTodos implements ActionListener{
        public void actionPerformed(ActionEvent e){
            dispose();
        }
    }
}
