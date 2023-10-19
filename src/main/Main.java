package main;

import java.util.ArrayList;


public class Main {

	public static void main(String[] args) {
		int nCoches = 1;
		ArrayList<cocheHilo> coches = new ArrayList<cocheHilo>();
		podio podio = new podio(new ArrayList<cocheHilo>());
		
		
		for(int i = 0; i < nCoches; i++) {
			coches.add(new cocheHilo("C"+(i+1), podio));
			coches.get(i).start();
		}
		
		for(cocheHilo coche : coches) {
			try {
				Thread.sleep(2000);
				while(coche.isAlive()) {
					System.out.println(podio.getPosiciones().get(0).getVueltas());
				}
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
		}
		
		
		
		
		
		
		}
			
	}


