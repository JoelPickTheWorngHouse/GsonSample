package GSonSample;

import java.util.Scanner;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class Main {

	public static void main(String[] args) {
		
		//Introducir valores:
		Scanner sc=new Scanner(System.in);
		
		System.out.println("introduzca un nombre");
		String nombre=sc.nextLine();
		
		System.out.println("introduzca unos apellidos");
		String apellidos=sc.nextLine();
		
		System.out.println("introduzca una edad");
		int Edad=sc.nextInt();
		
		//Creación del objeto Persona:
		Persona p=new Persona(nombre,apellidos,Edad);

		//Conversión del objeto Persona:
		
		Gson gson=new GsonBuilder().setPrettyPrinting().create();
		String stringJson = gson.toJson(p);	//transforma Persona a JSon, en caso de que quisiera ser al revés sería .fromJSon
											//esto devuelve un String de ahí lo de guardarlo
		System.out.println(stringJson);
		
	}

}
