
public class Coche {
    private int ruedas;private int ancho;
    private int largo;private int motor;
    private int peso_plataforma;
    
    public String color;
    private int peso_total;
    private boolean asientos_cuero,climatizador;

    public Coche(){
        ruedas = 4;
        largo = 2000;
        ancho = 300;
        motor = 1600;
        peso_plataforma = 500;
    }
    // MODIFICACION DE PROPIEDADES:
    public String GetDataGeneral(){
        return "La plataforma del ve tiene: " + ruedas + "ruedas " +
        ". Mide " + largo/1000 + " metros con un ancho de " + ancho +
        " cm y un peso de plataforma de " + peso_plataforma + " kg"; 
    }  
    public String GetLargo(){
        return "El largo del coche es: " + largo;
    }
    public void SetColor(String color){
        this.color = color;
    }
    public String GetColor(){
        return "El Color del coche es: " + color;
    }
    public void configurar_asiento(String asiento_cuero){
        if(asiento_cuero.equalsIgnoreCase(asiento_cuero)){
            this.asientos_cuero = true;
        }else{
            this.asientos_cuero = false;
        }
    }
    public String GetAsientos_Cuero(){
        if(asientos_cuero){
            return "El coche asiento de cuero";
        }else{
            return "El coche no asiento de cuero";
        }
    }
    public void conf_climat(String climatizador){
        if(climatizador.equalsIgnoreCase(climatizador)){
            this.climatizador = true;
        }else{
            this.climatizador = false;
        }}
    public String GetConf_climat(){
        if(climatizador){
            return "El coche incorpora climatizador";
        }else{ 
            return "El coche lleva aire acondicionador";
        }
    }
    // Metodo a la vez va ser Setter y Getter:
    public String Get_C_P(){
        int peso_carroceria = 500;
        peso_total  = peso_plataforma + peso_carroceria;
        if(asientos_cuero== true){
            peso_total = peso_total + 50;
        }
        if(climatizador == true){
            peso_total = peso_total + 20;
        }
        return "El peso del coche es:" + peso_total;
    }
    public int precio_coche(){
        int precio_final = 10000;
        if(asientos_cuero == true){
            precio_final+=200;
        }
        if(climatizador == true){
            precio_final+=1500;
        }
        return precio_final;
    }
}
