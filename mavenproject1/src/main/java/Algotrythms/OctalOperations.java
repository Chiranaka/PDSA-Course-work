/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Algotrythms;
import java.util.*;


public class OctalOperations {
    
    public int[] octalToBinary(int octal){
    
        String octalString=Integer.toString(octal);// convert octal number into a String type
        
        int[] binaryArray=new int[octalString.length()*3]; // define an array to store binarydigit. lenth is 3x octal
        
        System.out.println("length of the octal array is = "+binaryArray.length);
        int binaryCount=0; //this is for assign indexes for octalArray
        
        int c=0;// this is for get the indexes of binary digit string
        for(int i=0;i<octalString.length();i++)
        {
            char digitValue=octalString.charAt(i);
            System.out.println(digitValue);
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
             System.out.println(binaryDigit); // To confirm binary digit has been converted correctly
            
            /// assignin those binarydigit strings to array.'010' take as 0 1 0
            
            for(int j=0;j<3;j++)
            {
            binaryArray[c]= Integer.parseInt(Character.toString(binaryDigit.charAt(j)));
             System.out.println(binaryArray[c]);
            c++;
            }                
          }     
    return binaryArray;   
    }
    
    
    public int octalToDecimal(int octal)
    {
        String number = String.valueOf(octal); // convert input number into a string
        int numlength= number.length();
        int[] decimalArray = new int[numlength]; // define an array to store decimal digits
        
        int finalDecimal=0;
        
        int decimalDigit;
//        Stack<Integer> decimalStack = new Stack<>();
        
        for(int i=numlength-1;i>=0;i--)
        {
          int octalDigitIndex=(numlength-1)-i; // To get the first number of the converted string array. but it has the maximum power of 8.  
         //System.out.println(i);
         
         decimalDigit=(int) (Character.getNumericValue(number.charAt(octalDigitIndex))* Math.pow(8, i));
         //System.out.println(number.charAt(octalDigitIndex));
         
         finalDecimal=finalDecimal+decimalDigit; // adding convereted decimal value of that octal digit to the toatal
         
//         decimalStack.push(decimalDigit);
//         System.out.println(decimalDigit);
        }
        
        
        //System.out.println(finalDecimal);
        
        return finalDecimal;
    }
    

    public void octalToHexadeciaml(int octal)
    {
        OctalOperations newmethod= new OctalOperations();
     int decimalvalue = newmethod.octalToDecimal(octal); // convert octal into a decimal value
       System.out.println("decimal value is"+decimalvalue);
     
     
     Stack<Character> hexStack = new Stack<>();
     int hexmod=0; //  to keep mod value of the digit vise
     char hexDigit;
     
     while(decimalvalue!=0)
     {
         System.out.println(decimalvalue);
         hexmod=decimalvalue%16; // get the mod of digital digitvalue
            
         switch(hexmod){
             case 10: hexDigit='A';
             break;
             case 11: hexDigit='B';
             break;
             case 12: hexDigit='C';
             break;
             case 13: hexDigit='D';
             break;
             case 14: hexDigit='E';
             break;
             case 15: hexDigit='F';
             break;
             default: hexDigit=Character.forDigit(hexmod,10);
         }
         System.out.println("mod is"+hexDigit);
         hexStack.push(hexDigit);    
         decimalvalue=decimalvalue/16;
         
     }
     
   int length= hexStack.size();
   for(int i=0; i<length;i++)
   {
       System.out.print(hexStack.pop());
   }
     
    }
       
    
    
    
    
    public static void main(String arg[])
    {
    OctalOperations newobj = new OctalOperations();
    int[] array=newobj.octalToBinary(456);
    int len=array.length;
    System.out.println("Lenght is "+len);
    for(int i=0;i<len;i++)
    {
        System.out.print(array[i]);
    }
   
    System.out.println("Finished");
    
    
    
    newobj.octalToDecimal(58);
    
    System.out.println("Next method");
    
    newobj.octalToHexadeciaml(53);
    
    }
    
}
