package pcd.lab03.sem.ex;

import java.util.concurrent.Semaphore;

public class Ponger extends Thread {

	private Semaphore pingEvent;
	private Semaphore pongEvent;

	public Ponger(Semaphore pingEvent, Semaphore pongEvent) {
		this.pingEvent = pingEvent;
		this.pongEvent = pongEvent;
	}	
	
	public void run() {
		while (true) {
			try {
				pingEvent.acquire();
				System.out.println("pong!");
				pongEvent.release();
			} catch (Exception ex) {
				ex.printStackTrace();
			}
		}
	}
}