package Main;

import java.util.Scanner;

import Entity.Alumnos;
import Implementacion.LogicaMetodos;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc= null;
		String matricula, nombre;
		int numCel, edad, menuPrinc;
		
		Alumnos alumno;
		
		LogicaMetodos imp = new LogicaMetodos();
		// se agrego esta linea de codigo
		System.out.println("HOLA MUNDO " +20);
		do {
			System.out.println("MENU PRINCIPAL");
			System.out.println("1---ALTA");
			System.out.println("2---MOSTRAR");
			System.out.println("3---BUSCAR");
			System.out.println("4---EDITAR");
			System.out.println("5---ELIMINAR");
			System.out.println("6---SALIR");
			
			sc=new Scanner(System.in);
			menuPrinc=sc.nextInt();
			
			switch (menuPrinc) {
			case 1:
				System.out.println("Ingrese la matricula");
				sc=new Scanner(System.in);
				matricula=sc.nextLine();
				
				System.out.println("Ingrese el nombre");
				sc=new Scanner(System.in);
				nombre=sc.nextLine();
				
				System.out.println("Ingrese el numero de celular");
				sc=new Scanner(System.in);
				numCel=sc.nextInt();
				
				System.out.println("Ingrese la edad");
				sc=new Scanner(System.in);
				edad=sc.nextInt();
				
				//Crear el objeto
				alumno = new Alumnos(matricula, nombre, numCel, edad);
				
				//Agregar al hashMap
				imp.guarda(alumno);
				System.out.println("Se guardo");
				break;
			case 2:
				imp.mostrar();
				break;
			case 3:
				System.out.println("Ingrese la matricula");
				sc=new Scanner(System.in);
				matricula=sc.nextLine();
				
				//Buscar
				alumno=imp.buscar(matricula);
				System.out.println("Se encontro el registro " + alumno); 
				break;
			case 4:
				System.out.println("Ingrese la matricula");
				sc=new Scanner(System.in);
				matricula=sc.nextLine();
				
				//Buscar
				alumno=imp.buscar(matricula);
				System.out.println("Ingresa el nuevo numero de celular");
				sc=new Scanner(System.in);
				numCel=sc.nextInt();
				//actualizar el objeto
				alumno.setNumCel(numCel);
				//actualizar el hashMap
				imp.editar(alumno);
				System.out.println("Se edito");
				
				break;
			case 5:
				System.out.println("Ingrese la matricula");
				sc=new Scanner(System.in);
				matricula=sc.nextLine();
				
				imp.eliminar(matricula);
				System.out.println("Se elimino");
				break;
			case 6:
				break;
			}
		}while(menuPrinc < 6);
		
		
	}

}
