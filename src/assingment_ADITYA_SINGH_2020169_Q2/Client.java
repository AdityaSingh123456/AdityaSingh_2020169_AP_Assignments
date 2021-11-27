package assingment_ADITYA_SINGH_2020169_Q2;

import java.util.*;

public class Client {
	static Scanner scn = new Scanner(System.in);
	static ArrayList<RGB> color = new ArrayList<RGB>();
	static ArrayList<Grayscale> black = new ArrayList<Grayscale>();

	public static void main(String[] args) {
		
		
		while(true) {
		
		intro();
		System.out.println("CHOOSE:");
		int key = scn.nextInt();
		if(key==1) {
			System.out.println("IMAGE NAME:");
			String str =string();
			
			
			System.out.println("ROW IN IMAGE:");
			int row = scn.nextInt();
			System.out.println("COLUMN IN IMAGE:");
			int col = scn.nextInt();
			System.out.println("RED MATRIX: ");
			
			int[][] r = input(row,col);
			System.out.println("BLUE MATRIX:");
			int[][] b = input(row,col);
			System.out.println("GREEN MATRIX:");
			int[][] g = input(row,col);
			
			RGB matrix = new RGB(str,r,b,g);
			color.add(matrix);
			
			
			
		}else if(key==2) {
			System.out.println("IMAGE NAME:");
			String str = string();
			
			System.out.println("ROW");
			int row = scn.nextInt();
			System.out.println("COLUMN IN IMAGE:");
			int col = scn.nextInt();
			System.out.println("GRAYSCALE MATRIX:");
			int[][] g = input(row,col);
			
			Grayscale matrix = new Grayscale(str,g);
			black.add(matrix);
			
			
		}else if(key==3) {
			System.out.println("ENTER IMAGE NAME");
			String str = string();
			
			for(RGB i:color) {
				if((i.getId()).equals(str)) {
					i.print();
				}
			}
			
		}else if(key==4) {
			System.out.println("ENTER IMAGE NAME");
			String str = string();
			
			for(Grayscale i:black) {
				if((i.getId()).equals(str)) {
					i.print();
				}
			}
			
			
		}else if(key==5) {
			Negatives n = new Negatives();
			System.out.println(" ChOOSE IMAGE NAME:");
			String str = string();
			
			for(RGB i:color) {
				if((i.getId()).equals(str)) {
					System.out.println("NEGATIVE RED MATRIX: ");
					n.printNegatives(i.getRed());
					
					System.out.println("NEGATIVE BLUE MATRIX: ");
					n.printNegatives(i.getBlue());
					System.out.println("NEGATIVE GREEN MATRIX: ");
					n.printNegatives(i.getGreen());
					
					
					
				}
			}
			
			
			
			

			
			
			
		}else if(key==6) {
			Negatives n = new Negatives();
			System.out.println(" ChOOSE IMAGE NAME:");
			String str = string();
			
			for(Grayscale i:black) {
				if((i.getId()).equals(str)) {
					System.out.println("NEGATIVE GRAY MATRIX: ");
					n.printNegatives(i.getGray());
				}
			}
			
			
		}else {
			break;
			
		}
		
	}

	
		
		
		
		
		
		

	}
	public static String string() {
		Scanner scanner = new Scanner(System.in);
		return scanner.nextLine().strip();
	}
	
	public static int[][] input(int row,int col){
		int[][] matrix = new int[row][col];
		
		for(int i=0;i<row;i++) {
			for(int j=0;j<col;j++) {
				System.out.println("ENTER "+ i+" Row "+j+" Column value:");
				matrix[i][j] = scn.nextInt();
			}
		}
		return matrix;

	}
	public static void intro() {
		System.out.println("1. Enter an Colored Image");
		System.out.println("2. Enter an Grayscale Image");
		System.out.println("3. Print an Colored Image");
		System.out.println("4. Print an Grayscale Image");
		System.out.println("5. Compute and upadte Negatives of Colored Image");
		System.out.println("6. Compute and upadte Negatives of GrayScale Image");
		System.out.println("7. Log-out");
		
	}
	

}
