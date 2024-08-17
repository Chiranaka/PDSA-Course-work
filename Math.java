/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package math;

import java.util.Scanner;

/**
 *
 * @author Theekshana
 */
class operator_validity {

    boolean validity = true;
    String expression;

    public operator_validity(String expression) {

        this.expression = expression;
    }

    public boolean operator_validity_check() {

        for (int i = 0; i < expression.length(); i++) {

            if (expression.charAt(i) == '+' || expression.charAt(i) == '-'
                    || expression.charAt(i) == '*' || expression.charAt(i) == '/') {

                if (expression.charAt(i + 1) == '+' || expression.charAt(i + 1) == '-'
                        || expression.charAt(i + 1) == '*' || expression.charAt(i + 1) == '/') {

                    validity = false;
                } else {

                    validity = true;
                }
            }
        }
        return validity;
    }
}

//class stack_comm {
//
//    String patteren;
//
//    public stack_comm() {
//
//    }
//
//    public void set(String pattern) {
//
//        this.patteren = pattern;
//    }
//
//    public String get() {
//
//        return patteren;
//
//    }
//}

class CharacterStack {

    int top;
    char[] pattern;

    public CharacterStack(int x) {

        top = 0;
        pattern = new char[x];
    }

    public void push(char character) {

        pattern[top++] = character;

    }

    public char pop() {

        if (isEmpty()) {

            //System.out.println ("Stack is Empty");
            return 0;

        } else {

            return pattern[--top];
        }

    }
//    stack_comm sc = new stack_comm();

    public String print() {

        String Patteren = "";
        for (int i = 0; i < top; i++) {
            Patteren += pattern[i];
        }

        return pattern.toString();
//        sc.set(Patteren);

    }

    public int getTop() {

        return top;
    }

    public boolean isEmpty() {

        if (top == 0) {

            return true;
        } else {
            return false;
        }

    }

}

public class Math {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner src1 = new Scanner(System.in);
        System.out.println("Enter your expreesion: ");
        String myPattern = src1.nextLine();
        
        

        int x = myPattern.length();
        int indicator = 0;

        CharacterStack stack1 = new CharacterStack(x);
        CharacterStack stack2 = new CharacterStack(stack1.print().length());

        for (int i = 0; i < myPattern.length(); i++) {
            switch (myPattern.charAt(i)) {
                case '(':
                case '[':
                case '{':
                    stack1.push(myPattern.charAt(i));
                    break;
                default:
                    break;
            }
        }



        for (int i = 0; i < x; i++) {

            switch (myPattern.charAt(i)) {
                case '[':

                    stack2.push(myPattern.charAt(i));
                    break;

                case '{':

                    stack2.push(myPattern.charAt(i));
                    break;
                case '(':

                    stack2.push(myPattern.charAt(i));
                    break;

                case ']':

                    char return_val = stack2.pop();

                    if (return_val != '[') {

                        indicator = 1;
                    }
                    break;

                case '}':

                    return_val = stack2.pop();

                    if (return_val != '{') {

                        indicator = 1;
                    }
                    break;

                case ')':

                    return_val = stack2.pop();

                    if (return_val != '(') {

                        indicator = 1;
                    }
                    break;

                default:
                    break;

            }

        }

        operator_validity ov = new operator_validity(myPattern);

        int top = stack2.getTop();

        if (top == 0 && indicator != 1 && ov.validity == true) {

            System.out.println("Syntextually correct");
            
            termsStructure ts = new termsStructure(myPattern);
            

        } else {

            System.out.println("Syntextually incorrect");

        }

    }
}
