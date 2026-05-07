package NeeNee;
import java.util.Scanner;
public class Gestor {

	public static void main(String[] args) {
		Clientes CLI1  =new Clientes("","",1,"",1,1);
		
		Scanner sc= new Scanner(System.in);
		int i=0;
		boolean anda=true;
		String nombre="0";
		String apellido="0";
		int CI=0;
		double pg=0;
		int ID=0;
		while (anda==true) {
		
		switch (i){
		case 0:
			System.out.println("Elija una opcion: \n1.Ingresar datos de cliente \n2.Salir");
			i=sc.nextInt();
		case 1:
			System.out.println("Ingresar datos de cliente: \nIngrese el nombre:");
			nombre=sc.next();
			CLI1.setNommbre(nombre);
			System.out.println("Ingrese el apellido:");
			apellido=sc.next();
			CLI1.setApellido(apellido);
			System.out.println("Ingrese la Cedula:");
			CI=sc.nextInt();
			CLI1.setCI(CI);
			System.out.println("Ingrese el dinero gastado:");
			pg=sc.nextDouble();
			CLI1.setPlataGas(pg);
			System.out.println("Ingrese el id del producto");
			ID=sc.nextInt();
			CLI1.setNumcompra(ID);
			System.out.println("Nombre: " + CLI1.getNombre(nombre) + " Apellido: " + CLI1.getApellido(apellido) + " CI " + CLI1.getCI(CI) + " Dinero gastado: " + CLI1.getPlataGas(pg) + " ID del producto: "+ CLI1.getNumCompra(ID) );
			i=0;
			break;
		case 2:
			System.out.println("Chau");
			break;
		default:
			System.out.println("Seleccione una opcion correcta");
			i=0;
			break;
			
		}
		}

	}

}
