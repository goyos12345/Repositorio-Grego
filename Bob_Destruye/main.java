package Bob_Destruye;

import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Casa arrCas[] = new Casa[10];
		Apartamento arrApa[] = new Apartamento[10];
		int op = 0;
		while (op != 5) {
			switch (op) {
			case 0:
				System.out.println(
						"Bienvenido al gestor de la inmobiliaria\n1-Alta de un elemento\n2-Listar elementos \n3-Dar de baja un elemento \n4-Cambiar dato de un elemento\n5-Salir");
				op = sc.nextInt();
				break;

			case 1:
				System.out.println("Seleccione que tipo de elemento quiere agregar: \n1.Casa \n2.Apartamento");
				int case1Op = sc.nextInt();

				if (case1Op == 1) {
					System.out.println(
							"-------------Ingresando datos de la casa--------------\nIngrese el nombre (Utilize '_' en vez de espacios): ");
					String n = sc.next();
					System.out.println("Ingrese el código postal:");
					int cd = sc.nextInt();
					System.out.println("Ingrese la cantidad de pisos: ");
					int pp = sc.nextInt();
					System.out.println("Ingrese el precio de la casa:");
					double p = sc.nextInt();
					altaCas(arrCas, n, cd, pp, p);

				} else if (case1Op == 2) {
					
					System.out.println(
							"-------------Ingresando datos del apartamento--------------\nIngrese el nombre (Utilize '_' en vez de espacios): ");
					String n = sc.next();
					System.out.println("Ingrese el código postal:");
					int cd = sc.nextInt();
					System.out.println("Ingrese en que piso está: ");
					int pp = sc.nextInt();
					System.out.println("Ingrese el nombre del edificio en el que se ubica:");
					String p = sc.next();
					altaApa(arrApa, n, cd, pp, p);
				}
				op = 0;
				break;
				

			case 2:
				System.out.println("Casas: \nID / Nombre / Cód.postal / Pisos / Precio");
				listarCas(arrCas);
				System.out.println("----------------------------------------------------");
				System.out.println("Apartamentos: \nID / Nombre / Cod.postal / Piso / Nombre del edificio");
				listarApa(arrApa);
				System.out.println("----------------------------------------------------");
				op = 0;
				break;

			case 3:
				System.out.println(
						"Baja de elementos \nEscriba el tipo de elemento que desea eliminar: \n1.Casa \n2.Apartamento \nSeleccione cualquier otro valor para salir");
				int case3Op = sc.nextInt();
				if (case3Op == 1) {
					System.out.println("Ingrese el ID de la casa: ");
					int id = sc.nextInt();
					bajaCas(id, arrCas);
				}
				if (case3Op == 2) {
					System.out.println("Ingrese el ID del apartamento: ");
					int id = sc.nextInt();
					bajaApa(id, arrApa);
				}

				op = 0;
				break;

			case 4:
				System.out.println(
						"Cambiar valor de Atributo de una publicación\nIngrese el tipo de publicación que quiera modificar: \n1.Libro \n2.Revista \n3.Artículo científico");
				int case4Op = sc.nextInt();
				if (case4Op == 1) {
					System.out.println("Ingrese el id de la publicación");
					int id = sc.nextInt();
					modificarCas(id, arrCas);
				}
				if (case4Op == 2) {
					System.out.println("Ingrese el id del publicación");
					int id = sc.nextInt();
					modificarApa(id, arrApa);
				}
	
				if (case4Op < 1 || case4Op > 2) {
					System.out.println("Opción inexistente\n");
				}
				op = 0;
				break;
			default:
				System.out.println("Por acá no es");
				op = 0;
				break;

			}
		}
		System.out.println("Gracias por usar nuestro programa!");
	}

	public static void altaApa(Apartamento[] a, String p, int n, int v, String m) {

		for (int i = 0; i < a.length; i++) {
			if (a[i] != null) {
				System.out.print("");

			} else {
				if (a[i] == null) {
					int nId = i;
					a[i] = new Apartamento(p, n, nId, v, m);
					System.out.println("ID: " + i);
					System.out.println("Apartamento guardado\n");
					break;
				}

			}
		}

	}

	public static void altaCas(Casa[] a, String p, int n, int t, double c) {

		for (int i = 0; i < a.length; i++) {
			if (a[i] != null) {
				System.out.print("");

			} else {
				if (a[i] == null) {
					int nId = i;
					a[i] = new Casa(p, n, nId, t, c);
					System.out.println("ID: " + i);
					System.out.println("Casa guardada\n");
					break;
				}

			}
		}

	}

	public static void listarCas(Casa[] ar) {

		for (int i = 0; i < ar.length; i++) {
			if (ar[i] != null) {

				System.out.print(ar[i].getId() + " / " + ar[i].getNombre() + " / " + ar[i].getCodPostal() + " / "
						+ ar[i].getCantPisos() + " / " + ar[i].getPrecio());

			}

		}

	}

	public static void listarApa(Apartamento[] ar) {

		for (int i = 0; i < ar.length; i++) {
			if (ar[i] != null) {

				System.out.println(ar[i].getId() + " / " + ar[i].getNombre() + " / " + ar[i].getCodPostal() + " / "
						+ ar[i].getPiso() + " / " + ar[i].getNomEdificio());

			}

		}

	}

	public static void bajaCas(int id, Casa[] arg) {
		boolean com = false;

		for (int i = 0; i < arg.length; i++) {

			if (arg[i] != null && arg[i].getId() == id) {
				arg[i] = null;
				System.out.println("Casa eliminada\n");
				com = true;
				break;
			}
		}
		if (com == false) {
			System.out.println("Casa no encontrada\n");
		}

	}

	public static void bajaApa(int id, Apartamento[] arg) {
		boolean com = false;

		for (int i = 0; i < arg.length; i++) {

			if (arg[i] != null && arg[i].getId() == id) {
				arg[i] = null;
				System.out.println("Apartamento eliminado\n");
				com = true;
				break;
			}
		}
		if (com == false) {
			System.out.println("Apartamento no encontrado\n");
		}

	}

	public static void modificarCas(int id, Casa[] arge) {

		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < arge.length; i++) {

			if (arge[i] != null && arge[i].getId() == id) {

				System.out.println(
						"Seleccione el atributo que quiera modificar: \n1.Nombe \n2.Código postal  \n3.Pisos \n4.Precio");
				int oi = sc.nextInt();

				if (oi == 1) {

					System.out.println("Cambiando autor \nIngrese el autor deseado: ");
					String cd = sc.next();
					arge[i].setNombre(cd);
					System.out.println("Dato cambiado\n");
					break;
				}

				if (oi == 2) {
					System.out.println("Cambiando cod.postal \nIngrese el cód.postal deseado: ");
					int mar = sc.nextInt();
					arge[i].setCodPostal(mar);
					System.out.println("Dato cambiado\n");
					break;
				}
				if (oi == 3) {

					System.out.println("Cambiando cantidad de pisos \nIngrese cantidad de pisos deseada: ");
					int cd = sc.nextInt();
					arge[i].setCantPisos(cd);
					System.out.println("Dato cambiado\n");
					break;
				}
				if (oi == 4) {
					System.out.println("Cambiando precio \nIngrese el precio deseado: ");
					double cd = sc.nextDouble();
					arge[i].setPrecio(cd);
					System.out.println("Dato cambiado\n");
					break;
				}

				if (oi < 1 || oi > 4) {
					System.out.println("Seleccione una opcion correcta\n");
					break;
				}
			} else {
				System.out.println("Espacio comprobado...");
			}

		}
	}

	public static void modificarApa(int id, Apartamento[] arge) {

		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < arge.length; i++) {

			if (arge[i] != null && arge[i].getId() == id) {

				System.out.println(
						"Seleccione el atributo que quiera modificar: \n1.Nombe \n2.Código postal  \n3.Pisos \n4.Precio");
				int oi = sc.nextInt();

				if (oi == 1) {

					System.out.println("Cambiando autor \nIngrese el autor deseado: ");
					String cd = sc.next();
					arge[i].setNombre(cd);
					System.out.println("Dato cambiado\n");
					break;
				}

				if (oi == 2) {
					System.out.println("Cambiando cod.postal \nIngrese el cód.postal deseado: ");
					int mar = sc.nextInt();
					arge[i].setCodPostal(mar);
					System.out.println("Dato cambiado\n");
					break;
				}
				if (oi == 3) {

					System.out.println("Cambiando el piso en el que se ubica el departamento \nIngrese piso deseado: ");
					int cd = sc.nextInt();
					arge[i].setPiso(cd);
					System.out.println("Dato cambiado\n");
					break;
				}
				if (oi == 4) {
					System.out.println("Cambiando nombre del edificio \nIngrese el nombre deseado: ");
					String cd = sc.next();
					arge[i].setNomEdificio(cd);
					System.out.println("Dato cambiado\n");
					break;
				}

				if (oi < 1 || oi > 4) {
					System.out.println("Seleccione una opcion correcta\n");
					break;
				}
			} else {
				System.out.println("Espacio comprobado...");
			}

		}
	}
}

	