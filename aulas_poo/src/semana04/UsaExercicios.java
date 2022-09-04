package semana04;

/**
 * Lista 2 - Métodos
 * Esta classe testa os métodos criados na classe Exercicios
 * @author Vivian Magda
 *
 */
public class UsaExercicios {

	public static void main(String[] args) {
		
		Exercicios.imprimirNumeros(10);
		Exercicios.imprimirNumeros(5);
		
		System.out.println(Exercicios.contarVogais("Ana Maria"));
		System.out.println(Exercicios.contarVogais("ana Maria"));
		System.out.println(Exercicios.contarVogais("Vivian Magda"));
		System.out.println(Exercicios.contarVogais("VIVIAN"));
		
		System.out.println(Exercicios.media(6.7, 2.4, 9.8));
		System.out.println(Exercicios.media(8, 8, 8));
		System.out.println(Exercicios.media(6.9, 9, 8.7));
		
		
		int numeros[] = {1,2,3,4,5,6}; 
		System.out.println(Exercicios.contarPares(numeros));
		
		int fila[]= {2,4,8,10,12};
		System.out.println(Exercicios.contarPares(fila));		
		
	}

}
