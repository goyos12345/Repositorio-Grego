package NeeNee;

public class Clientes {
	String Nombre;
	String Apellido;
	int CI;
	String Compra;
	double PlataGas;
	int NumCompra;
	
	public void setNommbre(String Nombre) {
		this.Nombre=Nombre;
	}
	public String getNombre (String Nombre) {
		return Nombre;
	}
	//----------------------------------------------
	public void setApellido (String Apellido) {
		this.Apellido=Apellido;
	}
	public String getApellido(String Apellido) {
		return Apellido;
	}
	//-------------------------------------------------
	public void setCI(int CI) {
		this.CI=CI;
	}
	public int getCI(int CI) {
		return CI;
	}
	//-----------------------------------------------
	public void setCompra(String Compra) {
		this.Compra=Compra;
	}
	public String getCompra(String Compra) {
		return Compra;
	}
	//-----------------------------------------------
	public void setPlataGas(double PlataGas) {
		this.PlataGas=PlataGas;
	}
	public double getPlataGas(double PlataGas) {
		return PlataGas;
	}
	//-------------------------------------------------
	public void setNumcompra(int NumCompra) {
		this.NumCompra=NumCompra;
	}
	public int getNumCompra(int NumCompra) {
		return NumCompra;
	}
	//-----------------------------------------------
	public Clientes (String Nombre, String Apellido, int CI, String Compra, double PlataGas, int NumCompra) {
		super();
		this.Nombre=Nombre;
		this.Apellido=Apellido;
		this.CI=CI;
		this.Compra=Compra;
		this.PlataGas=PlataGas;
		this.NumCompra=NumCompra;
	}
	

}
