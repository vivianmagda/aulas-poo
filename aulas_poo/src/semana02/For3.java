package semana02;

public class For3 {
	
	public static void main(String[] args) throws InterruptedException {
		
		for(float a=1; a<=2; a+=0.1) {
			System.out.println(a);
			Thread.sleep(300);
		}
	}

}
