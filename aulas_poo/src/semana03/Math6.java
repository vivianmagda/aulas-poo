package semana03;

import javax.swing.JOptionPane;

public class Math6 {
	
	public static void main(String[] args) {
		//senha alfanumerica
		
		String senha = "";		
		String s = "!@#$%*abcdefghijklmnopqrstuvwxyzABCDEFG"
				+ "HIJKLMNOPQRSTUVWXYZ1234567890";
		int tamanho = s.length();
		
		
		
		for(int i=0; i<=15; i++) {
			int n = (int)(Math.random() * tamanho);
			senha+=s.charAt(n);
		}
		
		System.out.println(senha);
		
				
//		System.out.println(s.charAt(0));
//		System.out.println(s.charAt(1));
//		System.out.println(s.charAt(2)); 
		
		
	}

}
