package laboratorio1.Factura;

public class Factura{
	private String num;
	private String desc;
	private int cant;
	private double precioUnidad;

	//Constructor
	public Factura(String num, String desc, int cant, double precioUnidad){
		this.num = num;
		this.desc = desc;
		this.cant = cant;
		this.precioUnidad = precioUnidad;

		if(cant < 0){
			cant = 0;
		}
		if(precioUnidad < 0){
			precioUnidad = 0;
		}
	}

	//Metodos de acceso 
	public String getNumero(){
		return num;
	}

	public String getDescripcion(){
		return desc;
	}

	public int getCantidad(){
		return cant;
	}

	public double getPrecioUnidad(){
		return precioUnidad;
	}

	public void setNumero(String num){
		this.num = num;
	}

	public void setDescripcion(String desc){
		this.desc = desc;
	}

	public void setCantidad(int cant){
		this.cant = (cant < 0) ? 0 : cant;
	}

	public void setPrecioUnidad(double precioUnidad){
		this.precioUnidad = (precioUnidad < 0) ? 0.0 : precioUnidad;
	}

	public double obtenerMontoFactura(){
		double monto = cant * precioUnidad;
		return monto;
	}
}