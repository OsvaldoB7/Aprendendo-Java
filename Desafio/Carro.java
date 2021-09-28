package oo.desafio;

public class Carro {
	
	final int VELOCIDADE_MAXIMA;
	boolean ligado = false;
	double carroAndando;
	int delta = 5;
	
Carro(int velocidadeMaxima) {
	VELOCIDADE_MAXIMA = velocidadeMaxima;
}
	
	
	void acelerar() {
		if(carroAndando + delta > VELOCIDADE_MAXIMA) {
			carroAndando = VELOCIDADE_MAXIMA;
		}
		if (!ligado) {
			carroAndando += delta;
		}
			
	}

	void frear() {
		
		
		if (carroAndando >= 5) {
			carroAndando -= 5;
		} else {
			carroAndando = 0;
		}
	}
	
	public String toString() {
		return "A velocidade atual é " + carroAndando + "km/h";
	}
	

}
