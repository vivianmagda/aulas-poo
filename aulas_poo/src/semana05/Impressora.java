package semana05;

public class Impressora {
	
	synchronized public static void imprimir(String texto) {
		for(int i=0; i<=10; i++) {
			System.out.println(texto + " - pág. " + i);
			try {
				Thread.sleep(400);
			} catch (InterruptedException e) {
			}
		}		
	}

}
