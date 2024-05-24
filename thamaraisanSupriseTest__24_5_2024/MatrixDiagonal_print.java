package thamaraisanSupriseTest__24_5_2024;

import java.util.Random;
import java.util.Scanner;

public class MatrixDiagonal_print {

public static void main(String[] args) {
Scanner s=new Scanner(System.in);
System.out.println("enter the number");
int n=s.nextInt();
Random random=new Random();
int [][] mat=new int[n][n];
for(int i=0;i<n;i++){
for(int j=0;j<n;j++){
mat[i][j]=random.nextInt(10);
}
}
for(int i=0;i<n;i++){
for(int j=0;j<n;j++){
System.out.print(mat[i][j]+" ");
}
System.out.println();
}
for(int i=0;i<n;i++){
int row=i;
int col=0;
while(row>=0&&col<n){
System.out.print(mat[row--][col++]+" ");
}
System.out.println();
}
for(int i=1;i<n;i++){
int row=n-1;
int col=i;
while(row>=0&&col<n){
System.out.print(mat[row--][col++]+" ");
}
System.out.println();
}

}
}


