package assingment_ADITYA_SINGH_2020169_Q2;

public class Grayscale {
	private int[][] gray;
	private String id;
	
	Grayscale(String id,int[][] gray){
		this.id = id;
		this.gray = gray;
	}
	
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public int[][] getGray() {
		return gray;
	}

	public void setGray(int[][] gray) {
		
		this.gray = gray;
	}

	public void print() {
		for(int i=0;i<gray.length;i++) {
			for(int j=0;j<gray[0].length;j++) {
				System.out.print(gray[i][j]+" ");
			}
			System.out.println();

			
		}
	  
	}

}
