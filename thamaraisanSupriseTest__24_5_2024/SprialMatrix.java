package thamaraisanSupriseTest__24_5_2024;

import java.util.Scanner;

public class SprialMatrix {
	
public static void main(String[] args) {
Scanner s=new Scanner(System.in);
System.out.println("enter the number");
int n=s.nextInt();
int initial=1;
int mat[][] =new int[n][n];
int rowst=0;
int rowend=n;
int colst=0;
int colend=n;
while(rowst<rowend&&colst<colend){
for(int i=colst;i<colend;i++){
mat[rowst][i]=initial++;
}
rowst++;
for(int i=rowst;i<rowend;i++){
mat[i][colend-1]=initial++;
}
colend--;
for(int i=colend-1;i>=colst;i--){
mat[rowend-1][i]=initial++;
}
rowend--;
for(int i=rowend-1;i>=rowst;i--){
mat[i][colst]=initial++;
}
colst++;

}
for(int i=0;i<n;i++){
for(int j=0;j<n;j++){
System.out.print(mat[i][j]+" ");
}
System.out.println();
}
}


}
