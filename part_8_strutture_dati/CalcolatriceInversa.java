import java.util.List;
import java.util.Stack;

public class CalcolatriceInversa {

    public int calcola(List<String> q) throws Exception
    {
        Stack<Integer> p = new Stack<Integer>();
        for (String v:q) 
        {
            if(v.equals("+")) 
                p.push(p.pop() + p.pop());
            else if (v.equals("-"))
            {
                Integer arg2 = p.pop();
                p.push(p.pop()-arg2);
            }
            else
            {
                Integer i = Integer.parseInt(v);
                p.push(i);
            }
        }
        if (p.size() == 1) return p.pop();
        else
        {
            throw new Exception();
        }
    }
}
