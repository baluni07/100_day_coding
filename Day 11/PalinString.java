

public class PalinString {
    static boolean isPalindrome(String str)
    {
        boolean flag= false;
        String rev= "";
        for ( int i =str.length()-1; i>=0;i--)
        rev =rev + str.charAt(i);

        if ( str.equals(rev))
        flag = true;

        return flag;
    }
    public static void main(String[] args) {
        String str= "Naman";
        str= str.toLowerCase();
        System.out.println(isPalindrome(str));
    }
}
