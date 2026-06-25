package Bob_Destruye;

import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Casa cas1 = new Casa(null, 0, 0, 0);
		Apartamento edi1 = new Apartamento(null, 0, 0, null);

		int ruta = 1;
		System.out.println("-----------------Ingresando datos de casa-----------------");
		Insertar(ruta, cas1, edi1);
		System.out.println("Ingrese la cantidad de pisos: ");
		int pss = sc.nextInt();
		cas1.setCantPisos(pss);
		System.out.println("Ingrese el valor de la casa: ");
		double prec = sc.nextDouble();
		cas1.setPrecio(prec);

		System.out.println("--------------Ingresando datos de apartamento--------------");
		ruta = 2;
		Insertar(ruta, cas1, edi1);
		System.out.println("Ingrese el piso en el que se ubica: ");
		pss = sc.nextInt();
		edi1.setPiso(pss);
		System.out.println("Ingrese el nombre del edificio: ");
		String nomE = sc.next();
		edi1.setNomEdificio(nomE);
		
		System.out.println("Datos de casa \nCódigo postal / Nombre / Cant.pisos / Valor\n"+ cas1.getCodPostal() + " / "+ cas1.getNombre()+ " / "+cas1.getCantPisos()+ " / "+cas1.getPrecio() 
		+"\nDatos de apartamento\nCódigo postal / Nommbre / Piso en el que se ubica / Nombre del edificio\n"+edi1.getCodPostal()+" / "+edi1.getNombre()+ " / "+edi1.getPiso()+" / "+edi1.getNomEdificio());
		

	}

	public static void Insertar(int rut, Casa c, Apartamento a) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Ingrese el código postal del edificio: ");
		int cod = sc.nextInt();
		System.out.println("Ingrese el nombre del apartamento/casa: \nUse '_' en vez de espacios");
		String nom = sc.next();
		if (rut == 1) {
			c.setNombre(nom);
			c.setCodPostal(cod);
		} else {
			a.setNombre(nom);
			a.setCodPostal(cod);
		}
		// "cod" es código postal, no "Call of Duty"

	}

}
