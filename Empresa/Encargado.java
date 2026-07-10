package Empresa;

public class Encargado extends Persona implements Envios {
	int acceso;

	public int getAcceso() {
		return acceso;
	}

	public void setAcceso(int acceso) {
		this.acceso = acceso;
	}

	public Encargado(int id, String nombre, String apellido, int acceso) {
		super(id, nombre, apellido);
		this.acceso = acceso;
	}

	@Override
	public void enviarEM(int id, Empleados E, Duenno D, Encargado En) {
		if (id == E.getId()) {
			System.out.println("Mail enviado");
		} else if (id != E.getId()&&id!=D.getId()) {
			//Esto es de que no se puede comunicar
			System.out.println("No se ha podido comunicar con esta persona");
		} else if(id ==D.getId()) {
			System.out.println("Mail enviado");
		}

	}
}
