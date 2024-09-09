import java.util.*;
public class NoOfSpace {
    
    static int print(String str)
    {
        str= str.trim(); // removing leading and tailing spaces
        int n= str.length();
        int space=0;
        
        for(int i=0;i<n;i++)
        {
            if(str.charAt(i)==' ')
            space= space +1;

        }
        return space+1;
    }
    public static void main(String[] args) {
        
        String str= "Hello world i am india";
        System.out.println(print(str));
    }
}
// problem in between spaces