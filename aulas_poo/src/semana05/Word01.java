package semana05;

public class Word01 extends Thread { //thread: processo concorrente
	
	public void run() {
		Impressora.imprimir("Java");
	}
	
}