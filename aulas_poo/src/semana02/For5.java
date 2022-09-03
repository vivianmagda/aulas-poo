package semana02;

public class For5 {
	
	public static void main(String[] args) throws InterruptedException {
		
		String[] alunos = {"Ana", "Bruno", "Camila", "Danilo", "Emily"};
		
		System.out.println("***Modelo 1***");
		for(int a=0; a<alunos.length; a++) {
			System.out.println(alunos[a]);
		}
		
		System.out.println();
		System.out.println("***Modelo 2***");
		
		for(String s:alunos) {	//iteração
			System.out.println(s);
		}
	}

}
