package mundo;

public class Decoracion {
	private int codigo;
	private int cantidad;
	private double valorInversion;
	private double valorVenta;
	
	public Decoracion(int codigo,int cantidad, double valorInversion,double valorVenta) {
		this.codigo = codigo;
		this.cantidad = cantidad;
		this.valorInversion = valorInversion;
		this.valorVenta = valorVenta;
		
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

	public double getValorInversion() {
		return valorInversion;
	}

	public void setValorInversion(double valorInversion) {
		this.valorInversion = valorInversion;
	}

	public double getValorVenta() {
		return valorVenta;
	}

	public void setValorVenta(double valorVenta) {
		this.valorVenta = valorVenta;
	}
	
}
