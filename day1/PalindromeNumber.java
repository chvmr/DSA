import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int a=s.nextInt(),rev=0,dig=0,b=a;
        while(a>0){
            dig=a%10;
            rev=rev*10+dig;
            a=a/10;
        }
        if(b==rev)
            System.out.println("Yes");
        else
            System.out.println("No");
    }
}