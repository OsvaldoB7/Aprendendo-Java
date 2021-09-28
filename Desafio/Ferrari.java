package oo.desafio;

public class Ferrari extends Carro{
	
	Ferrari(int velocidadeMaxima) {
		super(315);
		
	}

	
	void acelerar() {
		if (!ligado) {
			carroAndando += 100;
		}
		
	}

	void frear() {
		if (!ligado) {
			carroAndando -= 10;
		}
	}
    
	
	
	
}
