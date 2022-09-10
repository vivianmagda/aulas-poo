package semana05;

public class UsaMotor {

	public static void main(String[] args) {
		Motor motor1 = new Motor();
		
		motor1.mostrar();
		
		motor1.ligar();
		motor1.mostrar();
		
		motor1.acelerar();
		motor1.mostrar();
		
		Motor m1 = new Motor();
		m1.ligar();
		m1.acelerar();
		m1.acelerar();
		m1.mostrar();
		
		for(int i=1; i<=1000; i++) {
			m1.acelerar();
		}
		m1.mostrar();
		
		for(int i=1; i<=1000; i--) {
			m1.frear();
		}
		m1.mostrar();
		
		System.out.println(m1); //imprime baseado no metodo toString();
		
		
		
	}

}
