package semana02;

public class For2 {
	
	public static void main(String[] args) throws InterruptedException {
		
		for(char a='A'; a<='z'; a++) {
			System.out.println(a + " " + (int)a);
			Thread.sleep(300);
		}
//		System.out.println();
//		
//		for(int a=10; a>0; a--) {
//			System.out.print(a + " ");
//			Thread.sleep(300);
//		}
	}

}
