package Supermercado;

import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		//Declaracion de objetos
		Electronica arrEle[]= new Electronica[10];
		Ropa arrRop[]= new Ropa[10];
		Alimento arrAli[]= new Alimento[10];
		//Declaracion de variables
		int op=0;
			while (op != 5) {
			switch (op) {
			case 0:
				System.out.println("Bienvenido al gestor del Dorado\n1-Alta de un producto\n2-Listar productos \n3-Dar de baja un producto \n4-Cambiar dato de un producto\n5-Salir");
				op = sc.nextInt();
				break;

			case 1:
				System.out.println("Seleccione que tipo de producto quiere agregar: \n1.Electrónica \n2.Ropa \n3.Alimento");
				int case1Op=sc.nextInt();
				
				if (case1Op==1) {
					System.out.println("-------------Ingresando datos de electrónica--------------\nIngrese el precio del producto: ");
					double precio=sc.nextDouble();
					System.out.println("Ingrese el nombre del producto (Utilize '_' en vez de espacios):");
					String nombre=sc.next();
					System.out.println("Ingrese el voltaje del producto: ");
					int v=sc.nextInt();
					System.out.println("Ingrese los mAh del producto:");
					int mAh=sc.nextInt();
					altaElectro(arrEle, precio, nombre, v,mAh);
					
				}else if (case1Op==2) {
					System.out.println("-------------Ingresando datos de ropa--------------\nIngrese el precio del producto: ");
					double precio=sc.nextDouble();
					System.out.println("Ingrese el nombre del producto (Utilize '_' en vez de espacios):");
					String nombre=sc.next();
					System.out.println("Ingrese el tipo de tela del producto (Utilize '_' en vez de espacios): ");
					String tela=sc.next();
					System.out.println("Ingrese el talle del producto:");
					String talle=sc.next();
					altaRopa(arrRop, precio, nombre, tela, talle);
					
				} else if (case1Op==3) {
					System.out.println("-------------Ingresando datos de alimento--------------\nIngrese el precio del producto: ");
					double precio=sc.nextDouble();
					System.out.println("Ingrese el nombre del producto (Utilize '_' en vez de espacios):");
					String nombre=sc.next();
					System.out.println("Ingrese la fecha de vencimiento del producto (día/mes/año): ");
					String FechaVen=sc.next();
					System.out.println("Ingrese las calorías del producto:");
					double calorias=sc.nextDouble();
					altaAlimen(arrAli, precio, nombre, FechaVen, calorias);
					
				}
				op = 0;
				break;

			case 2:
				System.out.println("Productos de electrónica: \nID / Precio / Nombre / Voltaje / mAh");
				listarEle(arrEle);
				System.out.println("Productos de ropa: \nID / Precio / Nombre / Tela / Talle");
				listarRop(arrRop);
				System.out.println("Productos de electrónica: \nID / Precio / Nombre / Fecha de vencimiento / Calorías");
				listarAli(arrAli);
				op = 0;
				break;
				
			case 3:
				System.out.println("Baja de productos \nEscriba el tipo de producto que desea eliminar: \n1.Electronica \n2.Ropa \n3.Alimento \nSeleccione cualquier otro valor para salir");
				int case3Op = sc.nextInt();
				if (case3Op==1) {
					System.out.println("Ingrese el ID del producto: ");
					int id=sc.nextInt();
					bajaEle(id, arrEle);
				}
				if (case3Op==2) {
					System.out.println("Ingrese el ID del producto: ");
					int id=sc.nextInt();
					bajaRop(id, arrRop);
				}
				if (case3Op==3) {
					System.out.println("Ingrese el ID del producto: ");
					int id=sc.nextInt();
					bajaAli(id, arrAli);
				}
				
				op = 0;
				break;
				
			case 4:
				System.out.println("Cambiar valor de Atributo de un producto\nIngrese el tipo de producto que quiera modificar: \n1.Electronica \n2.Ropa \n3.Alimento");
				int case4Op=sc.nextInt();
				if (case4Op==1) {
					System.out.println("Ingrese el id del producto");
					int id=sc.nextInt();
					modificarEle(id, arrEle);
				}
				if (case4Op==2) {
					System.out.println("Ingrese el id del producto");
					int id=sc.nextInt();
					modificarRop(id, arrRop);
				}
				if (case4Op==3) {
					System.out.println("Ingrese el id del producto");
					int id=sc.nextInt();
					modificarAli(id, arrAli);
				}
				if (case4Op<1||case4Op>3) {
					System.out.println("Opcion inexistente\n");
				}
				op = 0;
				break;

			default:
				System.out.println("Por acá no es");
				op = 0;
				break;

			}
		}
			
			
		}
	
	public static void altaElectro(Electronica [] a, double p, String n, int v, int m) {  

			for (int i = 0; i < a.length; i++) {
				if (a[i] != null) {
					System.out.print("");

				} else {
					if (a[i] == null) {
						int nId=i;
						a[i] = new Electronica(p, n,nId, v, m);
						System.out.println("ID: " + i);
						System.out.println("Electrónico guardado\n");
						break;
					}

				}
			}

	
	}
	public static void altaRopa(Ropa [] a, double p, String n, String t, String tall) {  

		for (int i = 0; i < a.length; i++) {
			if (a[i] != null) {
				System.out.print("");

			} else {
				if (a[i] == null) {
					int nId=i;
					a[i] = new Ropa(p, n,nId, t, tall);
					System.out.println("ID: " + i);
					System.out.println("Prenda guardada\n");
					break;
				}

			}
		}


}
	public static void altaAlimen(Alimento [] a, double p, String n, String t, double c) {  

		for (int i = 0; i < a.length; i++) {
			if (a[i] != null) {
				System.out.print("");

			} else {
				if (a[i] == null) {
					int nId=i;
					a[i] = new Alimento(p, n,nId, t, c);
					System.out.println("ID: " + i);
					System.out.println("Alimento guardado\n");
					break;
				}

			}
		}


}
	public static void listarEle(Electronica[] ar) {

		for (int i = 0; i < ar.length; i++) {
			if (ar[i] != null) {

				System.out.print(ar[i].getId()+ " / "
				+ar[i].getPrecio() + " / " 
				+ ar[i].getNombre() + " / "
				+ ar[i].getVoltaje() + " / "
				+ ar[i].getmAh()+"\n");
				
			}

		}

	}
	public static void listarAli(Alimento[] ar) {

		for (int i = 0; i < ar.length; i++) {
			if (ar[i] != null) {

				System.out.print(ar[i].getId()+" / "
				+ar[i].getPrecio() + " / " 
				+ ar[i].getNombre() + " / "
				+ ar[i].getFechaVen() + " / "
				+ ar[i].getCalorias()+"\n");
				
			}

		}

	}
	public static void listarRop(Ropa[] ar) {

		for (int i = 0; i < ar.length; i++) {
			if (ar[i] != null) {

				System.out.print(ar[i].getId()+" / "
				+ar[i].getPrecio() + " / " 
				+ ar[i].getNombre() + " / "
				+ ar[i].getTela() + " / "
				+ ar[i].getTalle()+"\n");
				
			}

		}

	}
	public static void bajaEle(int id, Electronica[] arg) {
		boolean com=false;

		for (int i = 0; i < arg.length; i++) {
		
			if (arg[i]!=null && arg[i].getId() == id) {
				arg[i] = null;
				System.out.println(
						"Producto eliminado\n");
				com=true;
				break;
			}
		} 
		if (com==false) {
		System.out.println("Producto no encontrado\n");
		}

	}
	public static void bajaRop(int id, Ropa[] arg) {

		for (int i = 0; i < arg.length; i++) {
			if (arg[i].getId() == id) {
				arg[i] = null;
				System.out.println(
						"Producto eliminado\n");
				break;
			}
		} 
		System.out.println("Producto no encontrado\n");

	}
	public static void bajaAli(int id, Alimento[] arg) {

		for (int i = 0; i < arg.length; i++) {
			if (arg[i].getId() == id) {
				arg[i] = null;
				System.out.println(
						"Producto eliminado\n");
				break;
			}
		} 
		System.out.println("Producto no encontrado\n");

	}
	public static void modificarEle(int id, Electronica[] arge) {

		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < arge.length; i++) {
			

			if (arge[i]!=null && arge[i].getId() == id) {  
			

				System.out.println("Seleccione el atributo que quiera modificar: \n1.Precio \n2.Nombre  \n3.Voltaje \n4.mAh");
				int oi = sc.nextInt();

				if (oi == 1) {

					System.out.println("Cambiando precio \nIngrese el precio deseado: ");
					double cd = sc.nextDouble();
					arge[i].setPrecio(cd);
					System.out.println("Dato cambiado\n");
					break;
				}

				if (oi == 2) {
					System.out.println("Cambiando nombre \nIngrese el nombre deseado: ");
					String mar = sc.next();
					arge[i].setNombre(mar);
					System.out.println("Dato cambiado\n");
					break;
				}
				if (oi == 3) {

					System.out.println("Cambiando voltaje \nIngrese el voltaje deseado: ");
					int cd = sc.nextInt();
					arge[i].setVoltaje(cd);
					System.out.println("Dato cambiado\n");
					break;
				}
				if (oi == 4) {
					System.out.println("Cambiando mAh \nIngrese los mAh deseados: ");
					int cd = sc.nextInt();
					arge[i].setmAh(cd);
					System.out.println("Dato cambiado\n");
					break;
				}
				
				
				if (oi < 1 || oi > 4) {
					System.out.println("Seleccione una opcion correcta\n");
					break;
				}
			}else {
				System.out.println("Espacio comprobado");
			}

		}
	}
	public static void modificarRop(int id, Ropa[] arge) {

		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < arge.length; i++) {
			

			if (arge[i]!=null && arge[i].getId() == id) {  
			

				System.out.println("Seleccione el atributo que quiera modificar: \n1.Precio \n2.Nombre  \n3.Tela \n4.Talle");
				int oi = sc.nextInt();

				if (oi == 1) {

					System.out.println("Cambiando precio \nIngrese el precio deseado: ");
					double cd = sc.nextDouble();
					arge[i].setPrecio(cd);
					System.out.println("Dato cambiado\n");
					break;
				}

				if (oi == 2) {
					System.out.println("Cambiando nombre \nIngrese el nombre deseado: ");
					String mar = sc.next();
					arge[i].setNombre(mar);
					System.out.println("Dato cambiado\n");
					break;
				}
				if (oi == 3) {

					System.out.println("Cambiando tipo de tela\nIngrese el tipo de tela deseado: ");
					String tela=sc.next();
					arge[i].setTela(tela);
					System.out.println("Dato cambiado\n");
					break;
				}
				if (oi == 4) {
					System.out.println("Cambiando talle \nIngrese el talle deseado: ");
					String talle=sc.next();
					arge[i].setTalle(talle);
					System.out.println("Dato cambiado\n");
					break;
				}
				
				
				if (oi < 1 || oi > 4) {
					System.out.println("Seleccione una opcion correcta\n");
					break;
				}
			}else {
				System.out.println("Espacio comprobado");
			}

		}
	}
	public static void modificarAli(int id, Alimento[] arge) {

		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < arge.length; i++) {
			

			if (arge[i]!=null && arge[i].getId() == id) {  
			

				System.out.println("Seleccione el atributo que quiera modificar: \n1.Precio \n2.Nombre  \n3.Fecha de vencimiento \n4.Calorías");
				int oi = sc.nextInt();

				if (oi == 1) {

					System.out.println("Cambiando precio \nIngrese el precio deseado: ");
					double cd = sc.nextDouble();
					arge[i].setPrecio(cd);
					System.out.println("Dato cambiado\n");
					break;
				}

				if (oi == 2) {
					System.out.println("Cambiando nombre \nIngrese el nombre deseado: ");
					String mar = sc.next();
					arge[i].setNombre(mar);
					System.out.println("Dato cambiado\n");
					break;
				}
				if (oi == 3) {

					System.out.println("Cambiando fecha de vencimiento \nIngrese la fecha de vencimiento deseada: ");
					String FV=sc.next();
					arge[i].setFechaVen(FV);
					System.out.println("Dato cambiado\n");
					break;
				}
				if (oi == 4) {
					System.out.println("Cambiando calorías\nIngrese las calorías deseadas: ");
					int cd = sc.nextInt();
					arge[i].setCalorias(cd);
					System.out.println("Dato cambiado\n");
					break;
				}
				
				
				if (oi < 1 || oi > 4) {
					System.out.println("Seleccione una opcion correcta\n");
					break;
				}
			}else {
				System.out.println("Espacio comprobado");
			}

		}
	}

}
