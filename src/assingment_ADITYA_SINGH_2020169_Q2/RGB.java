package assingment_ADITYA_SINGH_2020169_Q2;

public class RGB {
	private String id;
	
	private int[][] red;
	private int[][] blue;
	private int[][] green;
	
	
	RGB(String id,int[][] red,int[][] blue,int[][] green){
		this.id =id;
		this.red =red;
		this.green = green;
		this.blue = blue;
		
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public void print() {
		System.out.println("--------------RED------------");
		for(int i=0;i<red.length;i++) {
			for(int j=0;j<red[0].length;j++) {
				System.out.print(red[i][j]+" ");
			}
			System.out.println();

			
		}
		System.out.println("---------------------");
		System.out.println("--------------BLUE------------");
		for(int i=0;i<blue.length;i++) {
			for(int j=0;j<blue[0].length;j++) {
				System.out.print(blue[i][j]+" ");
			}
			System.out.println();

			
		}
		System.out.println("---------------------");
		System.out.println("--------------GREEN------------");
		for(int i=0;i<green.length;i++) {
			for(int j=0;j<green[0].length;j++) {
				System.out.print(green[i][j]+" ");
			}
			System.out.println();

			
		}

	}
	public int[][] getRed() {
		return red;
	}
	public void setRed(int[][] red) {
		this.red = red;
	}
	public int[][] getBlue() {
		return blue;
	}
	public void setBlue(int[][] blue) {
		this.blue = blue;
	}
	public int[][] getGreen() {
		return green;
	}
	public void setGreen(int[][] green) {
		this.green = green;
	}
	
	

}
