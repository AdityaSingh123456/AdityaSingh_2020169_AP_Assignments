package assignment_3_AP_adityasingh_2020169;
import java.util.*;
public class MatrixType {
	
	private double[][] Matrix;
	private String Name;
	private ArrayList<String> Properties= new ArrayList<String>();
	
	 public MatrixType(double[][] Matrix,String Name) {
		 this.Matrix = Matrix;
		 this.Name = Name;
		
	 }
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public double[][] getMatrix() {
		return Matrix;
	}
	public void setMatrix(double[][] matrix) {
		Matrix = matrix;
	}
	public ArrayList<String> getProperties() {
		return Properties;
	}
	public void setProperties(ArrayList<String> properties) {
		Properties = properties;
	}
	//************************************************************************15
	 public void Rectangle(){
		 if(Matrix.length != Matrix[0].length) {
			 Properties.add("Rectangle");
		 }
		 		 
	 }
	//************************************************************************14
	 public void Row() {
		 if(Matrix.length == 1) {
			 Properties.add("Row");
		 }
	 }
	//************************************************************************13
	 public void Column(double[][] Matrix) {
		 if(this.Matrix[0].length == 1) {
			 Properties.add("Column");
		 }
	 }
	//************************************************************************12
	 public void Square() {
		 if(Matrix[0].length == Matrix.length) {
			 Properties.add("Square");
		 }
	 }
	 //************************************************************************11
	 public void Symmetric() {
		 boolean symm = true;
		 if(Matrix[0].length == Matrix.length) {
			 double[][] trans = transpose(Matrix);
			 for(int i=0;i<Matrix.length;i++) {
				 for(int j=0;j<Matrix.length;j++) {
					 if(trans[i][j] != Matrix[i][j]) {
						 symm = false;
						 break;
					 }
				 }
			 }
			 
 
		 }else {
			 symm = false;
		 }
		 if(symm) {
			 Properties.add("Symmetric");
		 }
		 
	 }
	 
	 //************************************************************************10
	 public void Skew_symmetric() {
		 boolean symm = true;
		 if(Matrix[0].length == Matrix.length) {
			 double[][] trans = transpose(Matrix);
			 for(int i=0;i<Matrix.length;i++) {
				 for(int j=0;j<Matrix.length;j++) {
					 if(i==j) {
						 if(Matrix[i][j] != 0) {
							 symm = false;
							 break;
						 }
					 }
					 if(trans[i][j] != -1*(Matrix[i][j])) {
						 symm = false;
						 break;
					 }
				 }
				 if(!symm) {
					 break;
				 }
			 }
			 
 
		 }else {
			 symm =false;
		 }
		 if(symm) {
			 Properties.add("Skew_symmetric");
		 }
		 
	 }
	 
	 //********************************************************************************9
	 public void Upper_triangular() {
		 boolean upper = true;
		 for(int i=0;i<Matrix.length;i++) {
			 for(int j=0;j<Matrix[0].length;j++) {
				 if(i>j) {
					 if(Matrix[i][j] != 0) {
						 upper = false;
						 break;
					 }
				 }
			 }
		 }
		 if(upper) {
			 Properties.add("Upper_triangular");
		 }
	 }
	 //********************************************************************************8
	 public void Lower_triangular() {
		 boolean lower = true;
		 for(int i=0;i<Matrix.length;i++) {
			 for(int j=0;j<Matrix[0].length;j++) {
				 if(i<j) {
					 if(Matrix[i][j] != 0) {
						 lower = false;
						 break;
					 }
				 }
			 }
		 }
		 if(lower) {
			 Properties.add("Lower_triangular");
		 }
	 }
	//************************************************************************************7
	 public void Singular() {
		 if((Matrix.length == Matrix[0].length) && determinant(Matrix,Matrix[0].length) == 0 ){
			 Properties.add("Singular");
		 }
		 
		
	 }
	//************************************************************************************6
	 public void Diagonal() {
		 boolean diag=true;
		 if(Matrix.length == Matrix[0].length) {
			 for(int i=0;i<Matrix.length;i++) {
				 for(int j=0;j<Matrix.length;j++) {
					 if(i != j) {
						 if(Matrix[i][j] != 0) {
							 diag = false;
							 break;
						 }
					 }
				 }
				 if(!diag) {
					 break;
				 }
			 }
			 
			 
		 }else {
			 diag = false;
		 }
		 if(diag) {
			 Properties.add("Diagonal");
		 }
	 }
	 
