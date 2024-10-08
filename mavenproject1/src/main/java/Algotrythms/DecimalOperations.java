package Algotrythms;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
 

public class DecimalOperations {
     public static void main(String[] args) {
        
        System.out.println("What is the decimal number :"); 
        Scanner sc = new Scanner(System.in);
        int decimalNo =sc.nextInt();
        
        // call the decimalToBinary
        int[] binaryArr = decimalToBinary(decimalNo);
        System.out.print("Binary representation: ");
        for (int bit : binaryArr) {
            System.out.print(bit);
        }
         System.out.println();
         
        // call the decimalToOctal
       int[] octalArr = decimalToOctal(decimalNo);
        System.out.print("Octal representation: ");
        for (int bit : octalArr) {
            System.out.print(bit);
        }
        // call the decimatoHexaDecimal
          System.out.println();
         
        // call the decimalToOctal
       char[] hexaDecimalArr = decimalToHexaDecimal(decimalNo);
        System.out.print("HexaDecimal representation: ");
        for (int bit : hexaDecimalArr) {
            System.out.print(bit);
        }
        
         System.out.println();
         
         
      
    }
     
     public static int[] decimalToBinary(int decimalNo ){
       Queue<Integer> queue = new LinkedList<>();

    while (decimalNo >0){
        int rem = decimalNo % 2;
        queue.add(rem);
        decimalNo = decimalNo/2;
        
    }   
 // create an array to hold the binary digits
         int[] binaryArr = new int[queue.size()];
         int index = queue.size()-1;
         
         //dequeue and store in the array (in reverse order)
         while(!queue.isEmpty()){
             binaryArr[index--] = queue.poll();
         }
         System.out.print("Binary value is = : ");
        for (int bit : binaryArr) {
            System.out.print(bit);
        }
        System.out.println();
         return binaryArr;
     }
     
        public static int[] decimalToOctal(int decimalNo ){
       Queue<Integer> queue = new LinkedList<>();

    while (decimalNo >0){
    int rem = decimalNo % 8;
    queue.add(rem);
    decimalNo = decimalNo/8;
    }   
 // create an array to hold the binary digits
         int[] octalArr = new int[queue.size()];
         int index = queue.size()-1;
         
         //dequeue and store in the array (in reverse order)
         while(!queue.isEmpty()){
             octalArr[index--] = queue.poll();
         }
          System.out.print("Octal value is = : ");
        for (int bit : octalArr) {
            System.out.print(bit);
        }
        // call the decimatoHexaDecimal
          System.out.println();
         return octalArr;
     }
    
     
       public static char[] decimalToHexaDecimal(int decimalNo ){
       Queue<Character> queue = new LinkedList<>();

    while (decimalNo >0){
    int rem = decimalNo % 16;
    char hexDigit;// to keep the converted digit
    
             switch(rem){
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
             default: hexDigit=Character.forDigit(rem,10);
         }
    queue.add(hexDigit);
    decimalNo = decimalNo/16;
    }   
 // create an array to hold the binary digits
         char[] hexaDecimalArr = new char[queue.size()];
         int index = queue.size()-1;
         
         //dequeue and store in the array (in reverse order)
         while(!queue.isEmpty()){
             hexaDecimalArr[index--] = queue.poll();
         }
         System.out.print("HexaDecimal value is = : ");
        for (char bit : hexaDecimalArr) {
            System.out.print(bit);
        }
         return hexaDecimalArr;
     }}
      
 