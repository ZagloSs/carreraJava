package main;

import java.util.Random;

public class cocheHilo extends Thread{
	private String id;
	private String[] posiNombre;
	public cocheHilo(String id) {
		
		this.id = id;
	}

	public synchronized void run() {
		Random r = new Random();
		
		int vuelta = 0;
		
		while(vuelta > 10) {
			try {
				Thread.sleep(r.nextLong(2500)+500);
				vuelta++;
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
		if (vuelta == 10) {
			
		}
	}
	
}
