import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class PruebaRadio {
    public static void main(String[] args){
        MarchoRadio ma = new MarchoRadio();
        ma.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
    class MarchoRadio extends JFrame{
        public MarchoRadio() {
            setBounds(550,300,550,350);
            setVisible(true);
            LaminaRadio mi = new LaminaRadio();
            add(mi);
        }
    }

    class LaminaRadio extends JPanel{
        public LaminaRadio() {
            setLayout(new BorderLayout());

            texto = new JLabel("En lugar de la mancha..........");
            texto.setFont(new Font("Serif",Font.PLAIN,12));

            add(texto, BorderLayout.CENTER);
            lamina_botton = new JPanel();
            migroup = new ButtonGroup();
            /*ButtonGroup migroup = new ButtonGroup();
            boton1 = new JRadioButton("Pequeño",false);
            boton2 = new JRadioButton("Mediano",true);
            boton3 = new JRadioButton("Grande",false);
            boton4 = new JRadioButton("Muy grande",false);
            JPanel lamina_radio = new JPanel();
            Evento_radio mievento = new Evento_radio();
            boton1.addActionListener(mievento);
            boton2.addActionListener(mievento);
            boton3.addActionListener(mievento);
            boton4.addActionListener(mievento);
            migroup.add(boton1);
            migroup.add(boton2);
            migroup.add(boton3);
            migroup.add(boton4);
            lamina_radio.add(boton1);
            lamina_radio.add(boton2);
            lamina_radio.add(boton3);
            lamina_radio.add(boton4);
            add(lamina_radio,BorderLayout.SOUTH);*/
            colocarBotones("Pequeño",false,10);
            colocarBotones("Mediano",true,12);
            add(lamina_botton,BorderLayout.SOUTH);

        
        }
        public void colocarBotones(String nombre,boolean seleccionado,final int tamano){
            JRadioButton boton = new JRadioButton(nombre,seleccionado);
            migroup.add(boton);
            lamina_botton.add(boton);
            ActionListener mievento = new ActionListener() {

                public void actionPerformed(ActionEvent e) {
                    texto.setFont(new Font("Serif",Font.PLAIN,tamano));
                }
                
            };

            boton.addActionListener(mievento);
            
        }

        private JLabel texto;
       // private JRadioButton boton1,boton2,boton3,boton4;
        private ButtonGroup migroup;
        private JPanel lamina_botton;


        /*private class Evento_radio implements ActionListener{
            public void actionPerformed(ActionEvent e) {
               if(e.getSource() == boton1){
                texto.setFont(new Font("Serif",Font.PLAIN,10));
               }else if (e.getSource() == boton2){
                texto.setFont(new Font("Serif",Font.PLAIN,12));
               }else if (e.getSource() == boton3){
                texto.setFont(new Font("Serif",Font.PLAIN,18));
               }else{
                texto.setFont(new Font("Serif",Font.PLAIN,24));
               }
            }
        }*/

    }

