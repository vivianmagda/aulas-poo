package semana02;

public class For1 {
	
	public static void main(String[] args) throws InterruptedException {
		
		for(int a=1; a<=10; a++) {
			System.out.print(a + " ");
			Thread.sleep(300);
		}
		System.out.println();
		
		for(int a=10; a>0; a--) {
			System.out.print(a + " ");
			Thread.sleep(300);
		}
	}

}
