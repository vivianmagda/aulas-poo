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
		Impressora.imprimirPalavras("Deus � luz e nele n�o h� trevas!");
		*/
		
		System.out.println(Calculos.gerarSenha());
			
	}

}
