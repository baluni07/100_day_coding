public class Anagram {
    // Function is to check whether two strings are anagram of each other or not.
    public static boolean isAnagram(String a, String b) {

        // Your code here
         
        if (a.length() !=b.length())
        return false;
        
        int freq[] = new int [26];
        for(int i=0;i<a.length();i++)
            freq[a.charAt(i) - 'a']++;
        for(int i=0;i<b.length();i++)
            freq[b.charAt(i) - 'a']--;
        for(int i=0;i<26;i++)
        {
            if(freq[i]!=0)
            return false;
        }
        return true;
}
public static void main(String[] args) {
    String a= "listen";
    String b= "silent";
    System.out.println("Anagram :" );
    System.out.println(isAnagram(a,b));
}
}
