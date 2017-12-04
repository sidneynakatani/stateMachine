package br.com.sidney;

public class GreenLight implements Semaphore {

	@Override
	public void doAction() {
		System.out.println("Green.");

	}

}
