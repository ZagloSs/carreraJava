package main;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Cuantos Coches participarán en la carrera?");
		int nCoches = sc.nextInt();
		ArrayList<cocheHilo> coches = new ArrayList<cocheHilo>();
		
		for(int i = 0; i < nCoches; i++) {
			coches.add(new cocheHilo(("C"+(i+1))));
			
		}
		
		
	}

}
