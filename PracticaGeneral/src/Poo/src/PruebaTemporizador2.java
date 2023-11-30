
import javax.swing.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.Timer;
import java.awt.Toolkit;

public class PruebaTemporizador2 {
    public static void main(String[] args){
        //Reloj mireloj = new Reloj(3000,true);
        Reloj mireloj = new Reloj();
        mireloj.enMarcha(300,true);
        JOptionPane.showMessageDialog(null, "Pulsar aceptar para terminar");
        System.exit(0); 
    }   
}

class Reloj{
    //Constructor que va dar estado inicial al temporizador
    /*public Reloj(int intervalo,boolean sonido){
        this.intervalo = intervalo;
        this.sonido = sonido;
    }
    private int intervalo;
    private boolean sonido;
    */
    public void enMarcha(int intervalo,final boolean sonido){
        /*ActionListener oyente = new DameLaHora2();
        Timer mitemporizador = new Timer(intervalo,oyente);
        mitemporizador.start();*/
        class DameLaHora2 implements ActionListener{
            // No es visible
            public void actionPerformed(ActionEvent evento){
                Date hora = new Date();
                System.out.println("Te pongo la hora cada 3 sg" + hora);
                if(sonido){
                    Toolkit.getDefaultToolkit().beep();
                }
            }
        }
        ActionListener oyente = new DameLaHora2();
        Timer mitemporizador = new Timer(intervalo,oyente);
        mitemporizador.start();
    }
    //Creacion de Clase Interna:
    /*private class DameLaHora2 implements ActionListener{
        public void actionPerformed(ActionEvent evento){
            Date hora = new Date();
            System.out.println("Te pongo la hora cada 3 sg" + hora);
            if(sonido){
                Toolkit.getDefaultToolkit().beep();
            }
        }
    }*/
    //Creacion de Clase Interno locales: Es dentro de un metodo:
    
}