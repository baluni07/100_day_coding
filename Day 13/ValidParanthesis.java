import java.util.*;
public class ValidParanthesis {
    public static boolean isValid(String s) {
        Stack <Character> st= new Stack <Character>();

        for(int i=0;i<s.length();i++)
        {
            char ch= s.charAt(i);
            if(ch=='(' || ch=='{' || ch=='[' )
            st.push(ch);
            else
            {
                if(st.isEmpty()) return false;
                char c=st.pop();
                if( c=='('&& ch==')' ||  c=='['&& ch==']' ||  c=='{'&& ch=='}' ) continue;
                else return false;
            }
        }
        
        return st.isEmpty();
    } public static void main(String[] args) {
        String s= "[";
        System.out.println(isValid(s));
    }
}
