import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.*;
import java.awt.*;

public class CrearMarcoEmergente {
    public static void main(String[] args){
        Emergente eme = new Emergente();
        eme.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        eme.setVisible(true);
    }
}

class Emergente extends JFrame{
    public Emergente(){
        setTitle("Emergente");
        setBounds(600,500,600,200);
        Panel_Eme em = new Panel_Eme();
        add(em);

    }
}

class Panel_Eme extends JPanel{
    public Panel_Eme(){

    }
}
//https://www.youtube.com/watch?v=s0k9jIHt-as&list=PLU8oAlHdN5BktAXdEVCLUYzvDyqRQJ2lk&index=111