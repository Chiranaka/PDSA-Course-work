package Algotrythms;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

 
public class binary_to {
        public static void main(String[] args) {
        System.out.println("What is the Binary Number");
        Scanner sc = new Scanner(System.in);
        String binaryNo =sc.nextLine();
        // declare array 
        int[] binaryArr = new int[binaryNo.length()];
               
       // Convert the string to an array of integers
        for (int i = 0; i < binaryNo.length(); i++) {
            binaryArr[i] = Character.getNumericValue(binaryNo.charAt(i));
        }
        
        // Convert the binary array to a decimal number
        int decimal = binaryToDecimal1(binaryArr);
        System.out.println("Decimal representation: " + decimal);
        
        
        // conver the binary to octal
        String octalStr = binaryToOctal(binaryArr);
        System.out.println("Octal representation: " + octalStr);
        
        // conver the binary to octal
        String hexaDecimal = binaryToHexaDecimal(binaryArr);
        System.out.println("HexaDecimal representation: " + hexaDecimal  );
        
        }
        
        
        public static int binaryToDecimal1 (int[] binaryArr ){
         Stack<Integer> Stack = new Stack<>();  
         Queue<Integer> queue = new LinkedList<>();
         int decimal = 0;
        
          
        // push all the digits into the stack
            for (int bit : binaryArr) {
            Stack.push(bit);
        }
        // pop frem the stack and enqueue in to the stack
        while(!Stack.isEmpty()){
            queue.add(Stack.pop());
        }
         

    // Calculate decimal value from the queue
        int power = 0; // Start with the least significant bit (LSB)
        while (!queue.isEmpty()) {
            int bit = queue.poll();
            decimal += bit * Math.pow(2, power);
            power++;
        }

         return decimal;
    
     }
      //Conver into binary to octal
          public static String binaryToOctal (int[] binaryArr ){
         Stack<Integer> Stack = new Stack<>();  
         Queue<Integer> queue = new LinkedList<>();
        
          
       // Process the binary digits in groups of three
        int groupValue = 0;
        int power = 0;
        for (int i = binaryArr.length - 1; i >= 0; i--) {
            groupValue += binaryArr[i] * Math.pow(2, power);
            power++;
            
            if (power == 3 || i == 0) {
                Stack.push((groupValue));
                groupValue = 0;
                power = 0;
                 }
        }
        // Pop from stack and enqueue into queue
        while (!Stack.isEmpty()) {
            queue.add(Stack.pop());
        }
        
        // Build the octal string from the queue
       String octalStr = "";
        while (!queue.isEmpty()) {
            octalStr += queue.poll();   
        }

             return octalStr;
        }
     
        // Conver Binary To HexaDecimal
         public static String binaryToHexaDecimal (int[] binaryArr ){
         Stack<Integer> Stack = new Stack<>();  
         Queue<String> queue = new LinkedList<>();
        
          
       // Process the binary digits in group of three
        int groupValue = 0;
        int power = 0;
        for (int i = binaryArr.length - 1; i >= 0; i--) {
            groupValue += binaryArr[i] * Math.pow(2, power);
            power++;
            
            
            if (power == 4 || i == 0) {
                Stack.push((groupValue));
                groupValue = 0;
                power = 0;
            }
        }

        // Pop from stack and enqueue into queue
        while (!Stack.isEmpty()) {
             int value = Stack.pop();
             String hexdigit = convertToHexaDigit(value);
             queue.add(hexdigit);
            
        }

        // Build the octal string from the queue
       String hexaDecimal = "";
        while (!queue.isEmpty()) {
            hexaDecimal += queue.poll();  // Concatenating each octal digit
        }

        return hexaDecimal;
                }

        private static String convertToHexaDigit(int value){
            String hexdigit;
            switch(value){
                case 10:
                    hexdigit ="A";
                    break;
                case 11:
                    hexdigit ="B";
                    break;
                case 12:
                    hexdigit ="C";
                    break;
                case 13:
                    hexdigit ="D";
                    break;
                case 14:
                    hexdigit ="E";
                    break;
                case 15:
                    hexdigit ="F";
                    break;
                default:
                    hexdigit = String.valueOf(value);
                    break;
            }

            return hexdigit;
        }
     
}
