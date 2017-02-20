package com.usc.karthik;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
public class IntersexxtArrayOpt1 {

	
	public static void main(String[] args) {
		int[] list1 = new int[]{1,2,3,2};
		int[] list2 = new int[]{1,2,2,5};
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
		
		for(int i :list1){
			if(map.containsKey(i)){
				map.put(i, map.get(i)+1);
			}else{
				map.put(i,1);
			}
		}
		for(int j :list2){
			if(map.containsKey(j) && map.get(j) > 0){
				list.add(j);
				map.put(j, map.get(j) -1);				
			}			
		}
		Iterator<Integer> it = list.iterator();
		while(it.hasNext()){
			System.out.println(it.next());
		}
	}
}
