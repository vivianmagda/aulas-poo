package semana03;

public class Math03 {

	public static void main(String[] args) {
		// lançar um dadinho de 6 lados
		int total = 0;
		for(int i=1; i<=10; i++) {
			int n = (int)(Math.random() *6) + 1;
			System.out.println(n);
			total += n;
		}
		System.out.println(total);

	}

}
