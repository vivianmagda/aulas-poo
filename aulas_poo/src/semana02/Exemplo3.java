package semana02;

import java.util.Scanner;

public class Exemplo3 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in); //objeto para entrada de dados
		
		System.out.println("Digite n1: ");
		int n1 = sc.nextInt();
		
		System.out.println("Digite n2: ");
		int n2 = sc.nextInt();
		
		System.out.println(n1 & n2);
		System.out.println(n1 | n2);
		System.out.println(n1 + n2);
		System.out.println(n1 - n2);
		System.out.println(n1 * n2);
		System.out.println(n1 / n2);
		System.out.println(n1 % n2);
		
	}

}
