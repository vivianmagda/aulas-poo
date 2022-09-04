package semana04;

/**
 * Lista 2 - Métodos
 * Esta classe contém os exercícios da lista 02 - Métodos.
 * @author Vivian Magda 
 *
 */
public class Exercicios {
		
	/**
	 * Exercício a:
	 * Um método que recebe um valor inteiro (n) e apresenta em tela 
	 * n números inteiros gerados aleatoriamente.
	 * @params n: valor inteiro n que representa a quantidade de 
	 * 			números que quer imprimir
	 * @return n números aleatórios
	 */
	public static void imprimirNumeros(int n) {
		String numeros = "";
		for(int i=1;i<=n;i++) {
			numeros += (int)(Math.random()*10);
		}
		System.out.println(numeros);	
	}
	
	/**
	 * b) Um método que recebe uma frase e retorna a quantidade de vogais
	 * existentes nessa frase.
	 * @params frase: frase na qual quer contar as vogais 
	 * @return quantidade de vogais encontradas
	 */
	
	public static int contarVogais(String frase) {
		frase = frase.toLowerCase();
		
		int qtdeVogais = 0;		
		for(int i=0;i<frase.length();i++) {				
			char c = frase.charAt(i);
			if(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u')
				qtdeVogais++;				
		}		
		return qtdeVogais;
	}	
	
	
	/**
	 * c) Um método que recebe três valores do tipo double e retorna a
	 * média entre esses valores.
	 * @params n1:Primeira nota
	 * @params n2: Segunda nota
	 * @params n3: Terceira nota
	 * @return media entre as 3 notas
	 */
	
	public static double media(double n1, double n2, double n3) {
		return (n1+n2+n3)/3;
	}	
	
	
	/**
	 * 
	 * d) Um método que recebe um vetor de inteiros e retorna a quantidade
	 * de números pares existentes.
	 * @params inteiros: vetor de números inteiros
	 * @return a quantidade de números pares do vetor digitado
	 * 
	 */
	
	public static int contarPares(int[] inteiros) {
		int contador = 0;
		for(int i=0;i<inteiros.length;i++) {
			if(inteiros[i]%2 == 0)
				contador++;
		}
		return contador;
	}
}
