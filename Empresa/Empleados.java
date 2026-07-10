package Empresa;

public class Empleados extends Persona implements Envios {
	double Salario;

	public double getSalario() {
		return Salario;
	}

	public void setSalario(double salario) {
		Salario = salario;
	}

	public Empleados(int id, String nombre, String apellido, double salario) {
		super(id, nombre, apellido);
		Salario = salario;
	}

	@Override
	public void enviarEM(int id, Empleados E, Duenno D, Encargado En) {
		if (id == En.getId()) {
			System.out.println("Mail enviado");
		} else if (id != En.getId()) {
			System.out.println("No se ha podido comunicar con esta persona");
		}
	}

}
