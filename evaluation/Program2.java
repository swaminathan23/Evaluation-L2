package evaluation;

import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Program2 {
public static void main(String[] args) {
	int[] input= {4,1,2,3,1,2,5,2};
	Map<Integer,Integer> map=new LinkedHashMap<Integer, Integer>();
	for(int i=0;i<input.length;i++) {
		if(!map.containsKey(input[i])) {
			map.put(input[i], 1);
		}
		else {
			map.put(input[i], map.get(input[i])+1);
		}
	}
	int[] output=new int[input.length];
	int index=0;
	while(!map.isEmpty()) {
		int key=0;
		int val=0;
		for(Entry<Integer, Integer> a:map.entrySet()) {
			if(val<a.getValue()) {key=a.getKey();
			val=a.getValue();}
		}
		for(int l=val;l>0;l--) {
			output[index++]=key;
		}
		map.remove(key);
	}
	System.out.println(Arrays.toString(output));
}
}
