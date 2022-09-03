package semana03;

import javax.swing.JOptionPane;

public class Try2 {

	public static void main(String[] args) {
		
		while(true) {
				try {
				int a = Integer.parseInt(JOptionPane.showInputDialog("Digite a idade: "));
				JOptionPane.showMessageDialog(null, "Idade digitada: " + a);
				break;
			}
			catch(NumberFormatException erro) {
				JOptionPane.showMessageDialog(null, "Digite um valor inteiro!");
			}
		}			

	}

}
