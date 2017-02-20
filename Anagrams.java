package com.usc.karthik;


public class Anagrams{
   
    private static boolean check(int s,int t){  
       int[] numbers = new int[10];
       int remainder;
       int count1=0,count2=0;
       
       while(s!=0){
           remainder = s%10;
           numbers[remainder]++; 
           s=s/10;
           count1++;
       }
       
       while(t!=0){           
           remainder = t%10;
           t=t/10;
           count2++;
           if(--numbers[remainder]<0){
               return false;
           } 
       }
       if(count1!= count2){
    	   return false;
       }       
       return true;
    }
    
 public static void main(String [] args){
    boolean value =  Anagrams.check(123,213);
    System.out.println("Given numbers are Anagram ?" + value);
   }
}
