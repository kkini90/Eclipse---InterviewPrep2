package com.usc.karthik;

import java.util.HashMap;

public class PrintDup {

	static void find(int[] array){
		HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
		boolean[] flag = new boolean[array.length];
		
		for(Integer num :array){
			if(map.containsKey(num)){
				map.put(num,map.get(num)+1);
			}else{
				map.put(num,1);
			}
		}
		for(int num :array){
			if(map.get(num) >1 && !flag[num] ){
				System.out.println(num);
				flag[num] = true;
			}
		}
	}
	public static void main(String[] args) {
		int[] array = new int[]{1,0,1,2,0,2,2};
		PrintDup.find(array);
	}
}
