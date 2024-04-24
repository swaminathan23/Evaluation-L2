package evaluation;

import java.util.Arrays;

public class Program5 {
public static void main(String[] args) {
	int input=7;
	int[][] arr=new  int[input][input];
	int row=0;
	int rowe=input;
	int col=0;
	int cole=input;
	while(row<rowe&&col<cole) {
			for(int j=col;j<cole;j++) {
				arr[row][j]=1;
			}
			for(int j=row;j<rowe;j++) {
				arr[j][cole-1]=1;
			}
			for(int j=cole-1;j>=col;j--) {
				arr[rowe-1][j]=1;
			}
			for(int j=rowe-1;j>=row;j--) {
				arr[j][col]=1;
			}
		row+=2;
		rowe-=2;
		col+=2;
		cole-=2;
	}
	
	for(int i=0;i<input;i++) {
		for(int j=0;j<input;j++) {
			System.out.print(arr[i][j]+" ");
		}
		System.out.println();
	}
}
}
