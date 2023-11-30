import javax.swing.*;
import javax.swing.Timer;
import java.awt.event.*;
import java.util.*;


public class PruebaTemporizador {
    public static void main(String[] args) throws Exception {
    DameLaHora oyente = new DameLaHora();
    //ActionListener oyente = new DameLaHora();

    Timer mitemporizador = new Timer(5000,oyente);
    // Que comienze a ejecutar con el metodo start , nuestro temporizador.
    mitemporizador.start();
    JOptionPane.showMessageDialog(null,"Pulsa Aceptar para detener");
    System.exit(0);
    }
}



class DameLaHora implements ActionListener {

    public void actionPerformed(ActionEvent e) {

        Date ahora = new Date();
        System.out.println("Te pongo la hora cada 5 sg:" + ahora);
        // Clase que hace referencia al SISTEMA OPERATIVO.
        //Toolkit.getDefaultToolkit().beep();
    }
}