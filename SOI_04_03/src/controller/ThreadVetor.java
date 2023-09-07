package controller;

public class ThreadVetor extends Thread {

	private int valor;
	private int[]vetor;
	
	public ThreadVetor(int valor,int[] vetor) {
		this.valor = valor;
		this.vetor = vetor;
	}
	
	@Override
	public void run() {
		calc();
	}
	
	private void calc() {
		if(valor%2==0) {
			double TempIfor = System.nanoTime();
			for(int i = 0 ; i < 1000 ; i++) {
			}
			double TempFFor = System.nanoTime();
			double tempFinFor = ((TempFFor - TempIfor)/1000000000);
			System.out.println("O tempo para percorer o vetor com for é: "+tempFinFor);
		}else {
			double TempIEach = System.nanoTime();
			for(int i : vetor) {
			}
			double TempFEach = System.nanoTime();
			double tempFinEach = ((TempFEach - TempIEach)/1000000000);
			System.out.println("O tempo para percorer o vetor com for each é: "+tempFinEach);
		}
	}
	
}
