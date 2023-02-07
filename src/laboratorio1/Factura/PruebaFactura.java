package laboratorio1.Factura;


public class PruebaFactura{
	public static void main(String [] args){
		Factura f = new Factura("12345", "Martillo", 4, 20.5);
		System.out.println("Codigo: " + f.getNumero() +"\nDescripcion: " + f.getDescripcion());
		System.out.println("Cantidad: " + f.getCantidad() + "\nPrecio x unidad: " + f.getPrecioUnidad()); 
		System.out.println("Monto Total:" + f.obtenerMontoFactura() + "\n-----------------");

		f.setCantidad(5);
		f.setPrecioUnidad(-0.25);
		f.setDescripcion("Destornillador");
		f.setNumero("58465");
		System.out.println("Codigo: " + f.getNumero() +"\nDescripcion: " + f.getDescripcion());
		System.out.println("Cantidad: " + f.getCantidad() + "\nPrecio x unidad: " + f.getPrecioUnidad()); 
		System.out.println("Monto Total:" + f.obtenerMontoFactura() + "\n-----------------");

	}
}