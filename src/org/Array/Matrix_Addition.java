package org.Array;

public class Matrix_Addition {
	
	public static void main(String[] args) {
		
		
		System.out.println("Matrix Addition");
		
		int a[][]=new int[2][2];
		
		int b[][]=new int[2][2];
		
		int c[][]=new int[2][2];
		
		a[0][0]=10;
		a[0][1]=20;
		a[1][0]=30;
		a[1][1]=40;
		
		b[0][0]=10;
		b[0][1]=20;
		b[1][0]=30;
		b[1][1]=40;
		
		c[0][0]=10;
		c[0][1]=20;
		c[1][0]=30;
		c[1][1]=40; 
		
		for(int i=0;i<2;i++) {
			
			for (int j=0;j<2;j++) {
				
			c[i][j]=a[i][j]+b[i][j];
			
			System.out.print(c[i][j]+" ");
			}
			System.out.println();
			
		}
		
	}

}
