import java.util.Stack;

public class Parentesi {

    public boolean annidate(String s) {

        Stack<Character> p = new Stack<Character>();

        for (int k = 0; k<s.length(); k++) 
        {
            char c = s.charAt(k);
            switch(c) 
            {
                case '(': case '[': p.push(c); break;
                case ')': if (p.isEmpty() || p.pop() != '(') return false; break;
                case ']': if (p.isEmpty() || p.pop() != '[') return false; break;
            }
        }
    return p.isEmpty();
    }  
}
