package gsonsample;

import java.util.Scanner;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String n, a;
		int e;
		Persona p = null;
		try {
			System.out.println("Nombre: ");
			n = sc.nextLine();

			System.out.println("Apellidos: ");
			a = sc.nextLine();
			System.out.println("Edad: ");
			e = sc.nextInt();

			p = new Persona(n, a, e);

		} catch (Exception ex) {
			System.err.println("ERROR: TIPO DE DATO INCORRECTO" + ex.getMessage());
		}

		Gson gson = new GsonBuilder().setPrettyPrinting().create();
		String json = gson.toJson(p);
		System.out.println(json);

		sc.close();
	}

}
