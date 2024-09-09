

public class FirstLast {
    public static String firstlast(String str,int n)
    {
        StringBuilder sb= new StringBuilder(str);

        for ( int i=0;i<n;i++)
        {
            if(i==0 || i==(n-1))
    
                sb.setCharAt(i,Character.toUpperCase((char)str.charAt(i)));
            else if(str.charAt(i)==' '){
            sb.setCharAt(i+1,Character.toUpperCase((char)str.charAt(i+1)));
            sb.setCharAt(i-1,Character.toUpperCase((char)str.charAt(i-1)));
            }

        }
        return sb.toString();
    }
    public static void main(String[] args) {
        String str= "geek for geeks";
        int n= str.length();
        System.out.println(str);
        String a= firstlast(str,n);
        System.out.println(a);
    }
}
