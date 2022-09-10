package semana05;

public class Pincel {
	
	//atributos(estado)
	public String cor;
	public int tamanho;
	public double valor;
	
	public void mostrar() {
		System.out.println();
		System.out.println("Cor: " + cor);
		System.out.println("Tamanho: " + tamanho);
		System.out.println("Valor: R$" + valor);
		System.out.println();
	}
	
	public void abrirTampa() {
		System.out.println("Abrindo o pincel " + cor + "...");
	}
	
	public void fecharTampa() {
		System.out.println("Fechando o pincel " + cor + "...");
	}
	
	public void escrever() {
		System.out.println("Escrevendo em " + cor + "...");
	}
	
	

}
