package view;

import controller.ThreadVetor;

public class Principal {

	public static void main(String[] args) {
		int[]vetor = new int [1000];
		
		for(int i = 0 ; i < 1000 ; i++) {
			vetor[i] = (int)((Math.random()*100)+1);
		}
		
		Thread thVetor = new ThreadVetor(1, vetor);
		Thread thVetor2 = new ThreadVetor(2, vetor);
		
		thVetor.start();
		thVetor2.start();

	}

}
