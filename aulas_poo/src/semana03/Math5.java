package semana03;

import javax.swing.JOptionPane;

public class Math5 {
	
	public static void main(String[] args) {
		//senha alfanumerica
		
		String s = "!@#$%*abcdefghijklmnopqrstuvwxyzABCDEFG"
				+ "HIJKLMNOPQRSTUVWXYZ1234567890";
		int tamanho = s.length();
		
		
		
		for(int i=0; i<=15; i++) {
			int n = (int)(Math.random() * tamanho);
			System.out.print(s.charAt(n));
		}
		
				
//		System.out.println(s.charAt(0));
//		System.out.println(s.charAt(1));
//		System.out.println(s.charAt(2)); 
		
		
	}

}
