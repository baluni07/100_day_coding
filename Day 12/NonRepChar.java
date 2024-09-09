

public class NonRepChar {
    static void print(String str)
    {
        int freq[]= new int[26];
        for ( int i=0;i<str.length();i++)
            freq[str.charAt(i)-'a']++;
        for ( int i=0;i<26;i++)
        {
            if(freq[i]==1) 
        {
            System.out.println((char)(i+'a'));
            
        }
    }
    }
    public static void main(String[] args) {
        String str= "AyushBaluni";
        str= str.toLowerCase();
        print(str);
    }
}
