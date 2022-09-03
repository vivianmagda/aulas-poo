package semana02;

import javax.swing.JOptionPane;

public class For4 {
	
	public static void main(String[] args) throws InterruptedException {
		
		for(int h=0; h<=23; h++) {
			for(int m=0; m<=59; m++) {
				for(int s=0; s<=59; s++) {
					System.out.println(h+":"+m+":"+s);
					Thread.sleep(100);
					if(h==0 && m==0 && s==30) {
						System.out.println("Chrissy wake up!");
					}
				}				
			}
		}
	}

}
