import java.util.Queue;
import java.util.Stack;

public class Inversione {

    public void inverti(Queue<Integer> q)
    {
        Stack<Integer> s = new Stack<Integer>();

        while(!q.isEmpty()) 
        {
            Integer e  = q.remove();
            s.push(e);
        }
        while(!s.isEmpty()) q.add(s.pop());
    }
}
