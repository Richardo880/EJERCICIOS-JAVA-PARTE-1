package laboratorio1.Empleado;


public class PruebaEmpleado {
    public static void main(String [] args){
        Empleado em1 = new Empleado("Diego", "Noguera", 5000000);
        Empleado em2 = new Empleado("Ricardo", "Toledo", 4000000);
        
        System.out.println("Empleado 1: \n"
                + "Nombre: " + em1.getNombre() + "\n"
                + "Apellido: " + em1.getApellido() + "\n"
                + "Salario: " + em1.getSalario() + "\n");
        System.out.println("Empleado 2: \n"
                + "Nombre: " + em2.getNombre() + "\n"
                + "Apellido: " + em2.getApellido() + "\n"
                + "Salario: " + em2.getSalario() + "\n");
        
        em1.setSalario(em1.getSalario() + em1.getSalario()*0.1);
        em2.setSalario(em2.getSalario() + em2.getSalario()*0.1);
        
        System.out.println("Empleado 1: \n"
                + "Nombre: " + em1.getNombre() + "\n"
                + "Apellido: " + em1.getApellido() + "\n"
                + "Salario: " + em1.getSalario() + "\n");
        System.out.println("Empleado 2: \n"
                + "Nombre: " + em2.getNombre() + "\n"
                + "Apellido: " + em2.getApellido() + "\n"
                + "Salario: " + em2.getSalario() + "\n");
    }
}
