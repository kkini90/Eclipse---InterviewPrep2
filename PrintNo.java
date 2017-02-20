package com.usc.karthik;

public class PrintNo{

    public static void main(String []args){
       int number = 5; 
       int j = 1;
       if(number %2==0){
           int i = 0 ;
           while(j<=number){       	   
               System.out.print(" " +i);
               i = i +2;
               j++;
           }
           
       }else{
           int i = 1 ;
            while(j<=number){            	
               System.out.print(" " +i);
               i = i +2;
               j++;               
            }
       }      
    }
}

