public class Palindrone{
    static String isDeciBinPalin(long N){
        // code here
        long t= N;
        long rev=0;
        long rem=0;
         while(N!=0)
         {
             
             rem= N%10;
             rev= rev*10 + rem;
             N= N/10;
         }
         if(t==rev)
         return "Yes";
         else
         return "No";
    }
    public static void main(String[] args) {
        long n= 121;
        System.out.println(isDeciBinPalin(n));
    }
}

