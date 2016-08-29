package com.leapfrog.classpractice;

import java.util.Scanner;

public class Program {
    
    public static void main(String[] args) {
        String text = "AAAA!wwwweeeerhhhqwe";
        String text2 = "4A1!4w4e1r3h1q1w1e";
        int count = 0;
        char prev = '0';
        System.out.println("The compression value of "+text+" is ");
        for(int i = 0; i<text.length();i++){
            
            if(i==text.length()){
                System.out.print(count + String.valueOf(prev));
            }
            if(prev=='0'){
                prev= text.charAt(i);
                count=1;
            }
            else if(prev!=text.charAt(i)){
                System.out.print(count + String.valueOf(prev));
                prev=text.charAt(i);
                count = 1;
            }else{
                count++;
            }
            if(i == text.length()-1){
               System.out.print(count + String.valueOf(prev)); 
            }
            
        }
        System.out.println("");
        System.out.println("The depression value of "+text2+" is ");
        for(int i =0;i<text2.length();i++){
            prev=text2.charAt(i);
            boolean yes = Character.isDigit(prev);//it checks whether the character is digit or not and assign true or flase to variable yes
            if(yes){
                i++;//to display the alphabetic character we need to access alphabetic value
                for(int j=0; j<Character.getNumericValue(prev);j++){
                    System.out.print(text2.charAt(i));
                }//Character.getNumericValue(prev) converts the digit in string to numeric value. 
            }
        }
        System.out.println("");
    }
}