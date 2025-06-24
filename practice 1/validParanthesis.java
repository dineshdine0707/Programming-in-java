import java.util.*;
public class validParanthesis {
    public static void main(String[] args) {
        String str="{()[(]}";
        Stack<Character> stack=new Stack();
        boolean flag=true;
        for(char ch:str.toCharArray())
        {
            if(ch=='{' || ch=='[' || ch=='(')
            {
                stack.push(ch);
            }
            else if(ch==')')
            {
                char temp1=stack.pop();
                if(temp1!='(')
                {
                flag=false;
                }
            }
            else if(ch==']')
            {
                char temp2=stack.pop();
                if(temp2!='[')
                {
                flag=false;
                } 
            }
            else if(ch=='}')
            {
                char temp3=stack.pop();
                if(temp3!='{')
                {
                flag=false;
                } 
            }
        }
        System.out.println(flag);
    }
}
