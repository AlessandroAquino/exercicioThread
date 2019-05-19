package controller;

public class ThreadOp extends Thread{
	private int n;
	
	public ThreadOp(int n) {
		this.n = n;
	}
	
	public void run() {
		calc();
	}

	private void calc() {
		int res = n % 2;
		if (res == 0) {
			System.out.println("O quadrado de " + n + " é igual a " + Math.pow(n, 2));
		} else {
			System.out.println("A raiz quadrada de " + n + " é igual a " + Math.sqrt(n));
		}
		
	}

}
