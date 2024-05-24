package thamaraisanSupriseTest__24_5_2024;

import java.util.Scanner;

public class Pattern {
	

public static void main(String[] args) {
Scanner s=new Scanner(System.in);
System.out.println("enter the number");
int n=s.nextInt();
int space=n/2;
int a=1;
while(space>=0){
for(int i=0;i<space;i++){
System.out.print(" ");
}
int k=a;
while(k>=1){
System.out.print(k--);
}
int b=2;
while(b<=a){
System.out.print(b++);
}
System.out.println();
a++;
space--;
}
a=n/2;
space=1;
while(space<=n/2){
for(int i=0;i<space;i++){
System.out.print(" ");
}
int k=a;
while(k>=1){
System.out.print(k--);
}
int b=2;
while(b<=a){
System.out.print(b++);
}
System.out.println();
a--;
space++;
}
}
}


