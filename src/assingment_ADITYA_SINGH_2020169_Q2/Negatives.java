package assingment_ADITYA_SINGH_2020169_Q2;

public class Negatives {
	
	public <E> void printNegatives(int[][] E) {
		
		for(int i=0;i<E.length;i++) {
			for(int j=0;j<E[0].length;j++) {
				System.out.print(255 - E[i][j]+" ");
			}
			System.out.println();
		}
		
	}

}
