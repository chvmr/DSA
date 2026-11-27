import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        int c1=0,c2=0;
        for(int i=0;i<n;i++){
            if((i+1)%2!=0)
                c1+=a[i];
            if((i+1)%2==0)
                c2+=a[i];
        }
        System.out.println(Math.abs(c1-c2));
    }
}