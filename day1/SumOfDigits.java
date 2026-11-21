import java.util.*;
class SumOfDigits{
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int a=s.nextInt(),sum=0,dig=0;
        while(a>0){
            dig=a%10;
            sum+=dig;
            a=a/10;
        }
        System.out.println(sum);
    }
}