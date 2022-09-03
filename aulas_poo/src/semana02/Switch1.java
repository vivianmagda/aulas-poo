package semana02;

import javax.swing.JOptionPane;

public class Switch1 {
	
	public static void main(String[] args) {
		
		String s = JOptionPane.showInputDialog("Mês? ");
		
		/*switch(s) {
		case "1":JOptionPane.showMessageDialog(null, "janeiro");break;
		case "2":JOptionPane.showMessageDialog(null,"fevereiro");break;
		case "3":JOptionPane.showMessageDialog(null,"março");break;
		case "4":JOptionPane.showMessageDialog(null,"abril");break;
		default:JOptionPane.showMessageDialog(null,"desconhecido");
		}*/
		
		String mes = "Desconhecido!";
		switch(s) {
			case "1":mes = "janeiro";break;
			case "2":mes = "fevereiro";break;
			case "3":mes = "março";break;
			case "4":mes = "abril";break;
		}
		
		JOptionPane.showMessageDialog(null,mes);
	}

}
