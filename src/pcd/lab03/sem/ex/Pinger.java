package pcd.lab03.sem.ex;

import java.util.concurrent.Semaphore;

public class Pinger extends Thread {

	private Semaphore pingEvent;
	private Semaphore pongEvent;

	public Pinger(Semaphore pingEvent, Semaphore pongEvent) {
		this.pingEvent = pingEvent;
		this.pongEvent = pongEvent;
	}	
	
	public void run() {
		while (true) {
			try {
				System.out.println("ping!");
				pingEvent.release();
				pongEvent.acquire();
			} catch (Exception ex) {
				ex.printStackTrace();
			}
		}
	}
}