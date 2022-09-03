package semana02;

import javax.swing.JOptionPane;

public class Exemplo5 {

	public static void main(String[] args) {
		
		int n1 = Integer.parseInt(JOptionPane.showInputDialog("Digite n1: "));
		int n2 = Integer.parseInt(JOptionPane.showInputDialog("Digite n2: "));
		
		/*int soma = n1 + n2;
		int subtracao = n1 - n2;
		int multiplicacao = n1 * n2;
		int divisao = n1 / n2;*/
		
		if(n2!=0) {		
			JOptionPane.showMessageDialog(null, "Operações Matemáticas\n"
				+ "Soma: " + (n1 + n2) + " \n"
				+ "Subtração: " + (n1 - n2) + "\n"
				+ "Multiplicação: " + (n1 * n2) + "\n"
				+ "Divisão: " + (n1 / n2) + "\n");
		}else {
			JOptionPane.showMessageDialog(null, "n2 não pode ser zero!");		
		}
		
	}

}
