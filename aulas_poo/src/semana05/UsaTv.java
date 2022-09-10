package semana05;

/**
* Classe para testar os métodos implementados na classe Tv.
* @author Vivian Magda RA: 1050481923024 09-set-2022
*/

public class UsaTv {

	public static void main(String[] args) {
		
		Tv tv = new Tv();
		
		System.out.println(tv);
		
		tv.ligar();
		tv.mostrar();
		
		tv.definirCanal(85);
		for(int i=1;i<=200;i++)
			tv.aumentarVolume();
	
		tv.mostrar();
		
		for(int i=1;i<=2000;i++)
			tv.aumentarCanal();
		
		tv.mostrar();
		
		for(int i=1;i<=200;i--)
			tv.reduzirVolume();
	
		tv.mostrar();
		
		for(int i=1;i<=2000;i--)
			tv.reduzirCanal();
		
		tv.mostrar();
		
		tv.desligar();
		System.out.println(tv);
		

	}

}
