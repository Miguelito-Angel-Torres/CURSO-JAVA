import javax.swing.*;
import javax.swing.text.StyledEditorKit;

import java.awt.*;
import java.awt.event.*;
import javax.swing.text.*;

public class Practica1 {
    public static void main(String[] args){
        Frame f = new Frame();
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}

class Frame extends JFrame {
    public Frame(){
        setBounds(500,400,550,350);
        LaminaP lps = new LaminaP();
        add(lps);
        setVisible(true);
    }
}

class LaminaP extends JPanel{
    public LaminaP(){
        setLayout(new BorderLayout());
        JPanel laminamenu = new JPanel();

        JMenuBar mibarra = new JMenuBar();
        fuente = new JMenu("Fuentes");
        estilo = new JMenu("Estilos");
        tamagno = new JMenu("Tamaño");
        mibarra.add(estilo);mibarra.add(tamagno);mibarra.add(fuente);
        laminamenu.add(mibarra);
        add(laminamenu,BorderLayout.NORTH);
        /*JMenuItem arial = new JMenuItem("Arial");
        JMenuItem courier = new JMenuItem("Courier");*/
        /*courier.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                miarea.setFont(new Font("Courier",Font.PLAIN,12));
            }
        });*/

        /*JMenuItem verdana = new JMenuItem("Verdana");
        fuente.add(arial);fuente.add(courier);fuente.add(verdana);
        JMenuItem negrita = new JMenuItem("Negrita");
        JMenuItem cursiva= new JMenuItem("Cursiva");
        estilo.add(negrita);estilo.add(cursiva);
        JMenuItem tam_12 = new JMenuItem("12");
        JMenuItem tam_14 = new JMenuItem("14");
        JMenuItem tam_16 = new JMenuItem("16");
        JMenuItem tam_20 = new JMenuItem("20");
        tamagno.add(tam_12);tamagno.add(tam_14);tamagno.add(tam_16);
        tamagno.add(tam_20); */
        
        miarea = new JTextPane();
        add(miarea,BorderLayout.CENTER);

        configura_menu(null,"Arial", "fuente", "Arial", 9 , 16);
        configura_menu(null,"Courier", "fuente","Courier",9,10);
        configura_menu(null,"Verdana", "fuente","Verdana", 9, 10);

        

        //configura_menu(null,"Negrita", "estilos", TOOL_TIP_TEXT_KEY,Font.BOLD, 10);
        //configura_menu(new ImageIcon("PracticaGeneral/src/Graficos/src/graficos/copiar.jpg"),"Cursiva", "estilos", TOOL_TIP_TEXT_KEY,Font.ITALIC, 10);
        JCheckBoxMenuItem negrita = new JCheckBoxMenuItem("Negrita");
        JCheckBoxMenuItem cursiva = new JCheckBoxMenuItem("cursiva");
        negrita.addActionListener(new StyledEditorKit.BoldAction());
        cursiva.addActionListener(new StyledEditorKit.ItalicAction());
        estilo.add(negrita);
        estilo.add(cursiva);

        /*configura_menu(null,"12", "tamagno",TOOL_TIP_TEXT_KEY, 9, 12);
        configura_menu(null,"14", "tamagno", TOOL_TIP_TEXT_KEY, 9, 14);
        configura_menu(null,"16", "tamagno", TOOL_TIP_TEXT_KEY, 9, 16);*/

        ButtonGroup tamagno_letra = new ButtonGroup();
        JRadioButton doce = new JRadioButton("12");
        JRadioButton catorce = new JRadioButton("14");
        JRadioButton dec = new JRadioButton("16");

        tamagno_letra.add(doce);
        tamagno_letra.add(catorce);
        tamagno_letra.add(dec);
        doce.addActionListener(new StyledEditorKit.FontSizeAction("cambio_tamagno",12));
        catorce.addActionListener(new StyledEditorKit.FontSizeAction("cambio_tamagno",14));
        dec.addActionListener(new StyledEditorKit.FontSizeAction("cambio_tamagno",16));

        tamagno.add(doce);
        tamagno.add(catorce);
        tamagno.add(dec);
        

    }
    private JTextPane miarea;
    private JMenu fuente,estilo,tamagno; 
    Font letras;

    public void configura_menu(Icon imagen,String rotulo,String menu,String tipo_letra,int estilos,int tam){

        JMenuItem elem_menu = new JMenuItem(rotulo,imagen);
        elem_menu.setHorizontalTextPosition(SwingConstants.LEFT);

        if(menu == "fuente"){
            fuente.add(elem_menu);

            elem_menu.addActionListener(new StyledEditorKit.FontFamilyAction("cambia_letra",rotulo));
        }else if(menu == "estilos"){
            estilo.add(elem_menu);

            if(estilos == Font.BOLD){
                elem_menu.addActionListener(new StyledEditorKit.ItalicAction());
            }else{
                elem_menu.addActionListener(new StyledEditorKit.BoldAction());
            };
           

        }else if(menu == "tamagno"){
            tamagno.add(elem_menu);

            elem_menu.addActionListener(new StyledEditorKit.FontSizeAction("cambio_tamagno",tam));

        }
        //elem_menu.addActionListener(new Gestion_Evento(rotulo,tipo_letra, estilos,tam));
      
    }
    /*private class Gestion_Evento implements ActionListener{
        
        String tipo_texto,menu;
        int estilo_letra,tamagno_letra;
        
        Gestion_Evento(String elemento,String texto2,int estilo2,int tam_letra){

            tipo_texto =  texto2;
            estilo_letra = estilo2;
            tamagno_letra = tam_letra;
            menu = elemento;
        }

        public void actionPerformed(ActionEvent e) {
            letras = miarea.getFont();
            if(menu == "Arial" || menu == "Courier" || menu == "Verdana"){
                estilo_letra = letras.getStyle();
                tamagno_letra = letras.getSize();
            }else if(menu == "Negrita" || menu == "Cursiva"){
                if(letras.getStyle() == 1 || letras.getStyle() == 2){
                    if(estilo_letra == 1){
                        estilo_letra = 1;
                    }else{
                        estilo_letra = 3;
                    }
                   
                }
                tamagno_letra = letras.getSize();
                tipo_texto = letras.getFontName();
            }else if(menu == "12" || menu == "14" || menu == "16"){
                tipo_texto = letras.getFontName();
                estilo_letra = letras.getStyle();
            }

            miarea.setFont(new Font(tipo_texto,estilo_letra,tamagno_letra));
            System.out.println("Tipo:  " + tipo_texto);
            System.out.println("Estilo: " + estilo_letra);
            System.out.println("Tamagno:  " + tamagno_letra);
        }

    }*/

    /*private class Gestiona_menus implements ActionListener{

        public void actionPerformed(ActionEvent e) {
            miarea.setFont(new Font("Courier",Font.PLAIN,12));
        }
    }*/
    // FUNCION:
   
    //https://www.youtube.com/watch?v=s0k9jIHt-as&list=PLU8oAlHdN5BktAXdEVCLUYzvDyqRQJ2lk&index=111
}
