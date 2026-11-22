import java.util.*;
class SumOfNaturalNumbers{
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int no=s.nextInt(),sum=0;
        for(int i=1;i<=no;i++){
            sum+=i;
        }
        System.out.println(sum);
    }
}