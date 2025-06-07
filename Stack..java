package hackerRank;

import java.util.Scanner;
import java.util.Stack;


public class Solution{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Stack<String> stack = new Stack<String>();
        
            int limit = input.nextInt();
            
            String [] array = new String[limit];
            
            for(int i = 0; i < limit; i++){
                int stackInput = input.nextInt();
                    switch(stackInput){
                        case 1 -> {
                            array [i] = input.next();
                            stack.push(array[i]);
                            break;
                        }
                        case 2 -> {
                            if(!stack.isEmpty()){
                                stack.pop();
                            }
                            break;
                        }
                    }
            }
            if(!stack.isEmpty()){
                System.out.println("THE TOP OF STACK IS " + stack.peek());
            }else{
                System.out.println("STACK IS EMPTY");
            }
    }
}
