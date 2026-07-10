package Empresa;
import java.util.Scanner;
public class main {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Duenno due1=new Duenno(1,"Juan","Peréz",-999999999);//(Compró RAM)
		Encargado enc1=new Encargado(2,"Mariano","Velazques",10);
		Empleados emp1=new Empleados(3,"Francisco", "Conchaian", 20000);
		int op=0;
		while (op!=4) {
			switch(op) {
			case 0:
				int id=0;
				System.out.println("Desde que cargo desea enviar un mail?\n1.Dueño \n2.Encargado \n3.Empleado \n4.Salir");
				op=sc.nextInt();
				break;
			case 1:
				System.out.println("Ingrese el ID de la persona a la que le quiere enviar el mail");
				id=sc.nextInt();
				due1.enviarEM(id, emp1, due1, enc1);
				sc.next();		
				break;
			case 2:
				System.out.println("Ingrese el ID de la persona a la que le quiere enviar el mail");
				id=sc.nextInt();
				enc1.enviarEM(id, emp1, due1, enc1); 
				break;
			case 3: 
				System.out.println("Ingrese el ID de la persona a la que le quiere enviar el mail");
				id=sc.nextInt();
				emp1.enviarEM(id, emp1, due1, enc1);
				break;
			
			}
		}
		

	}

}
