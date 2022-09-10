package semana05;

public class UsaPincel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pincel p1; //declaração - reserva espaço em memória
		p1 = new Pincel(); //cria o objeto
		
		p1.cor = "verde";
		p1.tamanho = 10;
		p1.valor = 3.45;
		
		Pincel p2 = new Pincel();
		
		p2.cor = "preto";
		p2.tamanho = 15;
		p2.valor = 3.85;
		
		p1.mostrar();
		p2.mostrar();
		
		p2.abrirTampa();
		p2.escrever();
		p1.abrirTampa();
		p1.escrever();
		p2.fecharTampa();
		p1.escrever();
		p1.fecharTampa();
		

	}

}
