package semana04;

/**
 * Classe que cont�m diversos m�todos com retorno
 * @author vivian.magda - 02/09/2022
 *
 */

public class Calculos {
	
	/**
	 * Somar dois n�meros inteiros
	 * @param a: primeiro valor
	 * @param b: segundo valor
	 * @return: a soma dos valores
	 */
	public static int somar(int a, int b) {
		return a+b;		
	}
	
	/**
	 * Somar dois n�meros com ponto flutuante
	 * @param a: primeiro valor
	 * @param b: segundo valor
	 * @return: a soma dos valores
	 */
	public static float somar(float a, float b) {
		return a+b;		
	}
	
	/**
	 * Gera uma senha aleat�ria contendo 10 d�gitos
	 * @return: uma senha de 10 d�gitos
	 */
	public static String gerarSenha() {
		String senha = "";
		
		for(int i=1; i<=10; i++) {
		senha += (int)(Math.random()*10);
		}
		return senha;
		
	}

}
