import javax.swing.*;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.text.Document;

import java.awt.*;
import java.awt.event.*;

public class CrearSwing {
    public static void main(String[] args){
        MarcoTexto mi = new MarcoTexto();
        mi.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}

class MarcoTexto extends JFrame {
    public MarcoTexto() {
        setBounds(600, 300, 600, 350);

        LaminaTexto milamina = new LaminaTexto();

        add(milamina);
        setVisible(true);

       
    }

    

   
    

}
class LaminaTexto extends JPanel
{
    private JTextField campo1;
    private JLabel resultado;
    private JPasswordField C_password;
    private JTextArea miarea;

    private JButton botonInsertar,botonSaltoLinea;


    public LaminaTexto() {
        setLayout(new BorderLayout());

        JPanel milamina2 = new JPanel();
        milamina2.setLayout(new FlowLayout());




       resultado = new JLabel("",JLabel.CENTER);
        JLabel texto1 = new JLabel("Correo");

        milamina2.add(texto1);

        campo1 = new JTextField(20);

        EscuchaTexto es = new EscuchaTexto();



        Document midocumento = campo1.getDocument();
        midocumento.addDocumentListener(es);

        milamina2.add(campo1);

        

        add(resultado,BorderLayout.CENTER);

        JButton miboton = new JButton("Dale");
        DameTexto mievento = new DameTexto();
        miboton.addActionListener(mievento);
        milamina2.add(miboton);

        add(milamina2,BorderLayout.NORTH);


        JPanel lamina_superior = new JPanel();
        lamina_superior.setLayout(new GridLayout(2,2));
        add(lamina_superior,BorderLayout.NORTH);
        JLabel etiqueta1 = new JLabel("Usuario:");
        JLabel etiqueta2 = new JLabel("Contraseña");

        JTextField c_usuario = new JTextField(15);

        
        C_password = new JPasswordField(15);
        
        Comprueba_pass mievento1 = new Comprueba_pass();

        C_password.getDocument().addDocumentListener(mievento1);

        lamina_superior.add(etiqueta1);
        lamina_superior.add(c_usuario);
        lamina_superior.add(etiqueta2);
        lamina_superior.add(C_password);

        JButton enviar = new JButton("Enviar");
        add(enviar,BorderLayout.SOUTH);

        

        miarea = new JTextArea(8,10);
        JScrollPane laminabarra = new JScrollPane(miarea);

        add(laminabarra,BorderLayout.WEST);
        miarea.setLineWrap(true);

        JButton mibotonArea = new JButton("AREA");
        mibotonArea.addActionListener(new GestionaArea());


        
        JPanel milamina3 = new JPanel();
        milamina3.setLayout(new FlowLayout());



        
        add(milamina3,BorderLayout.CENTER);

        milamina3.add(mibotonArea);


        botonInsertar = new JButton("Insertar");
        botonInsertar.addActionListener(new ActionListener() {

        
            public void actionPerformed(ActionEvent e) {
                miarea.append("En un lugar de la Mancha....");

            }
            
        });

        botonSaltoLinea = new JButton("Salto Linea");
        botonSaltoLinea.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                boolean saltar = !miarea.getLineWrap();
                miarea.setLineWrap(saltar);
                botonSaltoLinea.setText(saltar? "Quitar Salto":"Salto Linea");

                    
               
            }
        });

        milamina3.add(botonInsertar);
        milamina3.add(botonSaltoLinea);


        /*campo1.setText("Columnas");
        System.out.println(campo1.getText().trim());*/

    }
    private class GestionaArea implements ActionListener{

        public void actionPerformed(ActionEvent e) {
            String contener = miarea.getText();
            System.out.println(contener);
            System.out.println(miarea.getLineWrap());
        }

    }

    private class Comprueba_pass implements DocumentListener{

        public void insertUpdate(DocumentEvent e) {
            char [] contrasena;
            contrasena = C_password.getPassword();
            if(contrasena.length<8 || contrasena.length>12){
                C_password.setBackground(Color.red);
            }else{
                C_password.setBackground(Color.white);
            }

        }
        public void removeUpdate(DocumentEvent e) {
            char [] contrasena;
            contrasena = C_password.getPassword();
            if(contrasena.length<8 || contrasena.length>12){
                C_password. setBackground(Color.red);
            }else{
                C_password.setBackground(Color.white);
            }


        }
        public void changedUpdate(DocumentEvent e) {}
    }

    private class DameTexto implements ActionListener{

       
        public void actionPerformed(ActionEvent e) {
            int correcto = 0;

            String email = campo1.getText().trim();

            for(int i=0;i<email.length();i++){
                if(email.charAt(i) == '@'){
                    correcto++;
                }
            }
            if(correcto!=1){
                resultado.setText("Incorrecto");
            }else{
                resultado.setText("Correcto");
            }
        }

    }

    private class EscuchaTexto implements DocumentListener{

        
        public void insertUpdate(DocumentEvent e) {
           System.out.println("Has insertado texto");
        }

        
        public void removeUpdate(DocumentEvent e) {
            System.out.println("Has removeado texto");
        }

       
        public void changedUpdate(DocumentEvent e) {
           
        }     
    }
}
