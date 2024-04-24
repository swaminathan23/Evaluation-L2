package evaluation;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Program4 {
public static void main(String[] args) {
	int[] arr= {3,-1,6,1,-5,1,3,-8};
	ArrayList<ArrayList<Integer>> a=new ArrayList<ArrayList<Integer>>();
	int start=0;
	int end=0;
	
	for(int i=0;i<arr.length;i++) {
		if(arr[i]>0) {
			ArrayList<Integer> b=new ArrayList<Integer>();
			if(arr[i]>0)b.add(arr[i]);
			for(int j=i+1;j<arr.length;j++) {
				if(arr[j]<0) {
					i=j;
					break ;
				}
				if(j==arr.length-1) {
					b.add(arr[j]);
					i=j;
					break;
				}
				else {
					b.add(arr[j]);
				}
			}
			a.add(b);
		}
	}
	int maxsum=0;
	int indexmaxsum=0;
	for(int i=0;i<a.size();i++) {
		ArrayList<Integer> c=a.get(i);
		int sum=0;
		for(int d:c) {
			sum+=d;
			if(sum>maxsum) {
				maxsum=sum;
				indexmaxsum=i;
			}
		}
	}
	System.out.println("max value: "+maxsum);
	System.out.println("that subarrary: "+a.get(indexmaxsum));
}
}
