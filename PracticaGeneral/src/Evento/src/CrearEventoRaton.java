import javax.swing.JFrame;



import java.awt.event.*;
/* - Cuando pulsamos el boton del raton , cuando esta siendo presionado : mousePressed
   - Cuando quita el dedo del boton del raton,el boton sube : mouseReleased
   - Cuando se hace dos opciones de presionar y quitar : mouseClicked
   - Cuando pasamos el raton por un elemento : mouseEntered
   - Cuando esta encima de un componente o elemento y arrastrando el raton salimos de este elemento : mouseExited
*/ 
public class CrearEventoRaton {
    public static void main(String[] args) {
      MarcoRaton mimarcort = new MarcoRaton();
      mimarcort.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}

class MarcoRaton extends JFrame {
   public MarcoRaton(){
      setVisible(true);
      setBounds(700,300,600,450);

      EventoDeRaton ev = new EventoDeRaton();
      //addMouseListener(ev);
      addMouseMotionListener(ev);

   }
}

// MouseAdapter hace referencia a la Interfaz MouseListener

// MouseMotionListener esa interfaces controla el movim del raton,para saber si lo estoy mov o arrastrando
class EventoDeRaton extends MouseAdapter implements MouseMotionListener{

   public void mouseDragged(MouseEvent e){
      System.out.println("Estas arrastrando el raton ");

   }

   public void mouseMoved(MouseEvent e){
      System.out.println("Estas moviendo el raton");
   }


    public void mouseClicked(MouseEvent e){
      //System.out.println("Has hecho un click");
      // La posicion del raton un momento dado:
      /*System.out.println("Coordenada X: " + e.getX() + "," + "Coordenada Y: " + 
      e.getY());

      System.out.println("Numero de click: " + e.getClickCount());*/
   }

   /*public void mousePressed(MouseEvent e){
      //System.out.println("Acabas de Presionar");
      //System.out.println(e.getModifiersEx());
      if(e.getModifiersEx() == MouseEvent.BUTTON1_DOWN_MASK){
         System.out.println("Al pulsado el boton izquierdo");
      }else if(e.getModifiersEx() == MouseEvent.BUTTON2_DOWN_MASK){
         System.out.println("Al pulsado la rueda del raton");
      }else if(e.getModifiersEx() == MouseEvent.BUTTON3_DOWN_MASK){
         System.out.println("Al pulsado el boton derecho");
      }
   }*/
   /* 
   public void mouseReleased(MouseEvent e){
      System.out.println("Acabas de levantar");
   }
   public void mouseEntered(MouseEvent e){
      System.out.println("Acabas de entrar");
   }

   public void mouseExited(MouseEvent e){
      System.out.println("Acabas de salir");
   } */
}
