package com.usc.karthik;

public class PalindromCaseInsensitive {

	public static void main(String[] args) {
		String[] array = new String[]{ "karthik", "dEeD"};
		

		for(String s : array){
			System.out.println("IS Palindrome : " + s+ palidrome(s));
		}
	}


	private static boolean palidrome(String s) {
		 s = s.toLowerCase();
		for (int i =0 ;i<s.length()/2;i++){
			if(s.charAt(i)!= s.charAt(s.length()-i-1)){
				return false;
			}
		}
		return true;
	}
}
