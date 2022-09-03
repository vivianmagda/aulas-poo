package semana04;

/**
 * Classe de métodos relacionados a manipulção de String
 * @author vivian.magda 02.09.22
 *
 */

public class ManipulaString {
	
	/**
	 * Recebe uma String e a retorna invertida
	 * @param s: String original
	 * @return: String invertida 
	 */
	
	public static String espelhar(String s) {
		int t = s.length()-1;
		String invertida = "";
		for(int i=t;i>=0;i--) {
			invertida += s.charAt(i);
		}
		return invertida;
	}
	
	/**
	 * Verifica se uma palavra existe na frase e retorna true ou false.
	 * @param palavra: palavra que quer pesquisar
	 * @param frase: frase onde quer buscar a palavra
	 * @return: true ou false
	 */
	public static boolean buscarPalavra(String palavra, String frase) {
		palavra = palavra.toLowerCase();
		frase = frase.toLowerCase();
		int indice = frase.indexOf(palavra);
		return indice>=0;
//			if(indice>=0) return true;
//			else return false;
	}

}
