package no;
import java.util.Scanner;
public class main {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		//Declaracion de objetos
		Electronica ele1= new Electronica(0, null, 0, 0);
		Ropa rop1= new Ropa(0, null, null, null);
		Alimento ali1= new Alimento(0,null,null,0);
		//Declaracion de variables
		
			int rot=1;
			System.out.println("Producto de electronica");
			InsertarPyN(rot,ele1,rop1,ali1);
			System.out.println("Ingrese el voltaje del producto: ");
			int vo=sc.nextInt();
			System.out.println("Ingrese los mAh de la bateria (0 en caso de no tener): ");
			int mAh=sc.nextInt();
			ele1.setVoltaje(vo);
			ele1.setmAh(mAh);
			
			rot=2;
			System.out.println("Producto de ropa");
			InsertarPyN(rot,ele1,rop1,ali1);
			System.out.println("Ingrese el tipo de tela:");
			String tela=sc.next();
			System.out.println("Ingrese el talle:");
			String talle=sc.next();
			rop1.setTela(tela);
			rop1.setTalle(talle);
			
			rot=3;
			System.out.println("Producto alimenticio");
			InsertarPyN(rot,ele1,rop1,ali1);
			System.out.println("Ingrese la fecha de vencimiento (dia/mes/año): ");
			String ven=sc.next();
			System.out.println("Ingrese las calorias:");
			double calorias=sc.nextDouble();
			ali1.setCalorias(calorias);
			ali1.setFechaVen(ven);
			
			System.out.println("Producto de electronica \nNombre: "+ ele1.getNombre() + "\nPrecio: "+ele1.getPrecio() + "\nVoltaje: " + ele1.getVoltaje() + "\nmAh: "+ ele1.getmAh() + "\n\nProducto de ropa \nNombre: "+ rop1.getNombre() + 
					"\nPrecio: "+rop1.getPrecio() + "\nTela: " + rop1.getTela() + "\nTalle: "+ rop1.getTalle() + "\n\nProducto alimenticio \nNombre: "+ ali1.getNombre() + "\nPrecio: "+ali1.getPrecio() +"\nFecha de caducidad: "+ 
					ali1.getFechaVen()+"\nCalorias: "+ali1.getCalorias());
			
			
		}
	
	public static void InsertarPyN(int rot, Electronica e, Ropa r, Alimento a) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Ingrese el precio del producto: ");
		double pre=sc.nextDouble();
		System.out.println("Ingrese el nombre del producto: \nUse '_' en vez de espacios");
		String nom=sc.next();
		if (rot==1) {
			e.setNombre(nom);
			e.setPrecio(pre);
		} else if(rot==2) {
			r.setNombre(nom);
			r.setPrecio(pre);
		}else {
			a.setNombre(nom);
			a.setPrecio(pre);
		}
	
		
	}
	

}
