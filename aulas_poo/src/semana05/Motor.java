package semana05;

public class Motor {
	//atributos: estados do objeto
	private boolean status;
	private int velocidade;
	final int VELOCIDADE_MAXIMA = 100;
	final int VELOCIDADE_MINIMA = 0;
	
	//métodos: comportamento do objeto
	public void mostrar() {
		System.out.println();
		System.out.println("Ligado: " + status);
		System.out.println("Velocidade: " + velocidade);
	}
	
	public void ligar() {
			status = true;
	}
	
	public void desligar() {
		status = false;
	}
	
	public void acelerar() {
		if(velocidade<VELOCIDADE_MAXIMA)
			velocidade++;
	}
	
	public void frear() {
		if(velocidade>VELOCIDADE_MINIMA)
		velocidade--;
	}
	
	public String toString() {
		return "\n" + "[" + status + ", " + velocidade + "]";
	}

}
