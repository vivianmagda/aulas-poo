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
		
		JOptionPane.showMessageDialog(null, "Opera��es Matem�ticas \n"
				+ "Soma: " + soma + "\n"
				+ "Subtra��o: " + subtracao + "\n"
				+ "Multiplica��o: " + multiplicacao + "\n"
				+ "Divis�o: " + divisao + "\n");
		
	}

}
