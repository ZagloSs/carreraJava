package main;

import java.util.ArrayList;


public class Main {

	public static void main(String[] args) {
		int nCoches = 10;
		ArrayList<cocheHilo> coches = new ArrayList<cocheHilo>();
		
		for(int i = 0; i < nCoches; i++) {
			coches.add(new cocheHilo(("C"+(i+1))));
			
		}
		
		
	}

}
