package laboratorio1.Hora;


public class Hora {
    private int horas;
    private int minutos;
    private int segundos;
    
    //Constructor
    public Hora(int hora,int minuto,int segundo){
        this.horas = hora;
        this.minutos = minuto;
        this.segundos = segundo;
    }
    
    //Metodos de Acceso
    public int getHoras() {
        return horas;
    }

    public void setHoras(int horas) {
        this.horas = horas;
    }

    public int getMinutos() {
        return minutos;
    }

    public void setMinutos(int minutos) {
        this.minutos = minutos;
    }

    public int getSegundos() {
        return segundos;
    }

    public void setSegundos(int segundos) {
        this.segundos = segundos;
    }
    
    //Metodo para Adelantar Hora
    public void adelantar(int h,int m,int s){
        int seg =(horas*3600)+(minutos*60)+(segundos)+(h*3600)+(m*60)+(s);
        int auxHoras = seg/3600;

        if(seg/3600 > 23){
            int temp = (seg/3600)-24;
            while(temp > 23){
                temp = (temp/3600)- 24;
            }
            this.horas = temp;
        }else{
            this.horas = seg/3600;   
        }
        this.minutos = (seg-auxHoras*3600)/60;
        this.segundos = seg-(auxHoras*3600+minutos*60);
    }
    
    //Metodo para Reinicializar Hora
    public void reiniciar(int h,int m,int s){
        this.horas = h;
        this.minutos = m;
        this.segundos = s;
    }
    
    //Metodo para Imprimir Hora
    public void imprimir(){
        System.out.println("La hora actual es: "+horas+":"+minutos+":"+segundos);   
    }
}
