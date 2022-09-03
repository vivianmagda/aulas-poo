package semana03;

public class Math02 {

	public static void main(String[] args) {
		for(int n=1;n<=5;n++) { //quantidade de cartões
			for(int a=1;a<=6;a++) { // número por cartões
				System.out.print((int)(Math.random() * 100)+ " ");
			}
			System.out.println();
		}
	}

}
