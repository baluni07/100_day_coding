public class Armstrong {
    static String armstrongNumber(int n) {
        // code here
        
        int t=n;

        int rem=0;
        int sum= 0;
        while(n!=0)
        {
          rem= n%10;
          sum = sum + (rem*rem*rem);
          n=n/10;
        }
    if (t==sum)
    return "true";
    else 
    return "false";
}
public static void main(String[] args) {
    int n= 153;
    System.out.println(armstrongNumber(n));
}
}

 
