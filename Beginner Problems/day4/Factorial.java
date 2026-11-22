import java.util.*;
class Factorial{
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int no=s.nextInt(),fact=1;
        if(no==0||no==1)
            fact=1;
        for(int i=1;i<=no;i++){
            fact=fact*i;
        }
        System.out.println(fact);
    }
}