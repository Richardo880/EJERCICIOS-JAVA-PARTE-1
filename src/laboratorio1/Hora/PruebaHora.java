package laboratorio1.Hora;


public class PruebaHora {

    public static void main(String[] args) {
        Hora h = new Hora(10,30,00);
       
        h.imprimir();
        System.out.println("Adelantando la hora...");
        h.adelantar(15,10,5);
        h.imprimir();
        System.out.println("Reinicializando la hora...");
        h.reiniciar(12,12,50);
        h.imprimir();
    }
    
}
