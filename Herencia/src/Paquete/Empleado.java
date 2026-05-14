package Paquete;

public class Empleado extends Persona {
	private double sueldo;
	private String horario;
	private String cargo;
	
	public void setSueldo (double s) {
		this.sueldo=s;
	}
	public void setHorario(String h) {
		this.horario=h;
	}
	public void setCargo(String ca) {
		this.cargo=ca;
	}
	public double getSueldo() {
		return sueldo;
	}
	public String getHorario() {
		return horario;
	}
	public String getCargo() {
		return cargo;
	}
	public Empleado(String nombre, String apellido,int cedula, double s,String h, String ca) {
		super(nombre, apellido, cedula);
		this.cargo=ca;
		this.horario=h;
		this.sueldo=s;
	}

}
