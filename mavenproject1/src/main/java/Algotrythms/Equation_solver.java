/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package math;

/**
 *
 * @author Theekshana
 */

class StringQueue{
    
    String terms[];
    int front,rear;

    public StringQueue(int size){
    
        terms = new String[size];
        front = 0;
        rear = 0;
             
    }
    
    public void StringEnQueue(String term){
        if(isfull() == true){
        
        
            System.out.println("all terms extracted");
            
        }else{
        
            terms[rear++] = term;
        }
             
    }
    public boolean isfull(){
    
        if(terms.length == rear){
                    
            return true;
        
        }else{
        
            return false;
        }
    
    }
    
    public String StringDeQueue(){
        
        if(isempty() == true){
        
            System.out.println("not extracted");
            return ("empty");
        }else{
        
            return terms[front++];
        }
    
        
    }
    
    public boolean isempty(){
    
        if(front == rear){
        
            return true;
        }else{
        
            return false;
        }
            
            
    }
}
class stack {

    char[] stack;
    int top;

    public stack(int length) {

        stack = new char[length];
        top = -1;
    }

    public void push(char data) {

        stack[++top] = data;
    }

    public char pop() {

        if (isEmpty()) {

            //System.out.println ("Stack is Empty");
            return 0;

        } else {

            return stack[--top];
        }

    }

    public boolean isEmpty() {

        if (top == 0) {

            return true;
        } else {
            return false;
        }

    }

    public int getTop() {

        return top;
    }
}

class equationScanner {

    String equation;
    int legnth;

    public equationScanner(String expression, int length) {

        equation = expression;
        this.legnth = length;
    }

}


public class Equation_solver {
    
    String expression;
    int length;
    
    public Equation_solver(String expression){
    
        this.expression = expression;
        //this.length = length;

    }
    public String betweenbrackets(){
        String sub_equation_String = new String();
         int i = 0;
         String inverse = new String();
                for(i = 0; i<length; i++){
        
            stack s = new stack(length);
            
            switch (expression.charAt(i)) {
                case '(':
                case '[':
                case '{':
                    s.push(expression.charAt(i));
                    break;
                default:
                    break;
            }
            char bracket = s.pop();
            
            if(expression.charAt(i) == 'x'){
            
                
                
                
                for(int j = 0; j <(length-i); j++){
                    switch (bracket) {
                        case '(':
                            inverse = ")";
                            break;
                        case '[':
                            inverse = "]";
                            break;
                        case '{':
                            inverse = "}";
                            break;
                    }
                
                    
                }
                sub_equation_String = expression.substring(expression.indexOf(bracket) + 1, expression.indexOf(inverse));
                System.out.println(sub_equation_String);
            }else{
                
                
                sub_equation_String = expression.substring(expression.indexOf(bracket) + 1, expression.indexOf(inverse));
                System.out.println(sub_equation_String);
                
                
            
            }
            
        }
                return sub_equation_String;
                
    }
    
    public String solve(String expression){
        
        String processed_expression = new String();
        
        expression = expression.replaceAll("\\s+", "");
        String[] terms = expression.split("(?=[-+])|(?==)");
        
        StringQueue sq = new StringQueue(terms.length);
        
        for(int i = 0; i<terms.length; i++ ){
        
            if(terms[i].contains("x")){
                
                sq.StringEnQueue(terms[i]);
                
            }else{
            
                
            }
        }
    
        return processed_expression;
    }
    

}
