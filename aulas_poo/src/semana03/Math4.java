package semana03;

import javax.swing.JOptionPane;

public class Math4 {
	
	public static void main(String[] args) {
		int q = Integer.parseInt(JOptionPane.showInputDialog("Quantidade? "));
		
		for(int i=1; i<=q; i++) { //senha de 10 dígitos
			int n = (int)(Math.random() *10);
			System.out.print(n);
		}
	}

}
