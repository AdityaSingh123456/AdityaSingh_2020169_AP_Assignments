package assignment_3_AP_adityasingh_2020169;
import java.util.*;
import java.lang.Math;

public class Client {
	
	static Scanner scn = new Scanner(System.in);
	static ArrayList<MatrixType> list = new ArrayList<MatrixType>();

	
	public static void main(String[] args) {
		
		while(true) {
			intro();
			int key = scn.nextInt();
			
			
			if(key==1) {
				System.out.println("Matrix Name: ");
				String name = scn.next();
				double[][] Matrix = matrixinput();
				
			
			
			MatrixType properties = new MatrixType(Matrix,name);
			properties.Column(Matrix);
			properties.Diagonal();
			properties.Identity();
			properties.Singleton();
			properties.Lower_triangular();
			properties.Null();
			properties.Ones();
			properties.Rectangle();
			properties.Skew_symmetric();
			properties.Scalar();
			properties.Upper_triangular();
		    properties.Row();
		    properties.Symmetric();
		    properties.Square();
		    properties.Singular();
		    System.out.println("------------------------");
		ArrayList<String> Properties =properties.getProperties();
		for(String i:Properties) {
			    
				System.out.println(i+" Matrix");
				}
		list.add(properties);
		//OPERRATION ARTHMETIC
			
			}else if(key ==2) {
//				boolean divident =false;
				boolean singlton = false;
				double[][] A = null;
				double[][] B = null;
				System.out.println("Select Matrix");
				System.out.println("Matrix1: ");
				String mat1 = scn.next();
				while(A == null) {
				for(MatrixType i:list) {
					if(i.getName().equals(mat1)) {
						A = new double[i.getMatrix().length][i.getMatrix()[0].length];
						for(int x=0;x< i.getMatrix().length;x++) {
							for(int y=0;y<i.getMatrix()[0].length;y++) {
								A[x][y]=i.getMatrix()[x][y];
							}
						}
					}
				}
				if(A == null) {
					System.out.println("Matrix1: ");
					mat1 = scn.next();
				}
				}
				System.out.println("Matrix2: ");
				String mat2 = scn.next();
				while(B == null) {
				for(MatrixType i:list) {
					if(i.getName().equals(mat2)) {
//						if(i.getProperties().contains("Singular")) {
//							divident = true;
//						}
						if(i.getProperties().contains("Singular")) {
							singlton = true;
						}
						
						B = new double[i.getMatrix().length][i.getMatrix()[0].length];
						for(int x=0;x< i.getMatrix().length;x++) {
							for(int y=0;y<i.getMatrix()[0].length;y++) {
								B[x][y]=i.getMatrix()[x][y];
							}
						}
						
						
					}
				}
				if(B==null) {
					System.out.println("Matrix2: ");
					mat2 = scn.next();
				}
				}
				System.out.println("Chosse Operation");
				System.out.println("1. +");
				System.out.println("2. -");
				System.out.println("3. *");
				System.out.println("4. /");
				int op = scn.nextInt();
				if(op ==1 || op==2) {
					if(A.length == B.length && A[0].length == B[0].length) {
						Artmeticoperations operation = new Artmeticoperations(A,B);
						 if(op==1) {
							 operation.Addition();
							 operation.printMatrix();
						 }else {
							 operation.Subtraction();
							 operation.printMatrix();
						 }
						
					}else {
						System.out.println("Matrix Must Be OF Same Dimension");
					}
					
				}else {
					if(op==3) {
						if(A[0].length == B.length) {
							Artmeticoperations operation = new Artmeticoperations(A,B);
							operation.Mutiplication();
							operation.printMatrix();
							
						}else if(singlton) {
							Artmeticoperations operation = new Artmeticoperations(B,A);
							operation.Mutiplication();
							operation.printMatrix();
							
						}else {
							System.out.println("Incompatable Dimension Of The Matrices");
						}
					}else {
						if(A[0].length == B.length && B[0].length == B.length) {
							Artmeticoperations operation = new Artmeticoperations(A,B);
							B = operation.invert(B);
							operation.Mutiplication();
							operation.printMatrix();
							
							
//							
							
						}else if(singlton) {
							for(int i=0;i<A.length;i++) {
								for(int j=0;j<A[0].length;j++) {
									A[i][j] = A[i][j]/B[0][0];
									
								}
							}
							printMatrix(A);
							
						}else {
							System.out.println("Incompatable Dimension Of The Matrices And B Must be a Non Singular Matrix");
						}
					}
					
//					if(B[0].length == A.length || (B.length== 1 && B[0].length ==1)) {
//						Artmeticoperations operation = new Artmeticoperations(B,A);
//						if(op==3) {
//							operation.Mutiplication();
//							operation.printMatrix();
//						}else {
//							if(!divident) {
//							B = operation.invert(B);
//							operation.Mutiplication();
//							operation.printMatrix();
//							}else if(singlton) {
//								for(int i=0;i<A.length;i++) {
//									for(int j=0;j<A[0].length;j++) {
//										A[i][j] = A[i][j]/B[0][0];
//										
//									}
//								}
//								printMatrix(A);
//							}
//							
//							else {
//								System.out.println("B Must be a Non Singular Matrix");
//							}
//						}
//						
//					}else {
//						System.out.println("Incompatable Dimension Of The Matrices");
//					}
					
				}
				
		// TRANSPOSE		
			}else if(key ==3) {
				System.out.println("CHOOSE MATRIX:");
				String mat = scn.next();
				double[][] ans= null;
				boolean weget =false;
				while(!weget) {
				for(MatrixType i:list) {
					if(i.getName().equals(mat)) {
						ans = i.transpose(i.getMatrix());
						weget = true;
					}
				}
				if(!weget) {
					System.out.println("CHOOSE MATRIX:");
					mat = scn.next();
				}
				
			  }
			  printMatrix(ans);	
				
			}else if(key == 4) {				
				// A + A'
				System.out.println("CHOOSE MATRIX:");
				String mat = scn.next();
				double[][] ans= null;
				boolean weget =false;
				while(!weget) {
				for(MatrixType i:list) {
					if(i.getName().equals(mat)) {
						if(i.getMatrix().length == i.getMatrix()[0].length) {
						ans = i.Addtranspose(i.getMatrix());
						weget = true;
						}else {
							weget = false;
						}
					}
				}
				if(!weget) {
					System.out.println("CHOOSE MATRIX ANS MUST BE A SQUARE MATRIX:");
					mat = scn.next();
				}
				
			  }
			  printMatrix(ans);	
				
				
				
				
				
				
			}// DETERMIANT
			else if(key ==5) {
				System.out.println("CHOOSE MATRIX:");
				String mat = scn.next();
				double ans= 1;
				boolean weget =false;
				while(!weget) {
					for(MatrixType i:list) {

						if(i.getName().equals(mat)) {
							if(i.getProperties().contains("Singular") && i.getProperties().contains("Square")) {
								ans = 0;
								weget = true;
							}else if(i.getProperties().contains("Diagonal")&& i.getProperties().contains("Square") ) {
								for(int x=0;x<i.getMatrix().length;x++) {
									ans *= i.getMatrix()[x][x];
									weget = true;
									
								}
								
							}
							else if((i.getMatrix()).length == (i.getMatrix())[0].length) {
							
							ans = i.determinant(i.getMatrix(), i.getMatrix().length);
							weget = true;
							}else {
								System.out.println("IT MUST BE A SQUARE MATRIX");
							}
							
						}
						
					}
					
					if(!weget) {
						System.out.println("CHOOSE SUITABLE MATRIX:");
						mat = scn.next();
					}

				}
				System.out.println("DETERMINANT "+ans);

			}else if(key == 6) {
				// MEAN ROW WISE
				System.out.println("CHOOSE MATRIX:");
				String mat = scn.next();
				System.out.println(" ROW MEAN :");

				boolean weget = false;
				while(!weget) {
					for(MatrixType i:list) {
						if(i.getName().equals(mat)) {
							for(int k=0;k <i.getMatrix()[0].length;k++) {
							int sum=0;
							for(int j=0;j<i.getMatrix().length;j++) {
								sum += i.getMatrix()[j][k];
							}
							System.out.print((sum/i.getMatrix()[0].length) +" ");
							
							weget = true;
						}
					}
						
					}
					if(!weget) {
						System.out.println("CHOOSE SUITABLE MATRIX:");
						mat = scn.next();
					}
				}
				
				System.out.println();
				
				
			}else if(key == 7) {
				// RETRIVE ALL SQUARE MATRIX
				System.out.println("WHICH TYPE OF MATRIX YOU WANT TO SEARCH:");
				String str = scn.next();
				for(MatrixType i:list) {
					for(String j:i.getProperties()) {
						if(j.equals(str)) {
							System.out.println(i.getName());
							printMatrix(i.getMatrix());
						}
						
						
					}
				}
				
				
			}else if(key == 8) {
				// INVERSE OF A MATRIX
			
				System.out.println("CHOOSE MATRIX:");
				String mat = scn.next();
				boolean possible = false;
				while(!possible) {
					for(MatrixType i:list) {
						if(i.getName().equals(mat)) {
							if(i.getProperties().contains("Null") || !(i.getProperties().contains("Square"))) {
								break;
							}
							
							double c[][] = new double[i.getMatrix().length][i.getMatrix().length];
							for(int x=0;x<i.getMatrix().length;x++) {
								for(int y=0;y<i.getMatrix().length;y++) {
									c[x][y] = i.getMatrix()[x][y];
								}
							}
							double d[][] = i.invert(i.getMatrix());
							printMatrix(d);
							possible = true;
							i.setMatrix(c);
							
							
							
						}
					}
					if(!possible) {
						System.out.println("CHOOSE SUITABLE MATRIX:");
						mat = scn.next();
					}
				}
				
				
				System.out.println();
				
				
			}else if(key == 9) {
				// PRINT A MATRIX
				System.out.println("CHOOSE MATRIX:");
				String mat = scn.next();
				boolean possible = false;
				while(!possible) {
					for(MatrixType i:list) {
						if(i.getName().equals(mat)) {
							
							printMatrix(i.getMatrix());
							possible = true;
							
							
						}
					}
					if(!possible) {
						System.out.println("CHOOSE SUITABLE MATRIX:");
						mat = scn.next();
					}
				}
				
				
				System.out.println();
				
			}else if(key == 10) {
				// ELEMENT WISE OPERATION MUL AND DIV
				double[][] A = null;
				double[][] B = null;
				System.out.println("Select Matrix");
				System.out.println("Matrix1: ");
				String mat1 = scn.next();
				while(A == null) {
				for(MatrixType i:list) {
					if(i.getName().equals(mat1)) {
						A = i.getMatrix();
					}
				}
				if(A == null) {
					System.out.println("Matrix1: ");
					 mat1 = scn.next();
				}
				}
				System.out.println("Matrix2: ");
				String mat2 = scn.next();
				while(B == null) {
				for(MatrixType i:list) {
					if(i.getName().equals(mat2)) {
						B = i.getMatrix();
					}
				}
				if(B==null) {
					System.out.println("Matrix2: ");
					mat2 = scn.next();
				}
				}
				System.out.println("Chosse Operation");
				System.out.println("1: .*");
				System.out.println("2: ./");
				
				int op = scn.nextInt();
				if(op == 1 ) {
					if(A[0].length == B.length ) {
						Artmeticoperations operation = new Artmeticoperations(A,B);
						
							operation.elementwiseMultiplication();
							operation.printMatrix();
						
						
					}else {
						System.out.println("Incompatable Dimension Of The Matrices");
					}
					
				}else {
					// DIVIDENT
				
					if(B.length == A.length && B[0].length == A[0].length) {
						double[][] C = new double[A.length][A[0].length];
						for(int x=0;x<A.length;x++) {
							for(int y=0;y<A[0].length;y++) {
								C[x][y] = A[x][y]/B[x][y];
							}
						}
						
						printMatrix(C);
						
					}else {
						System.out.println("Incompatable Dimension Of The Matrices");
					}
				}
				
				
				
			}else if(key == 11) {
				// EIGEN
				System.out.println("CHOOSE MATRIX:");
				String mat = scn.next();
				boolean get = false;
				while(!get) {
					for(MatrixType i:list) {
						if(i.getName().equals(mat)) {
							if(i.getProperties().contains("Square")) {
								if(i.getMatrix().length == 2) {
									double trace = i.getMatrix()[0][0] + i.getMatrix()[1][1];
									double determinant = i.determinant(i.getMatrix(), 2);
									
									System.out.println(" "+(trace - Math.sqrt(trace*trace - 4*determinant ))/2);
									System.out.println(" "+(trace + Math.sqrt(trace*trace - 4*determinant ))/2);
									get = true;
									
								}else {
									
									System.out.println("Eigen of 3X3 is not Valid");
									get = true;
									
								}
								
							}else {
								break;
							}
						}
					}
					if(!get) {
						System.out.println("CHOOSE SUITABLE MATRIX:");
						 mat = scn.next();
					}
				}
				
			
				
				
			}else if(key == 12) {
				// SOLVING EQN'S
				double a[][] = null;
				double b[][] = null;
				System.out.println("CHOOSE A SQUARE MATRIX:");
				String mat = scn.next();
				boolean square = false;
				boolean column = false;
				while(true) {
					while(!square) {
						for(MatrixType i: list) {
							if(i.getName().equals(mat)) {
								if(i.getProperties().contains("Square")) {
									double c[][] = new double[i.getMatrix().length][i.getMatrix().length];
									for(int x=0;x<i.getMatrix().length;x++) {
										for(int y=0;y<i.getMatrix().length;y++) {
											c[x][y] = i.getMatrix()[x][y];
										}
									}
									 a = i.invert(i.getMatrix());
									 i.setMatrix(c);
									
									 square = true;
								}
							}
						}
						if(!square) {
							System.out.println("CHOOSE SUITABLE SQUARE MATRIX:");
							mat = scn.next();
						}
						
					}
				  while(!column) {
					  System.out.println("CHOOSE A SUITABLE COLUMN MATRIX:");
					  String matrix = scn.next();
						for(MatrixType i: list) {
							if(i.getName().equals(matrix)) {
								if(i.getProperties().contains("Column") && (i.getMatrix().length == a.length) ) {
									  b = i.getMatrix();
									  column = true ;
								}
							}
						}
				  }
				  if(column && square) {
					  Artmeticoperations op = new Artmeticoperations(a,b);
					  op.Mutiplication();
					  op.printMatrix();
					  break;
					 
				  }
					
				}
				
				
			}else if(key == 13) {
				// column wise
				System.out.println("CHOOSE MATRIX:");
				String mat = scn.next();
				System.out.println("COLUMN MEAN:");				
				boolean weget = false;
				while(!weget) {
					for(MatrixType i:list) {
						if(i.getName().equals(mat)) {
							for(int k=0;k <i.getMatrix()[0].length;k++) {
							int sum=0;
							for(int j=0;j<i.getMatrix().length;j++) {
								sum += i.getMatrix()[j][k];
							}
							System.out.print((sum/i.getMatrix().length) +" ");
							
							weget = true;
						}
					}
						
					}
					if(!weget) {
						System.out.println("CHOOSE SUITABLE MATRIX:");
						mat = scn.next();
					}
				}
				
				System.out.println();
				
				
			}else if(key == 14) {
				// ALL ELEMET MEANS
				System.out.println("CHOOSE MATRIX:");
				String mat = scn.next();
				System.out.println("COMBINED MEAN:");				
				boolean weget = false;
				while(!weget) {
					for(MatrixType i:list) {
						if(i.getName().equals(mat)) {
							int sum=0;
							for(int k=0;k <i.getMatrix().length;k++) {
							
							for(int j=0;j<i.getMatrix()[0].length;j++) {
								sum += i.getMatrix()[k][j];
							}
							}
							System.out.println((sum/(i.getMatrix().length * i.getMatrix()[0].length)) +" ");
							
							weget = true;
						
					}
						
					}
					if(!weget) {
						System.out.println("CHOOSE SUITABLE MATRIX:");
						mat = scn.next();
					}
				}
				
				System.out.println();
				
				
				
			}else if(key == 15) {
				// EDIT A MATRIX
				System.out.println("SELECT A MATRIX WHICH U WANT TO EDIT :");
				String slt = scn.next();
				boolean complete = false;
				while(!complete) {
					for(MatrixType i:list) {
						if(i.getName().equals(slt)) {
							complete = true;
							ArrayList<String> qualities = i.getProperties();
							boolean found = true;
							while(found) {
							System.out.println("ENTER REPLACABLE MATRIX :");
							double C[][] = matrixinput();
							MatrixType properties = new MatrixType(C,slt);
							properties.Column(C);
							properties.Diagonal();
							properties.Identity();
							properties.Singleton();
							properties.Lower_triangular();
							properties.Null();
							properties.Ones();
							properties.Rectangle();
							properties.Skew_symmetric();
							properties.Scalar();
							properties.Upper_triangular();
						    properties.Row();
						    properties.Symmetric();
						    properties.Square();
						    properties.Singular();
						    
							boolean x = false;
						    for(String s:qualities) {
						    	if(properties.getProperties().contains(s)) {
						    		
						    	}else {
						    		x = true;
						    		break;
						    	}
						    }
						    if(!x) {
						    	found =false;
						    	list.add(properties);
						    	break;
						    }else {
						    	
						    }
						}
							list.remove(i);
							
							
						}
					}
					if(!complete) {
						System.out.println("SELECT A SUITABLE MATRIX WHICH U WANT TO EDIT :");
						slt = scn.next();
					}
				}
				
			}
			else {
				break;
			}
		}
		
		
		
		
		
		
		

	}
	public static double[][] matrixinput(){
		System.out.println("--INPUT A MATRIX--");
		System.out.println("ROW:");
		int row = scn.nextInt();
		System.out.println("COLUMN:");
		int col =scn.nextInt();
		double[][] mat = new double[row][col];
		for(int i=0;i<row;i++) {
			for(int j=0;j<col;j++) {
				System.out.print("ENTER VALUE FOR ROW: "+i+" COlUMN: "+j+":");
				mat[i][j] = scn.nextDouble();
			}
		}
		return mat;
	}
	public static void intro() {
		System.out.println("-------------------------------------------------------------------------------------");
		System.out.println("1. Take matrices as input and label them with appropriate matrix-types.\n"
				+ "2. Perform addition, subtraction, multiplication & division..\n"
				+ "3. Transpose matrices.\n"
				+ "4. Compute A+A' for a matrix A. \n"
				+ "5. Compute determinants.\n"
				+ "6. Compute means: row-wise mean,.\n"
				+ "7. Retrieve all the existing matrices (entered or created) having requested matrix-type labels\n"
				+ "8. Inverse matrices.\n"
				+ "9. Print Matrix.\n"
				+ "10. Perform element-wise operations.\n"
				+ "11. Compute Eigen vectors.\n"
				+ "12. Solve sets of linear equations using matrices.\n"
				
				+ "13. Compute means: Column-wise mean,.\n"
				+ "14. Compute means: All-wise mean,.\n"
				+ "15. Change the elements of a matrix as long as the fixed matrix-type labels remain valid. .");
		System.out.println("-------------------------------------------------------------------------------------");
	}
	public static void printMatrix(int[][] MatrixC) {
		for(int i=0;i<MatrixC.length;i++) {
			for(int j=0;j<MatrixC[0].length;j++) {
				System.out.print(MatrixC[i][j]+" ");
			}
			System.out.println();
		}
		
	}
	public static void printMatrix(double[][] MatrixC) {
		for(int i=0;i<MatrixC.length;i++) {
			for(int j=0;j<MatrixC[0].length;j++) {
				System.out.print(MatrixC[i][j]+" ");
			}
			System.out.println();
		}
		
	}

}
 