	//************************************************************************************5
	 public void Scalar() {
		 boolean diag=true;
		 double diagelement = Matrix[0][0];
		 if(Matrix.length == Matrix[0].length) {
			 for(int i=0;i<Matrix.length;i++) {
				 for(int j=0;j<Matrix.length;j++) {
					 if(i != j) {
						 if(Matrix[i][j] != 0) {
							 diag = false;
							 break;
						 }
					 }else {
						 if(Matrix[i][j] == diagelement) {
							 diag = false;
							 break;
						 }
					 }
				 }
				 if(!diag) {
					 break;
				 }
			 }
			 
			 
		 }else {
			 diag = false;
		 }
		 if(diag) {
			 Properties.add("Scalar");
		 }
	 }
	 
 
//*****************************************************************************************4
	public void Identity() {
		boolean identity = true;
		if(Matrix.length == Matrix[0].length) {
		  for(int i=0;i<Matrix.length;i++) {
			  for(int j=0;j<Matrix.length;j++) {
				  if(i == j) {
					  if(Matrix[i][j]!=1) {
						  identity = false;
						  break;
					  }
				  }else {
					  if(Matrix[i][j] != 0) {
						  identity = false;
						  break; 
					  }
				  }
			  }
		  }
		}else {
			identity = false;
		}
		if(identity) {
			Properties.add("Identity");
		}
		
	}
	 
	 
//*****************************************************************************************3
	public void Singleton() {
		 if(Matrix.length ==1 && Matrix[0].length ==1) {
			 Properties.add("Singular");
		 }
	}
//*****************************************************************************************2
	public void Ones() {
		boolean ones = true;
		for(int i=0;i<Matrix.length;i++) {
			for(int j=0;j<Matrix[0].length;j++) {
				if(Matrix[i][j] != 1) {
					ones = false;
					break;
				}
			}
		}
		if(ones) {
		Properties.add("Ones");
		}
	}
//*****************************************************************************************1
	public void Null() {
		boolean ones = true;
		for(int i=0;i<Matrix.length;i++) {
			for(int j=0;j<Matrix[0].length;j++) {
				if(Matrix[i][j] != 0) {
					ones = false;
					break;
				}
			}
		}
		if(ones) {
		Properties.add("Null");
		}
		
	}
//*****************************************************************************************
	 public double[][] transpose(double[][] trans){
		 double[][] ans = new double[trans[0].length][trans.length];
		 for(int i=0;i<trans[0].length;i++) {
			 for(int j=0;j<trans.length;j++) {
				 ans[i][j] = trans[j][i];
			 }
			 
		 }
		 return ans;
		 
	 }
	 public double determinant(double[][] mat,int n) {
		 int N=2;
		 
		 
		 double D = 0; 
		 
	        
	        if (n == 1)
	            return mat[0][0];
	 
	        
	        double temp[][] = new double[N][N];
	 
	        
	        int sign = 1;
	 
	       
	        for (int f = 0; f < n; f++) {
	        
	            getCofactor(mat, temp, 0, f, n);
	            D += sign * mat[0][f]
	                 * determinant(temp, n - 1);
	 
	          
	            sign = -sign;
	        }
	 
	        return D;
	 }
	 static void getCofactor(double mat[][], double temp[][],
			 int p, int q, int n)
	 {
		 int i = 0, j = 0;

		 // Looping for each element
		 // of the matrix
		 for (int row = 0; row < n; row++) {
			 for (int col = 0; col < n; col++) {
				 // Copying into temporary matrix
				 // only those element which are
				 // not in given row and column
				 if (row != p && col != q) {
					 temp[i][j++] = mat[row][col];
					 // Row is filled, so increase
					 // row index and reset col index
					 if (j == n - 1) {
						 j = 0;
						 i++;
					 }
				 }
			 }
		 }
	 }
	//**********************************************************************************
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
	  

//**********************************************************************************
//	public boolean Determinant(int[][] matrix) {
//		
//	}
	 public double[][] Addtranspose(double[][] trans){
		 
		 double[][] ans = new double[trans[0].length][trans.length];
		 
		 for(int i=0;i<trans[0].length;i++) {
			 for(int j=0;j<trans.length;j++) {
				 ans[i][j] = trans[j][i]+ trans[i][j];
			 }
			 
		 }
		 return ans;
		 
	 }
	//**********************************************************************************
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
//	 public voiouble a[][], int index[]) //
//	    {
//	        int n = index.length;
//	        double c[] = new double[n];
//	 
//	 // Initialize the index
//	        for (int i=0; i<n; ++i) 
//	            index[i] = i;
//	 0 > c1) c1 = c0;
//	            }
//	            c[i] = c1;
//	        }
//	 
//	 // Search the pivoting element from each column
//	        int k = 0;
//	        for (int j=0; j<n-1; ++j) 
//	        { > pi1) 
//	                {
//	                    pi1 = pi0;
//	                    k = i;
//	                }
//	            }
//	 
//	   // Interchange rows according to the pivoting order
//	            int itmp = index[j];
//	            index[j] = index[k];
//	            index[k] = itmp;
//	            for (int i=j+1; i<n; ++i) 	
//	            
//	 // Modify other elements accordingly
//	                for (int l=j+1; l<n; ++l)
//	                    a[index[i]][l] -= pj*a[index[j]][l];
//	            }
//	        }
//	    }
//	  

	 

}




