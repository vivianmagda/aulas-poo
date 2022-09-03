package semana02;

import javax.swing.JOptionPane;

public class Exemplo4 {

	public static void main(String[] args) {
		
		int n1 = Integer.parseInt(JOptionPane.showInputDialog("Digite n1: "));
		int n2 = Integer.parseInt(JOptionPane.showInputDialog("Digite n2: "));
		
		int soma = n1 + n2;
		int subtracao = n1 - n2;
		int multiplicacao = n1 * n2;
		int divisao = n1 / n2;
		
		JOptionPane.showMessageDialog(null, "Operações Matemáticas \n"
				+ "Soma: " + soma + "\n"
				+ "Subtração: " + subtracao + "\n"
				+ "Multiplicação: " + multiplicacao + "\n"
				+ "Divisão: " + divisao + "\n");
		
	}

}
