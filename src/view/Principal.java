package view;

import java.util.Random;
import controller.ThreadOp;

public class Principal {

	public static void main(String[] args) {
		Random random = new Random();
		int n = 1;
		for (int i=0; i<10; i++) {
			int num = random.nextInt(11);
			n = num;
			Thread tOp = new ThreadOp(n);
			tOp.start();
		}
	}

}
