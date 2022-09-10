package semana05;

/**
 * Classe contendo métodos para interagir com uma TV.
 * @author Vivian Magda RA: 1050481923024 09-set-2022
 *
 */

public class Tv {
	
	private boolean status;
	private int canal;
	private int volume;
	final int VOLUME_MINIMO = 1;
	final int VOLUME_MAXIMO = 99;
	final int PRIMEIRO_CANAL = 0;
	final int ULTIMO_CANAL = 999;
	
	
	/**
	 * Método para ligar a TV, mudando o estado do status de false para true.
	 */
	public void ligar() {
		status = true;
	}

	/**
	 * Método para desligar a TV, mudando o estado do status de true para false.
	 */

	public void desligar() {
		status = false;
	}

	/**
	 * Método para aumentar o volume da TV de um em um até o volume máximo.
	 */
	
	public void aumentarVolume() {
		if(volume<VOLUME_MAXIMO)
			volume++;
	}

	/**
	 * Método para diminuir o volume da TV de um em um até o volume mínimo.
	 */
	
	public void reduzirVolume() {
		if(volume>VOLUME_MINIMO)
			volume--;
	}

	/**
	 * Método para selecionar o canal da TV, crescendo de um em um até o último canal.
	 */
	
	public void aumentarCanal() {
		if(canal<ULTIMO_CANAL)
			canal++;
	}
	
	/**
	 * Método para selecionar o canal da TV, diminuindo de um em um até o primeiro canal.
	 */

	public void reduzirCanal() {
		if(canal>PRIMEIRO_CANAL)
			canal--;
	}

	/**
	 * Método para selecionar o canal desejado.
	 * @params c número (inteiro) do canal que deseja assistir. 
	 */
	
	public void definirCanal(int c) {
		if(c>PRIMEIRO_CANAL && c<ULTIMO_CANAL)
			canal = c;
	}

	/**
	 * Método para mostrar na tela o estado atual da Tv (se está ligada ou não, em qual canal e volume).
	 */
	
	public void mostrar() {
		System.out.println();
		System.out.println("Status: " + status);
		System.out.println("Canal: " + canal);
		System.out.println("Volume: " + volume);
	}
	
	/**
	 * Método que retorna o estado atual da Tv.
	 */

	public String toString() {
		return "\nStatus: " + status
				+ "\nCanal: " + canal
				+ "\nVolume: " + volume;		
	}
	

}
