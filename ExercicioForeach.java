package arrys;


public class ExercicioForeach {
	public static void main(String[] args) {
		
		double[] notasAlunoA = new double[4];
		notasAlunoA[0] = 7.9;
		notasAlunoA[1] = 8;
		notasAlunoA[2] = 6.7;
		notasAlunoA[3] = 9.7;
	
		
		for(double notas: notasAlunoA) { 
		System.out.print(notas + " ");
		}
		double[] notasAlunoB = {6.9, 8.9, 5.5, 10};
		
		System.out.println();
		for(double notas: notasAlunoB) {
			System.out.print(notas + " ");
			
		}
	}

}
