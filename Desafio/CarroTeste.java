package oo.desafio;

public class CarroTeste {
	public static void main(String[] args) {
		
		Civic c1 = new Civic(0); 
		
		c1.acelerar();
		c1.acelerar();
		c1.acelerar();
		c1.acelerar();
		
		System.out.println(c1.toString());
		
		c1.frear();
		c1.frear();
		c1.frear();
		c1.frear();
		
			
		System.out.println(c1.toString());
		
		
		Ferrari f1 = new Ferrari(350);
		
		f1.acelerar();
		f1.acelerar();
		f1.acelerar();
		f1.acelerar();
		f1.acelerar();
		f1.acelerar();
		f1.acelerar();
		f1.acelerar();
		f1.acelerar();
		f1.acelerar();
		f1.acelerar();
		f1.acelerar();
		
		System.out.println(f1.toString());
		
		f1.frear();
		f1.frear();
		f1.frear();
		
		System.out.println(f1.toString());
		
		
		
		
	}

}
