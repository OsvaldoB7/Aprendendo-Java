package operadores;


public class desafio003 {
	public static void main(String[] args) {
		
		int a = 6 * (3+2);
		int resultA = (int) Math.pow(a, 2) / 6;
		int b = 4 * 5 / 2;
		int resultB = (int) Math.pow(b, 2);
		int result3 = resultA - resultB;
		int result33 = (int)Math.pow(result3, 3);
	    int result4 = (int) Math.pow(10, 3);
		int resultf = result33 / result4;
		System.out.println(resultf);
		
		
		
		
				
	}

}
