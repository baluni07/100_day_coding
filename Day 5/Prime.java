
import java.util.*;
public class Prime
{

    static int isPrime(int N)
    {
        // code here
        if(N<=1)
        return 0;
        if(N==2 || N==3)
        return 1;
        if(N%2==0 || N%3==0)
        return 0;
        for(int i=5;i<=Math.sqrt(N);i=i+6)
        {
            if(N%i==0 || N%(i+2)==0)
            return 0;
        }
        return 1;
    }
    
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a number");
        int N=sc.nextInt();
        System.out.println(isPrime(N));
        sc.close();

    }
}


