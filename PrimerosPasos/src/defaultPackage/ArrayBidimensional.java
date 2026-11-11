package defaultPackage;

public class ArrayBidimensional {

	public static void main(String[] args) {
		int[][] matriz = new int[2][3];
		
		matriz[0][0] = 90;
		matriz[0][1] = 13;
		matriz[0][2] = 24;
		
		matriz[1][0] = 34;
		matriz[1][1] = 54;
		matriz[1][2] = 62;
		
		for(int i = 0; i<2; i++) {
			for(int j = 0; j<3; j++) {
				System.out.print(matriz[i][j] + "|");
			}
			System.out.println("");
		}
		
		// second way to do a matrix 
		
		int[][] matriz_2 = { {90,13,24}, {34,54,62} };
		for(int i = 0; i<2; i++) {
			for(int j = 0; j<3; j++) {
				System.out.print(matriz_2[i][j] + "|");
			}
			System.out.println("");
		}

	}

}
