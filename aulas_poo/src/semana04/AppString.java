package semana04;

import javax.swing.JOptionPane;

public class AppString {

	public static void main(String[] args) {
			/*
			String fraseOriginal = JOptionPane.showInputDialog("Digite uma frase: ");
			String fraseInvertida = ManipulaString.espelhar(fraseOriginal);			
			JOptionPane.showMessageDialog(null, fraseOriginal + "\n" + fraseInvertida);
			*/
		
		String p = "Sexta";
		String f = "Hoje é sexta.";
		System.out.println(ManipulaString.buscarPalavra(p, f));
			
	}

}
