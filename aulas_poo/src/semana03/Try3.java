package semana03;

import javax.swing.JOptionPane;

public class Try3 {

	public static void main(String[] args) {
		
		while(true) {
				try {
				int n1 = Integer.parseInt(JOptionPane.showInputDialog("Digite n1: "));
				int n2 = Integer.parseInt(JOptionPane.showInputDialog("Digite n2: "));
				System.out.println(n1+n2);
				System.out.println(n1-n2);
				System.out.println(n1*n2);
				System.out.println(n1/n2);
				break;
			}
			catch(NumberFormatException erro) {
				JOptionPane.showMessageDialog(null, "Digite um valor inteiro!");
			}
			catch(ArithmeticException erro) {
				JOptionPane.showMessageDialog(null, "Não dividir por zero!");
			}
		}			

	}

}
