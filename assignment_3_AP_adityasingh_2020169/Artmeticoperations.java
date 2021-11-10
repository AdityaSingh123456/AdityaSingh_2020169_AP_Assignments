package assignment_3_AP_adityasingh_2020169;

public class Artmeticoperations {
	
	
	private double[][] MatrixA;
	private double[][] MatrixB;
	private double[][] MatrixC;
	
	public Artmeticoperations(double[][] MatrixA,double[][] MatrixB) {
		this.MatrixA = MatrixA;
		this.MatrixB = MatrixB;
		
	
		
	}

	

	public double[][] getMatrixA() {
		return MatrixA;
	}

	public void setMatrixA(double[][] matrixA) {
		MatrixA = matrixA;
	}

	public double[][] getMatrixB() {
		return MatrixB;
	}

	public void setMatrixB(double[][] matrixB) {
		MatrixB = matrixB;
	}
	public void Addition(){
		double[][] C = new double[MatrixA.length][MatrixA[0].length];
		for(int i=0;i<MatrixA.length;i++) {
			for(int j=0;j<MatrixA[0].length;j++) {
				C[i][j] = MatrixA[i][j]+MatrixB[i][j];
			}
		}
		
		
		 MatrixC=C ;
		
	}
	
	public void Subtraction(){
		double[][] C = new double[MatrixA.length][MatrixA[0].length];
		for(int i=0;i<MatrixA.length;i++) {
			for(int j=0;j<MatrixA[0].length;j++) {
				C[i][j] = MatrixA[i][j]-MatrixB[i][j];
			}
		}
		
		
		MatrixC=C;
		
	}
	public double[][] getMatrixC() {
		return MatrixC;
	}



	public void setMatrixC(double[][] matrixC) {
		MatrixC = matrixC;
	}



	public void Mutiplication(){
		double[][] prd = null;
		if(MatrixA[0].length == MatrixB.length) {
		 prd = new double[MatrixA.length][MatrixB[0].length];
	      for (int i = 0; i <MatrixA.length ; i++) {
	         for (int j = 0; j < MatrixB[0].length; j++) {
	        	 double sum = 0;

	            for (int k = 0; k <MatrixA[0].length ; k++) {
	               sum += MatrixA[i][k] * MatrixB[k][j];
	            }

	            prd[i][j] = sum;
	         }
	      }
		}else {
			prd = new double[MatrixB.length][MatrixB[0].length];
			for (int i = 0; i <MatrixB.length ; i++) {
				double sum = 0;
		         for (int j = 0; j < MatrixB[0].length; j++) {
		            
		            sum = MatrixA[0][0] * MatrixB[i][j];

		            prd[i][j] = sum;
		         }
		        
		      }
			
			
		}
	      
	      MatrixC=prd;
		
		
	}
	public void Division() {
		
		//MatrixC = invert(MatrixB);
	
		
	}
	
	public void elementwiseMultiplication() {
		 double C[][] = new double[MatrixA.length][MatrixA[0].length];
		 for(int i=0;i<MatrixA.length;i++) {
			 for(int j=0;j<MatrixA[0].length;j++) {
				 C[i][j] = MatrixA[i][j]*MatrixB[i][j];
			 }
		 }
		 MatrixC = C;
		 
	}
	 public double[][] invert(double a[][]) //
	    {
	        int n = a.length;
	        double x[][] = new double[n][n];
	        double b[][] = new double[n][n];
	        int index[] = new int[n];
	        for (int i=0; i<n; ++i) 
	            b[i][i] = 1;
	 
	 // Transform the matrix into an upper triangle
	        gaussian(a, index);
	 
	 // Update the matrix b[i][j] with the ratios stored
	        for (int i=0; i<n-1; ++i)
	            for (int j=i+1; j<n; ++j)
	                for (int k=0; k<n; ++k)
	                    b[index[j]][k]
	                    	    -= a[index[j]][i]*b[index[i]][k];
	 
	 // Perform backward substitutions
	        for (int i=0; i<n; ++i) 
	        {
	            x[n-1][i] = b[index[n-1]][i]/a[index[n-1]][n-1];
	            for (int j=n-2; j>=0; --j) 
	            {
	                x[j][i] = b[index[j]][i];
	                for (int k=j+1; k<n; ++k) 
	                {
	                    x[j][i] -= a[index[j]][k]*x[k][i];
	                }
	                x[j][i] /= a[index[j]][j];
	            }
	        }
	        return x;
	    }
	//**********************************************************************************
	 public void gaussian(double a[][], int index[]) //
	    {
	        int n = index.length;
	        double c[] = new double[n];
	 
	 // Initialize the index
	        for (int i=0; i<n; ++i) 
	            index[i] = i;
	 
	 // Find the rescaling factors, one from each row
	        for (int i=0; i<n; ++i) 
	        {
	            double c1 = 0;
	            for (int j=0; j<n; ++j) 
	            {
	                double c0 = Math.abs(a[i][j]);
	                if (c0 > c1) c1 = c0;
	            }
	            c[i] = c1;
	        }
	 
	 // Search the pivoting element from each column
	        int k = 0;
	        for (int j=0; j<n-1; ++j) 
	        {
	            double pi1 = 0;
	            for (int i=j; i<n; ++i) 
	            {
	                double pi0 = Math.abs(a[index[i]][j]);
	                pi0 /= c[index[i]];
	                if (pi0 > pi1) 
	                {
	                    pi1 = pi0;
	                    k = i;
	                }
	            }
	 
	   // Interchange rows according to the pivoting order
	            int itmp = index[j];
	            index[j] = index[k];
	            index[k] = itmp;
	            for (int i=j+1; i<n; ++i) 	
	            {
	                double pj = a[index[i]][j]/a[index[j]][j];//
	 
	 // Record pivoting ratios below the diagonal
	                a[index[i]][j] = pj;
	 
	 // Modify other elements accordingly
	                for (int l=j+1; l<n; ++l)
	                    a[index[i]][l] -= pj*a[index[j]][l];
	            }
	        }
	    }
	  

	

//	@Override
	public void printMatrix() {
		for(int i=0;i<MatrixC.length;i++) {
			for(int j=0;j<MatrixC[0].length;j++) {
				System.out.print(MatrixC[i][j]+" ");
			}
			System.out.println();
		}
		
	}
	
}
