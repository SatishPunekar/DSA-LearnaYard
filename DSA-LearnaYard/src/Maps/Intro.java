package Maps;

import java.util.HashMap;
import java.util.Map;

public class Intro {
	public static void main(String[] args) {
		int[] arr= {2,2,1,2,2,1,3};
		Map<Integer, Integer> map=new HashMap<Integer, Integer>();
//		map.put(1, 1);
//		System.out.println(map.get(1));
//		map.put(1, 2);
//		System.out.println(map.get(1));
		for(int i=0;i<arr.length;i++) {
			if(map.containsKey(arr[i])) {
				map.put(arr[i], map.get(arr[i])+1);
			}
			else {
				map.put(arr[i], 1);
			}
		}
		//using keySet traverse through map and get key values.
		for(int key:map.keySet()) {
			System.out.println("Key " + key + " value " + map.get(key));
		}
	}

}
