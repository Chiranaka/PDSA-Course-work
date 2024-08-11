/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Algotrythms;

import java.util.Scanner;
import Algotrythms.*;
import java.util.stream.IntStream;


public class ExecutingClass {
    
    public static void main(String args[])
    {
        int number;// to get integer values
        String s_number;// to get String values such as Hexadecimal values
        
        int selectingNumber;// to get the selecting input number
        Scanner scn=new Scanner(System.in);
        
        String reply="yes";
        do{
        System.out.println("What is the Base of the Number you want to Convert (1.Binary 2.Octal 3.Decimal 4.Hexadecimal)");
        System.out.println("Enter the relevent number");
        
        selectingNumber=scn.nextInt();
        //converting binary to other bases
        
        if(selectingNumber==1)
        {
         System.out.println("Enter the Number you Wnat to Convert");
         number=scn.nextInt();
         
         binary_to newBinary = new binary_to();
         // declare array 
        int[] binaryArr = new int[Integer.toString(number).length()];
               
       // Convert the string to an array of integers
                for (int i = 0; i < Integer.toString(number).length(); i++) {
                    binaryArr[i] = Character.getNumericValue(Integer.toString(number).charAt(i));
                }

                 newBinary.binaryToDecimal1(binaryArr);
                 newBinary.binaryToOctal(binaryArr);
                 newBinary.binaryToHexaDecimal(binaryArr);
              
        }
        
        // Converting Octal to other bases
        else if(selectingNumber==2)
        {
         System.out.println("Enter the Number you Wnat to Convert");
         number=scn.nextInt(); 
         
         OctalOperations newOctal = new OctalOperations();
         newOctal.octalToBinary(number);
         newOctal.octalToDecimal(number);
         newOctal.octalToHexadeciaml(number);
                
        }
        
        // Converting Decimal to other bases
         else if(selectingNumber==3)
        {
         System.out.println("Enter the Number you Wnat to Convert");
         number=scn.nextInt(); 
         
         DecimalOperations newDecimal = new DecimalOperations();
         
         newDecimal.decimalToBinary(number);
         newDecimal.decimalToOctal(number);
         newDecimal.decimalToHexaDecimal(number);       
        }
        
        //converting Hexadecimal to other bases
        else if(selectingNumber==4)
        {
         System.out.println("Enter the Number you Wnat to Convert");
         s_number=scn.nextLine(); 
        
         HexaOperations newHexa = new HexaOperations();
         
         newHexa.hexaToBinary(s_number);
         newHexa.hexaToDecimal(s_number);
         newHexa.hexaToOctal(s_number);
        
        }
        
        System.out.println("do you want to Convert another Number (Press Any Key to Continue....)");
        reply=scn.nextLine();
        }
        while(reply!="n"|| reply!="N");
    }
    
}
