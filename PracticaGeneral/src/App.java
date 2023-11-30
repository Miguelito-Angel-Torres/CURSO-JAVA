import java.util.Scanner;

import javax.swing.JOptionPane;

import java.util.*;
public class App {
    //enum Talla{MINI,MEDIANO,GRANDE,MUY_GRANDE};
    //Cuando quieres almacenar una serie de valores determinado,tendras que crear un tipo enumerado.
    enum Talla{
        MINI("S"),
        MEDIANO("M"),
        GRANDE("L");

        private Talla(String abreviatura){
            this.abreviatura = abreviatura;
        }

        public String dameAbreviatura(){
            return abreviatura;
        }

        private String  abreviatura;

    }

    public static void main(String[] args) throws Exception {
        //final(constante)
        
        final double edad=5.85;
        double raiz=Math.sqrt(edad);
        double potencial=Math.pow(5, 2);
        int round=(int)Math.round(0);
        String nombre = "Miguel";nombre.length();
        nombre.charAt(0);
        String frase = "No lo se";
        String frase_r = frase.substring(1, 4) + " Na";
        String alu1= "David" ;String alu2 = "david";
        Boolean comp = alu1.equalsIgnoreCase(alu2);
        Scanner miobjet = new Scanner(System.in);
        //String usu = miobjet.nextLine();
        //int ed = miobjet.nextInt();
        //String edadX = JOptionPane.showInputDialog("Introduce tu edad:");
        //int ni_edadX = Integer.parseInt(edadX); 
        //Redondiar decimal:
        //String num1 =  JOptionPane.showInputDialog("Introduce un Numero:");
        //double n = Double.parseDouble(num1);
        //System.out.printf("%1.2f",Math.sqrt(n));
        // Bucles:
        /*String clave = "123";String pass = "";
        while(clave.equals(pass) == false){
            pass = JOptionPane.showInputDialog("Introduce la contraseña,por favor");
            if(clave.equals(pass) == false){
                System.out.println("Contraseña incorrecta");
        }}System.out.println("Contraseña correcta");*/
        /*int aleatoria = (int)(Math.random()*10);
        Scanner entrada = new Scanner(System.in);
        int numero = 10;
        int intentos = 0;
        while(numero!=aleatoria){
            intentos++;
            System.out.println("Introduce un numero:");
            numero = entrada.nextInt();
            if(aleatoria<numero){
                System.out.println("Mas bajo");
            }else if(aleatoria>numero){
                System.out.println("Mas alto");}}
        System.out.println("Correcto" + " Intentos: " + intentos + "Numero: " + aleatoria);*/
        // While-Do // Siempre se ejecuta una vez al principio,si la condicion es false;
        /*String genero = "";
        do{
            genero = JOptionPane.showInputDialog("Introduce tu genero(H o M)");
        }while(genero.equalsIgnoreCase("H") == false && genero.equalsIgnoreCase("M") == false);
        int altura = Integer.parseInt(JOptionPane.showInputDialog("Introduce altura en cm"));
        int peso_ideal = 0;
        if(genero.equalsIgnoreCase("H")){ peso_ideal = altura - 110;}else if(genero.equalsIgnoreCase("M")){peso_ideal=altura-120;}
        System.out.println("Peso ideal:" + peso_ideal);*/
        //
        /*boolean arroba = false;
        String m = "miguel1234@gmail.com";
        for(int i = 0; i < m.length();i++){
            if(m.charAt(i) == '@'){arroba = true;}}*/
        //
        int [] m = {1,2,3,4,5};
        int [] mux = new int[50];
        String [] mx = new String[2];
        String [] mxP = {"España","Francia"};
        //for(int element:m){System.out.println(element);}
        /*for(int i=0; i < mx.length;i++){mx[i] = mxP[i];}
        for(int element:m){System.out.println(element);}
        for(int i = 0; i < mx.length; i++){
             mx[i] = JOptionPane.showInputDialog("Introduce pais:");}*/
        /*for(int i =0;i<mux.length;i++){
             mux[i] = (int)Math.round(Math.random()*100);
        }
        for(int nu:mux){System.out.println(nu);}*/
        /*int [][] matrix = {
            {12,13},
            {14,15}
        }; 
        for(int i=0;i<matrix.length;i++){
            System.out.println();
            for(int j=0;j<matrix[i].length;j++){
                System.out.print(matrix[i][j] + " ");
        }}
        for(int[]fila:matrix){
            System.out.println();
            for(int z:fila){
                System.out.print(z + " ");
        }}*/
        /*double acumulado;
        double interes = 0.10;
        double [][] saldo = new double[6][5];
        
        for (int i = 0; i < saldo.length; i++) {
            saldo[i][0] = 10000;
            acumulado = 10000;

            for(int j=1;j<saldo[i].length;j++){
                acumulado = acumulado + (acumulado * interes);
                saldo[i][j] = acumulado;
               
            }interes = interes + 0.01;}
        for(int z=0;z<saldo.length;z++){
            System.out.println();
            for(int y=0;y<saldo[y].length;y++){
                System.out.printf("%1.2f",saldo[z][y]);
                System.out.print(" ");
            }
        }*/
        // Tipos Enumerados:
        Scanner scanner = new Scanner(System.in);
        System.out.println("Escribe una talla:MINI,MEDIANO,GRANDE");
        String entradadatos = scanner.next().toUpperCase();
        Talla la_talla = Enum.valueOf(Talla.class,entradadatos);
        System.out.println("Talla=" +  la_talla);
        System.out.println("Abreviatura=" + la_talla.dameAbreviatura());
    }   
}
