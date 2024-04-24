package evaluation;

import java.util.Arrays;

public class Program3 {
public static void main(String[] args) {
	int[]arr1= {9,2,8,1,3,5,6,7,3,1,1,6};
	int[] arr2= {7,8,4,6,2,1,9,9,7};
	int max=(arr1.length>arr2.length?arr1.length:arr2.length);
	int[] arr3=new int[max+1];//output array
	int carry=0;
	int arr1length=arr1.length-1;
	int arr2length=arr2.length-1;
	for(int i=arr3.length-1;i>=0;i--) {
		if(arr1length>=0&&arr2length>=0) {
			int a=carry+arr1[arr1length--]+arr2[arr2length--];
			if(a/10!=0) {
				carry=a/10;
				arr3[i]=a%10;
			}
			else {
				carry=0;
				arr3[i]=a;
			}
		}
		else if(arr1length>=0) {
			int a=carry+arr1[arr1length--];
			if(a/10!=0) {
				carry=a/10;
				arr3[i]=a%10;
			}
			else {
				carry=0;
				arr3[i]=a;
			}
		}
		else if(arr2length>=0) {
			int a=carry+arr2[arr2length--];
			if(a/10!=0) {
				carry=a/10;
				arr3[i]=a%10;
			}
			else {
				carry=0;
				arr3[i]=a;
			}
		}
		else if(i==0) {
			if(carry!=0)arr3[i]=carry;
		}
	}
	if(arr3[0]!=0) {
		for(int i=0;i<arr3.length;i++) {
			System.out.print(arr3[i]+" ");
		}
	}
	else {
		for(int i=1;i<arr3.length;i++) {
			System.out.print(arr3[i]+" ");
		}
	}
}

}
