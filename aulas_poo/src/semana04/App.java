package semana04;

public class App {
	
	public static void main(String[] args) {
		
		int s = Calculos.somar(10, 20);
		System.out.println(s);
		
		System.out.println(Calculos.somar(2.3f, 3.2f));
		
		
		/*
		Impressora.imprimir();
		Impressora.imprimir("Apostila de Python");
		Impressora.imprimir("Vivian", "Magda");
		Impressora.imprimirMaiusculas("Apostila de C++");		
		Impressora.imprimirPalavras("Deus é luz e nele não há trevas!");
		*/
		
		System.out.println(Calculos.gerarSenha());
			
	}

}
