package semana03;

import javax.swing.JOptionPane;

public class Try8 {

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
			catch(Exception erro) {
				JOptionPane.showMessageDialog(null, erro);
			}
		}			

	}

}
