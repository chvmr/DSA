import java.util.*;
class FibonacciSeries {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);

        int no=s.nextInt();
        int a=0,b=1,c;

        for(int i=0;i<no;i++){
            System.out.print(a+" ");
            c=a+b;
            a=b;
            b=c;
        }
    }
}