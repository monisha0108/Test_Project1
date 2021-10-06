package org.Array;

public class Multi_Dimentional_Array {
	
	public static void main(String[] args) {
		System.out.println("Multi Dimentional Array");
		
		int arr[][]=new int[2][2];
		arr[0][1]=10;
		arr[1][0]=20;
		arr[0][0]=30;
		arr[1][1]=40;
		
		
		for(int i=0;i<2;i++) {
			for(int j=0;j<2;j++) {
			System.out.println(arr[i][j]);
			}
		}
	}

}
