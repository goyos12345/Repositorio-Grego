package Interfaz;
import java.util.Scanner;
public class Gestor {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Perro per1=new Perro(0, "Hayk", 0, 0);
		Dinosaurio din1=new Dinosaurio(0,"rftgyh",10, 10);
		int op=0;
		
		while (0!=5) {
			switch(op){
			case 0:
				System.out.println("1.Perro Come \n2.Perro duerme \n3.Dinosaurio come \n4.Dinosaurio duerme");
				op=sc.nextInt();
				break;
			case 1:
				System.out.println("HBNJMK;:");
				per1.comer();
				op=0;
				break;
			case 2:
				System.out.println("zesxfdvuhikl");
				per1.dormir();
				op=0;
				break;
			case 3:
				System.out.println("dxcfgvhbjnkm");
				din1.comer();
				op=0;
				break;
			case 4:
				System.out.println("sdfyghuj");
				din1.dormir();
				op=0;
				break;
			}
			
		}

	}

}
