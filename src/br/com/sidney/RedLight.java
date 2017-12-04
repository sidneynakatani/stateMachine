package br.com.sidney;

public class RedLight implements Semaphore {

	@Override
	public void doAction() {
		System.out.println("Red.");

	}

}
