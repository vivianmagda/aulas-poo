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
			JOptionPane.showMessageDialog(null, "Opera��es Matem�ticas\n"
				+ "Soma: " + (n1 + n2) + " \n"
				+ "Subtra��o: " + (n1 - n2) + "\n"
				+ "Multiplica��o: " + (n1 * n2) + "\n"
				+ "Divis�o: " + (n1 / n2) + "\n");
		}else {
			JOptionPane.showMessageDialog(null, "n2 n�o pode ser zero!");		
		}
		
	}

}
