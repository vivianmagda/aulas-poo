package semana03;

import javax.swing.JOptionPane;

public class Try1 {

	public static void main(String[] args) {
		
				
			try {
				int a = Integer.parseInt(JOptionPane.showInputDialog("Digite a idade: "));
				JOptionPane.showMessageDialog(null, "Idade digitada: " + a);
			}
			catch(NumberFormatException erro) {
				JOptionPane.showMessageDialog(null, "Digite um valor inteiro!");
			}
			finally {
				JOptionPane.showMessageDialog(null, "Fim da execução.");
			}
			

	}

}
