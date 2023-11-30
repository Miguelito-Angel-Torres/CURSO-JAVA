import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class CrearCalculadora {
    
    public static void main(String[] args){
        MarcoCalculadora mim = new MarcoCalculadora();
        mim.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mim.setVisible(true);


    }
}

class MarcoCalculadora extends JFrame{
    public MarcoCalculadora(){
        setTitle("Calculadora");
        setBounds(400,200,450,300);
        LaminaCalculadora milaminac = new LaminaCalculadora();
        add(milaminac);
        //pack();


    }       

}

class LaminaCalculadora extends JPanel{
    public LaminaCalculadora(){
        principio = true;
        setLayout(new BorderLayout());
        
        pantalla = new JButton("0");
        pantalla.setEnabled(false);

        add(pantalla,BorderLayout.NORTH);

        milamina2 = new JPanel();
        milamina2.setLayout(new GridLayout(4,4));

        InsertNumero insertar = new  InsertNumero();
        Accionorden orden = new Accionorden();


        ponerBoton("7",insertar);
        ponerBoton("8",insertar);
        ponerBoton("9",insertar);
        ponerBoton("/",orden);
        ponerBoton("4",insertar);
        ponerBoton("5",insertar);
        ponerBoton("6",insertar);
        ponerBoton("*",orden);
        ponerBoton("1",insertar);
        ponerBoton("2",insertar);
        ponerBoton("3",insertar);
        ponerBoton("-",orden);
        ponerBoton("0",insertar);
        ponerBoton(".",insertar);
        ponerBoton("+",orden);
        ponerBoton("=",orden);

        add(milamina2,BorderLayout.CENTER);
        ultimaOperacion = "=";

    }

    private JPanel milamina2;
    private JButton pantalla;
    private boolean principio;

    private double resultado;

    private String ultimaOperacion;

    private void ponerBoton(String rotulo,ActionListener oyente) {
        JButton boton = new JButton(rotulo);
        milamina2.add(boton);
        boton.addActionListener(oyente);


    }

    private class InsertNumero implements ActionListener{

        public void actionPerformed(ActionEvent e) {
            String entrada = e.getActionCommand();

            if(principio){
                pantalla.setText("");
                principio = false;
            }
            
            pantalla.setText(pantalla.getText() + entrada);
            

           
          

        }
    }

    // Gestionar los eventos operaciones matematica:
    private class Accionorden implements ActionListener{

        public void actionPerformed(ActionEvent e) {
            String operacion = e.getActionCommand();
            System.out.println(operacion);
            calcular(Double.parseDouble(pantalla.getText()));
            ultimaOperacion = operacion;
            principio = true;


        }

        public void calcular(Double x){
            if(ultimaOperacion.equals("+")){
                resultado+=x;    
            }else if(ultimaOperacion.equals("-")){
                resultado-=x;
            }else if(ultimaOperacion.equals("*")){
                resultado = resultado * x;
            }else if(ultimaOperacion.equals("/")){
                resultado = resultado / x;
            }else if(ultimaOperacion.equals("=")){
                resultado = x;
               
            }

            pantalla.setText("" + resultado);

        }


    }

}
