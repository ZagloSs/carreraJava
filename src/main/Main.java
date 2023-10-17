package main;

import java.util.ArrayList;


public class Main {

	public static void main(String[] args) {
		int nCoches = 10;
		ArrayList<cocheHilo> coches = new ArrayList<cocheHilo>();
		String[] carrera = new String[nCoches];
		
		for(int i = 0; i < nCoches; i++) {
			coches.add(new cocheHilo(("C"+(i+1))));
			coches.get(i).start();
		}
		
		for(cocheHilo coche : coches) {
			try {
				coche.join();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		
		
		
		
		
	}

}
