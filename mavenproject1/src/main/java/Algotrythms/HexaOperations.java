/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Algotrythms;

import java.util.Arrays;
import java.util.Stack;

/**
 *
 * @author viman
 */
public class HexaOperations {
    
     public String hexaToBinary(String hexa){
    
        String hexaString=hexa;// convert octal number into a String type
        
        int[] binaryArray=new int[hexaString.length()*4]; // define an array to store binarydigit. lenth is 3x octal
        
        //System.out.println("length of the octal array is = "+binaryArray.length);
        int binaryCount=0; //this is for assign indexes for octalArray
        
        int c=0;// this is for get the indexes of binary digit string
        for(int i=0;i<hexaString.length();i++)
        {
            char digitValue=hexaString.charAt(i);
            //System.out.println(digitValue);
            String binaryDigit;
            
            switch (digitValue) {
            case '0': binaryDigit= "0000";
            break;
            case '1': binaryDigit= "0001";
            break;
            case '2': binaryDigit= "0010";
            break;
            case '3': binaryDigit= "0011";
            break;
            case '4': binaryDigit= "0100";
            break;
            case '5': binaryDigit= "0101";
            break;
            case '6': binaryDigit= "0110";
            break;
            case '7': binaryDigit= "0111";
            break;
            case '8': binaryDigit= "1000";
            break;
            case '9': binaryDigit= "1001";
            break;
            case 'A': binaryDigit= "1010";
            break;
            case 'B': binaryDigit= "1011";
            break;
            case 'C': binaryDigit= "1100";
            break;
            case 'D': binaryDigit= "1101";
            break;
            case 'E': binaryDigit= "1110";
            break;
            case 'F': binaryDigit= "1111";
            break;
            default: throw new IllegalArgumentException("Invalid octal digit: " + digitValue);
            }
             //System.out.println(binaryDigit); // To confirm binary digit has been converted correctly
            
            /// assignin those binarydigit strings to array.'0010' take as 0 0 1 0
            
            for(int j=0;j<4;j++)
            {
            binaryArray[c]= Integer.parseInt(Character.toString(binaryDigit.charAt(j)));
             //System.out.println(binaryArray[c]);
            c++;
            }                
          } 
     StringBuilder resultString = new StringBuilder();

        for (int i : binaryArray) {
            // Append each integer to the result string
            resultString.append(String.format("%01d", i));
        }
     
    String result = resultString.toString();
    System.out.println("Binary Value is "+ result);
    
    return result; 
   
    }
     
     
     public int hexaToDecimal(String hexa)
    {
        String number = String.valueOf(hexa); // convert input number into a string
        int numlength= number.length();
        int[] decimalArray = new int[numlength]; // define an array to store decimal digits
        
        int finalDecimal=0; 
        int decimalDigit;

        
        for(int i=numlength-1;i>=0;i--)
        {
          int hexaDigitIndex=(numlength-1)-i; // To get the first number of the converted string array. but it has the maximum power of 16.  
         //System.out.println(i);
         char hexdigit=number.charAt(hexaDigitIndex); // to ge the digit of hexadecimal string
         int hexadigit=0;
         
         switch(hexdigit){
             case 'A': hexadigit=10; 
             break;
             case 'B': hexadigit=11; 
             break;
             case 'C': hexadigit=12; 
             break;
             case 'D': hexadigit=13; 
             break;
             case 'E': hexadigit=14; 
             break;
             case 'F': hexadigit=15; 
             break;
             default : hexdigit=hexdigit;
             break;
         }
         
          decimalDigit=(int)(hexadigit* Math.pow(16, i));
         
         //System.out.println("index "+hexaDigitIndex);
         //System.out.println("power of 16 is "+i);
         //System.out.println(hexdigit);
         decimalDigit=(int) (Character.getNumericValue(hexdigit)* Math.pow(16, i));
         
         
         finalDecimal=finalDecimal+decimalDigit; // adding convereted decimal value of that octal digit to the toatal
         
//         decimalStack.push(decimalDigit);
//         System.out.println(decimalDigit);
        }
        System.out.println("Decimal Value is = "+finalDecimal);       
        return finalDecimal;
    }
     
     
     public String hexaToOctal(String hexa)
     {
         HexaOperations newhex =new HexaOperations();
         int number=newhex.hexaToDecimal(hexa);
         String numberString = Integer.toString(number);
         
        int decimalvalue=number;
         
         Stack<Integer> hexStack = new Stack<>();
     int octmod=0; //  to keep mod value of the digit vise
     
     
     while(decimalvalue!=0)
     {
         //System.out.println(decimalvalue);
         octmod=decimalvalue%8; // get the mod of digital digitvalue
            

         //System.out.println("mod is"+octmod);
         hexStack.push(octmod);    
         decimalvalue=decimalvalue/8;    
     }
     
       int stackSize = hexStack.size();
      StringBuilder resultString = new StringBuilder();

        for (int i=0; i<stackSize;i++) {
            // Append each integer to the result string
            resultString.append(String.format("%01d", hexStack.pop()));
        }
     
    String result = resultString.toString();
    System.out.println("Octal value is="+result);
     return result;
     }
      
      
      
      
      
     
     
     public static void main(String[] args){
     
     HexaOperations newhex = new HexaOperations();
     String array = newhex.hexaToBinary("2B77A");
     
    
     System.out.println("Next method");
     newhex.hexaToDecimal("2A");
     
      System.out.println("Next method");
      newhex.hexaToOctal("2BA3");
     
     }
    
}
