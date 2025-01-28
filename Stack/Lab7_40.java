//Write a program to determine if an input character string is of the form a^ib^i
//where i >= 1 i.e., Number of ‘a’ should be equal to number of ‘b’.
import java.util.Scanner;
import java.util.Stack;

public class Lab7_40 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str=sc.nextLine();
        Stack<Character> stack=new Stack<Character>();
        
        for(int i=0;i<str.length();i++)
        {
            if(str.charAt(i)=='a'){  
                stack.push(str.charAt(i));
            }
            else if(str.charAt(i)=='b'){ 
                stack.pop();
            }
            else { 
                System.out.println("Invalid String");
                return;
            }
        }
        if(stack.empty()) 
        {
            System.out.println("Number of a  equal to number of b.");
        }
        else
        {
            System.out.println("Number of a is not  equal to number of b.");
        }
        sc.close();
    }
}