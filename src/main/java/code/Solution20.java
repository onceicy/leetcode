package code;
import java.util.*;
public class Solution20 {
    public boolean isValid(String s) {
        Stack<Character> temp = new Stack<Character>();
        temp.push('#');
        for (int number = 0; number < s.length(); number++) {
            switch (s.charAt(number)) {
                case ')' :
                    if (temp.peek() != '(') {
                        return false;
                    }
                    temp.pop();
                    break;
                case ']' :
                    if (temp.peek() != '[') {
                        return false;
                    }
                    temp.pop();
                    break;
                case '}' :
                    if (temp.peek() != '{') {
                        return false;
                    }
                    temp.pop();
                    break;
                default :
                    temp.push(s.charAt(number));                       
            }
        }  
        if (temp.peek() != '#') {
            return false;
        }
        return true;
    }
}
