package com.usc.karthik;

public class StringMatch {

	public static void main(String[] args) {
			String txt = "k art ar hik";
			String pttn ="ar";
			
			char[] text = txt.toCharArray();
			char[] pattern = pttn.toCharArray();
			int index = 0;
			int n= txt.length();
			int m= pttn.length();
			
			for( int i=0 ;i<=(n-m);i++){
				int j=0 ;
				while(j<m && pattern[j] == text[i+j])
					j++;
				if(j==m){
					 index =i;
					 break;
				}
			}
			System.out.println("Pattern found at "+ index);
	}
}
