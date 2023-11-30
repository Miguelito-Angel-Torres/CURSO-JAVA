import java.awt.*;
import java.awt.Graphics2D;
import javax.swing.*;

//import javafx.geometry.Rectangle2D;
//import javafx.geometry.Rectangle2D;
//import javafx.scene.shape.Shape;
import javax.imageio.*;

import java.awt.geom.*;
import java.io.File;
//import java.io.IOException;
//import java.io.IOException;
import java.io.IOException;

//import javafx.geometry.Rectangle2D;

public class CrearMarco {
    public static void main(String[] args) throws Exception {
       miMarco m = new miMarco(); 

       /*String fuente = JOptionPane.showInputDialog("Introduce fuente");
       Boolean esf = false;
       String [] nF = GraphicsEnvironment.getLocalGraphicsEnvironment().getAvailableFontFamilyNames();

        for (String n: nF) {
            if(n.equalsIgnoreCase(fuente)){
                esf = true;
            }
        }
        if(esf){
            System.out.println("Fuente instalada");
        }else{
            System.out.println("No instalada Fuente");
        }*/

    }
}

class miMarco extends JFrame{

    public miMarco(){
        setVisible(true);
       /*Que tiene que hacer la ventana cuando se cierre:
        En el mismo Metodo tiene valores para colocar como parametro */
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //////////////////////////////////////////////////////////////
        Toolkit mipantalla = Toolkit.getDefaultToolkit();
        Dimension tamanoPantalla = mipantalla.getScreenSize();
        int alturaPa = tamanoPantalla.height;
        int anchoPa = tamanoPantalla.width;

        setBounds(anchoPa/4,alturaPa/4,anchoPa/2,alturaPa/2);
        setTitle("VENTANA");
        setResizable(false);
        Image icono = mipantalla.getImage("icono.png");
        setIconImage(icono);
        //setExtendedState(Frame.MAXIMIZED_BOTH);

        Lamina milamina = new Lamina();
        add(milamina); 

        //milamina.setBackground(SystemColor.window);
        milamina.setForeground(Color.RED);
        
        

    }}
class Lamina extends JPanel{

    public Lamina() {
        try {
            image = ImageIO.read(new File("src/Graficos/src/Xs.jpeg"));
        } catch (IOException e1) {
            System.out.println("No imagen");;
        }
    }

    //Este metodo ya esta construido ya en la clase : Component y se va encargar hacer 
    // lo que el programador en que su dia programo ese metodo, le dijera que tiene que hacer.
    /*public void paintComponent(Graphics g){

        super.paintComponent(g);

        g.drawString("Estamos aprendiendo", 100, 100);
        g.drawRect(50, 50, 124, 200);
        g.drawLine(100, 100, 200, 100);
        g.drawArc(120, 100, 10, 200, 150, 150); } */
    
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        Graphics2D g2 = (Graphics2D) g;
        Rectangle2D r = new Rectangle2D.Double(100, 100, 200, 150);
        g2.setPaint(Color.blue);
        g2.draw(r);
        g2.setPaint(Color.red);
        g2.fill(r);
        

        Ellipse2D e = new Ellipse2D.Double();
        e.setFrame(r);
        Color c = new Color(0,140,255);
        g2.setPaint(c.brighter());
        g2.fill(e); 

        Font mf = new Font("Courier",Font.BOLD,26);
        g2.setFont(mf);
        g2.setColor(Color.blue);
        g2.drawString("TUKI", 300, 300);
        //g2.draw(new Line2D.Double(300,300, 100, 200));
        //File miimagen = new File("src/Graficos/Xs.jpeg");
        

        int anchuraImagen = image.getWidth(this);
        int alturaImagen = image.getHeight(this);
        

        g.drawImage(image, 0, 0, null);
        
        

        for(int i=0; i<300;i++){
            for(int j=0;j<200;j++){
                if(i + j>0){
                    g.copyArea(0, 0, anchuraImagen, alturaImagen,i*anchuraImagen,j*alturaImagen);
                }       
            }
        }
    }
    private Image image;
}
