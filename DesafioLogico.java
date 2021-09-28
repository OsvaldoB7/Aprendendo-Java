package operadores;

public class DesafioLogico {
	public static void main(String[] args) {
		        
		boolean trabalho1 = false;
		boolean trabalho2 = false;
		
		boolean comprouTV50 = trabalho1 && trabalho2;
		boolean comprouTV32 = trabalho1 ^ trabalho2;
		boolean comprouSorvete = trabalho1 || trabalho2;
		
		//Operador Unário!
		boolean maisSaudavel = !comprouSorvete;
		System.out.println("comprou TV 50\"? " + comprouTV50);
		System.out.println("comprou TV 32\"? " + comprouTV32);
		System.out.println("comprou TV 50\"? " + comprouSorvete);
		System.out.println("mais saudável? " + maisSaudavel);
	}

}
