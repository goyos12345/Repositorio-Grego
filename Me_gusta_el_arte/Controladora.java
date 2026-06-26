package Me_gusta_el_arte;
import java.util.Scanner;


public class Controladora {

	public static void main(String[] args) {
		//fuck arte, 
		Scanner sc=new Scanner(System.in);
		Pintura pin1=new Pintura(null,null,0,null,null);
		Fotografia fot1=new Fotografia(null,null,0,null,null);
		Escultura esc1=new Escultura(null,null,0,null,0);
		
		System.out.println("-----------Ingresando datos de Pintura------------");
		int ruta=1;
		Ingreso(ruta,pin1,fot1,esc1);
		EspPin(pin1);
	
		System.out.println("-----------Ingresando datos de Fotografía---------");
		ruta=2;
		Ingreso(ruta,pin1,fot1,esc1);
		EspFot(fot1);
		
		System.out.println("----------Ingresando datos de Escultura-----------");
		ruta=3;
		Ingreso(ruta,pin1,fot1,esc1);
		EspEsc(esc1);
		
		System.out.println("\nDatos de Pintura:\n Autor / Título / ID / Técnica / Estilo\n"+pin1.getAutor()+ " / "+pin1.getTitulo()+" / "+pin1.getId()+" / "+pin1.getTecnica()+" / "+pin1.getEstilo()
		+ "\nDatos de Fotografía: \n Autor / Título / ID / Nombre de la cámara / Plano\n"+fot1.getAutor()+" / "+fot1.getTitulo()+" / "+fot1.getId()+" / "+fot1.getNombreCamara()+" / "+fot1.getPlano()
		+"\nDatos de Escultura: \n Autor / Título / ID / Material / Altura\n"+esc1.getAutor()+" / "+esc1.getTitulo()+" / "+esc1.getId()+" / "+esc1.getMaterial()+" / "+esc1.getAltura());
		
	}
	public static void Ingreso(int ruta, Pintura p, Fotografia f, Escultura e) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Ingrese el nombre del autor (use ¨_¨ en vez de espacios): ");
		String nom = sc.next();
		System.out.println("Ingrese el nombre de la obra(use ¨_¨ en vez de espacios):");
		String titu = sc.next();
		System.out.println("Ingresa el ID: ");
		int id=sc.nextInt();
		
		if (ruta == 1) {
			p.setAutor(nom);
			p.setTitulo(titu);
			p.setId(id);
		} else if (ruta == 2) {
			f.setAutor(nom); 
			f.setTitulo(titu);
			f.setId(id);
		} else {
			e.setAutor(nom);
			e.setTitulo(titu);
			e.setId(id);
		}

	}
	
	public static void EspPin(Pintura p) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Ingrese la técnica de la pintura (use ¨_¨ en vez de espacios): ");
		String tec=sc.next();
		p.setTecnica(tec);
		System.out.println("Ingrese el estilo de la pintura (use ¨_¨ en vez de espacios)");
		String est=sc.next();
		p.setEstilo(est);
	}
	public static void EspFot(Fotografia p) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Ingrese el nombre de la cámara (use ¨_¨ en vez de espacios): ");
		String tec=sc.next();
		p.setNombreCamara(tec);
		System.out.println("Ingrese el plano de la fotografía (use ¨_¨ en vez de espacios)");
		String est=sc.next();
		p.setPlano(est);
	}
	public static void EspEsc(Escultura p) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Ingrese el material de la escultura (use ¨_¨ en vez de espacios): ");
		String tec=sc.next();
		p.setMaterial(tec);
		System.out.println("Ingrese la altura de la escultura (use ¨_¨ en vez de espacios)");
		int est=sc.nextInt();
		p.setAltura(est);
	}
	
	

}
