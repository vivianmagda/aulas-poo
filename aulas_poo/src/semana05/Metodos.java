package semana05;

public class Metodos {
	
	public static int somar(int a, int b) {
		return a+b;
	}
	
	public static int somar(int[] n) {
		int total = 0;
		for(int x:n) {
			total += x;
		}
		return total;
	}
	
	public static float somar2(float...n) {
		float total = 0;
		for(int i=0;i<n.length;i++)
			total += n[i];
		return total;
	}
	
	public static int somatorio(int n) {
		int total = 0;
		for(int i=n; i>0; i--) {
			total += i;
			System.out.println(total);
		}
		return total;
	}
	
	public static int somatorioRecursivo(int n) {
		if(n==1) 
			return 1;
		else {
			return n + somatorioRecursivo(--n);
		}
			
	}
	

}
