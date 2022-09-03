package semana02;

import java.text.DecimalFormat;

import javax.swing.JOptionPane;

public class While1 {
	
	public static void main(String[] args) {
		
		DecimalFormat df = new DecimalFormat("##.00");		
		double total = 0;
		while(true) {
			float preco = Float.parseFloat(JOptionPane.showInputDialog("Preço?"));
			
			if(preco==0) break;			
			total += preco; //total = total + preco;	
			
		}
		
		JOptionPane.showMessageDialog(null, "Total = " + df.format(total));
	}

}
