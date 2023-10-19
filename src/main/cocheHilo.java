package main;

import java.util.ArrayList;
import java.util.Random;

public class cocheHilo extends Thread{
	private String ide;
	private int vueltas= 0;
	podio podio;
	public cocheHilo(String id, podio podio) {
		this.podio = podio;
		this.ide = id;
	}

	public String getIde() {
		return ide;
	}


	public void setIde(String ide) {
		this.ide = ide;
	}


	public int getVueltas() {
		return vueltas;
	}


	public void setVueltas(int vueltas) {
		this.vueltas = vueltas;
	}


	public void run() {
		Random r = new Random();
		
		
		while(vueltas < 10) {
			try {
				Thread.sleep(0*(r.nextLong(2500)+500));
				vueltas++;
				if(podio.contains(this)) {
					podio.updatePodio(this);
				}else {
					podio.add(this);
				}
				
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}

	}
	
	
	
}
