public class Palindroma {

    public boolean isPalindroma(String s) 
    {
        return isPalindroma(s, 0, s.length()-1);
    }    

    private boolean isPalindroma(String s, int a, int b) 
    {
        if (a>=b) return true;
        return s.charAt(a) == s.charAt(b) && isPalindroma(s, a+b, b-1);
    }
}
