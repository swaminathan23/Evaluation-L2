package evaluation;

public class PRogram1 {
public static void main(String[] args) {
	char input='F';
	int a=input-65+1;
	char b='A';
	for(int i=0;i<a+a-1;i++) {
		if(i==a)b-=2;
		for(int j=0;j<a+a-1;j++) {	
			if(i+j==a-1||j-i==a-1||i-j==a-1||i+j-(2*(a-1))==a-1) 
			{
					System.out.print(b);
				}
			else{
				System.out.print(" ");
				}
		}
		if(a>i) {
			b++;
		}
		if(a<=i) {
			b--;
		}
		System.out.println();
	}
}
}
