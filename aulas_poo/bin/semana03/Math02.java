package semana03;

public class Math02 {

	public static void main(String[] args) {
		for(int n=1;n<=5;n++) { //quantidade de cart�es
			for(int a=1;a<=6;a++) { // n�mero por cart�es
				System.out.print((int)(Math.random() * 100)+ " ");
			}
			System.out.println();
		}
	}

}
