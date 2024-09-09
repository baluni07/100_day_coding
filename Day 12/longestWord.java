import java.util.*;
public class longestWord {
    static int print(String str)
    {
        int n = str.length();
        int i=0;
        int c=0;
        int max=0;
        for(i=0;i<n;i++)
        {
        if(str.charAt(i)!=' ')
        {
            c++;
        }
        else
        {
            max= Math.max(max,c);
            c=0;
        }
    }
    // Check the last word
    max= Math.max(max,c);
        return max;
    }





    public static void main(String[] args) {
        String str= "Microsoft Teams Excel Opportunity";
        System.out.println(print(str));
    }
}
