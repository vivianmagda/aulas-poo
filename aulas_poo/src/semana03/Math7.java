package semana03;

import javax.swing.JOptionPane;

public class Math7 {
	
	//ALBUM DA COPA - quanto vou gastar pra completar
	
	public static final int QUANTIDADE_FIGURINHAS = 670;
	public static final int PACOTINHO = 5;
	public static final int PREÇO_PACOTE = 4;
	public static int[] figurinha = new int[QUANTIDADE_FIGURINHAS];
	
	public static void main(String[] args) {
		
		int qtdePacotes = 0;
		
		do {//comprar n pacotinhos
			// abrir o pacotinho
			for(int i=0;i<PACOTINHO;i++) {
				int n = (int)(Math.random()*QUANTIDADE_FIGURINHAS);
				figurinha[n]=1;
			}
			qtdePacotes++;
		
		}while(albumCompleto()==false);
		
		System.out.println("Você compra: " + qtdePacotes + " pacotinhos.");
		System.out.println("Você gasta: " + qtdePacotes*PREÇO_PACOTE + " reais.");
		
	} 
	
	public static boolean albumCompleto() {
		int cont = 0;
		for(int f:figurinha) {
			if(f==1) cont++;
		}
		if(cont<QUANTIDADE_FIGURINHAS) {
			return false;
		}else {
			return true;
		}
	}

}
