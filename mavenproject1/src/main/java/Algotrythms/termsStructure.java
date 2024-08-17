/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package math;

/**
 *
 * @author Theekshana
 */

class termsQueue{
    
    char terms[];
    int front,rear;

    public termsQueue(int size){
    
        terms = new char[size];
        front = 0;
        rear = 0;
             
    }
    
    public void termsEnQueue(char term){
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
    
    public char termsDeQueue(){
        
        if(isempty() == true){
        
            System.out.println("not extracted");
            return 0;
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

class termsStringQueue{
    
    String subterms[];
    int front,rear;

    public termsStringQueue(int size){
    
        subterms = new String[size];
        front = 0;
        rear = 0;
             
    }
    
    public void termsStringEnQueue(String term){
        if(isfull() == true){
        
        
            System.out.println("all terms extracton completed");
            
        }else{
        
            subterms[rear++] = term;
        }
             
    }
    public boolean isfull(){
    
        if(subterms.length == rear){
                    
            return true;
        
        }else{
        
            return false;
        }
    
    }
    
    public String termsStringDeQueue(){
        
        if(isempty() == true){
        
            System.out.println("not extracted");
            return "null";
        }else{
        
            return subterms[front++];
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
public class termsStructure {
    
    public termsStructure (String expression) {
    
        termsQueue termsq = new termsQueue(expression.length());
        
        termsStringQueue tseq = new termsStringQueue(expression.length());
        
        for(int i = 0; i < expression.length(); i++){
        
            termsq.termsEnQueue(expression.charAt(i));
        }
        
        for(int i = 0; i < expression.length(); i++){
             char toscan1 = termsq.termsDeQueue();
             
             
             
            if(toscan1 >= '0' && toscan1 <= '9' ){
            
                 
                do{
                
                    String numterm = new String();
                    numterm = Character.toString(toscan1);
                    numterm = numterm += numterm;
                    tseq.termsStringEnQueue(numterm);
                    
                }while(Character.isLetter(termsq.termsDeQueue()));
            }
            
            if(toscan1 >= 'a' && toscan1 <= 'z' || toscan1 >= 'A' && toscan1 <= 'Z'){
            
                 
                do{
                
                    String numterm = new String();
                    numterm = Character.toString(toscan1);
                    numterm = numterm += numterm;
                    tseq.termsStringEnQueue(numterm);
                    
                }while(Character.isDigit(termsq.termsDeQueue()));
            }
            
            
            if(toscan1 == '+'){
            
                 
                do{
                
                    String numterm = new String();
                    numterm = Character.toString(toscan1);
                    numterm = numterm += numterm;
                    tseq.termsStringEnQueue(numterm);
                    
                }while(Character.isLetter(termsq.termsDeQueue()) || Character.isDigit(termsq.termsDeQueue()));
            }
            
            if(toscan1 == '-'){
            
                 
                do{
                
                    String numterm = new String();
                    numterm = Character.toString(toscan1);
                    numterm = numterm += numterm;
                    tseq.termsStringEnQueue(numterm);
                    
                }while(Character.isLetter(termsq.termsDeQueue()) || Character.isDigit(termsq.termsDeQueue()));
            }
            
            if(toscan1 == '/'){
            
                 
                do{
                
                    String numterm = new String();
                    numterm = Character.toString(toscan1);
                    numterm = numterm += numterm;
                    tseq.termsStringEnQueue(numterm);
                    
                }while(Character.isLetter(termsq.termsDeQueue()) || Character.isDigit(termsq.termsDeQueue()));
            }
            
            if(toscan1 == '*'){
            
                 
                do{
                
                    String numterm = new String();
                    numterm = Character.toString(toscan1);
                    numterm = numterm += numterm;
                    tseq.termsStringEnQueue(numterm);
                    
                }while(Character.isLetter(termsq.termsDeQueue()) || Character.isDigit(termsq.termsDeQueue()));
            }
            
            if(toscan1 == '.'){
            
                 
                do{
                
                    String numterm = new String();
                    numterm = Character.toString(toscan1);
                    numterm = numterm += numterm;
                    tseq.termsStringEnQueue(numterm);
                    
                }while(Character.isLetter(termsq.termsDeQueue()) || Character.isDigit(termsq.termsDeQueue()));
            }
            
            if(toscan1 == '+'){
            
                 
                do{
                
                    String numterm = new String();
                    numterm = Character.toString(toscan1);
                    numterm = numterm += numterm;
                    tseq.termsStringEnQueue(numterm);
                    
                }while(Character.isLetter(termsq.termsDeQueue()) || Character.isDigit(termsq.termsDeQueue()));
            }
            System.out.println(toscan1);
            
        }
    }
    
    
    
}
