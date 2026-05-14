package Paquete;

public class cliente extends Persona{
	int nroCliente;
	double deuda;
	String nrotelefono;
	public int getNroCliente() {
		return nroCliente;
	}
	public void setNroCliente(int nroCliente) {
		this.nroCliente = nroCliente;
	}
	public double getDeuda() {
		return deuda;
	}
	public void setDeuda(double deuda) {
		this.deuda = deuda;
	}
	public String getNrotelefono() {
		return nrotelefono;
	}
	public void setNrotelefono(String nrotelefono) {
		this.nrotelefono = nrotelefono;
	}
	public cliente(String nombre,String apellido,int cedula,int nroCliente, double deuda, String nrotelefono) {
		super(nombre,apellido,cedula);
		this.nroCliente = nroCliente;
		this.deuda = deuda;
		this.nrotelefono = nrotelefono;
	}
	

}
