

public class AnaString {
    static boolean  print(String s1,String s2)
    {
        if( s1.length()!= s2.length())
        return false;

        int arr[]= new int [26];
        for ( int i=0;i<s1.length();i++)
        arr[s1.charAt(i)- 'a']++;
        for ( int i=0;i<s2.length();i++)
        arr[s2.charAt(i)- 'a']--;

        for(int i=0;i<26;i++)
        {
            if(arr[i]!=0)
            return false;
        }
        return true;

    }
    public static void main(String[] args) {
        String s1= "listen";
        String s2= "Silent";
        s1=s1.toLowerCase();
        s2=s2.toLowerCase();
        System.out.println(print(s1, s2));
    }
}
