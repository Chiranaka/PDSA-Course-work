/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.mavenproject1;
import java.util.*;


public class NewClass {
    
    public int[] octalToBinary(int octal){
    
        String octalString=Integer.toString(octal);// convert octal number into a String type
        int[] octalArray=new int[octalString.length()*3]; // define an array to store binarydigit. lenth is 3x octal
        
        System.out.println("length of the octal array is = "+octalArray.length);
        int binaryCount=0; //this is for assign indexes for octalArray
        
        for(int i=0;i<octalString.length();i++)
        {
            int digitValue=Integer.valueOf(octalString.charAt(i));
            String binaryDigit;
            
            switch (digitValue) {
            case '0': binaryDigit= "000";
            break;
            case '1': binaryDigit= "001";
            break;
            case '2': binaryDigit= "010";
            break;
            case '3': binaryDigit= "011";
            break;
            case '4': binaryDigit= "100";
            break;
            case '5': binaryDigit= "101";
            break;
            case '6': binaryDigit= "110";
            break;
            case '7': binaryDigit= "111";
            break;
            default: throw new IllegalArgumentException("Invalid octal digit: " + digitValue);
            }
            
            /// assignin those binarydigit strings to array.'010' take as 0 1 0
            int c=0;// this is for get the indexes of binary digit string
            for(int j=binaryCount;j<(binaryCount+3);j++)
            {
            octalArray[j]= Integer.valueOf(binaryDigit.charAt(c));
            c++;
            }
        Stack<Integer> octalInStack = new Stack<>();
                   
        }
//        Stack<Integer> octalInStack = new Stack<>();
        
    return octalArray;
    
    }
       
    public static void main(String arg[])
    {
    NewClass newobj = new NewClass();
    int[] array=newobj.octalToBinary(456);
    int len=array.length;
    System.out.println("Lenght is "+len);
    for(int i=len;i>0;i--)
    {
        System.out.println("value"+array[i-1]);
    }
   
    System.out.println("Finished");
    }
    
}
