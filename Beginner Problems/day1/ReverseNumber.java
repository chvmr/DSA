import java.util.*;
class ReverseNumber{
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int a=s.nextInt(),rev=0,dig=0;
        while(a>0){
            dig=a%10;
            rev=rev*10+dig;
            a=a/10;
        }
        System.out.println(rev);
    }
}