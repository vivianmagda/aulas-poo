/**
 * Essa classe s� tem m�todos, pra serem usados por outras classes
 */

package semana04;

public class Impressora {
	
	/*
	 * M�todo imprime em tela sempre  amesma coisa
	 */	
	public static void imprimir() {//especifica��o
		//corpo
		System.out.println("Apostila de Java");  //esse m�todo imprime sempre a mesma coisa
	}
	
	/**
	 * Recebe uma string e a imprime em tela
	 * @param s: a String a ser impressa
	 */
	
	public static void imprimir(String s) { //imprime a string que vc passar.
		System.out.println(s);				//m�todo com mesmo nome, mas com assinatura diferente;
	}
	
	/**
	 * Recebe duas Strings e as imprime concatenadas
	 * @param a: primeira string
	 * @param b: segunda string
	 */
	
	public static void imprimir(String a ,String b) { 
		System.out.println(a + b);			//imprime as duas String concatenadas
	}
	
	/**
	 * Recebe uma String e imprime em letras em caixa alta
	 * @param s: String a ser impressa
	 */
	
	public static void imprimirMaiusculas(String s) {
		System.out.println(s.toUpperCase());
		
	}
	
	/**
	 * Recebe uma String e imprime uma palavra por linha
	 * @param s: frase a ser impressa
	 */
	
	public static void imprimirPalavras(String s) {
		String[] palavras = s.split(" ");
		for(String x:palavras) {
			System.out.println(x);
		}
		
	}
	

}
