package semana02;

import javax.swing.JOptionPane;

public class If03 {

	public static void main(String[] args) {
		
		String s = JOptionPane.showInputDialog("Mês? ");
		if(s.equals("1")) {
			JOptionPane.showMessageDialog(null, "janeiro");
		}else if(s.equals("2")) {
			JOptionPane.showMessageDialog(null, "fevereiro");
		}else if(s.equals("3")) {
			JOptionPane.showMessageDialog(null, "março");
		}
		
	}

}
