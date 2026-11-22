import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        int l=a[0],s=a[0];
        for(int i=0;i<n;i++){
            if(a[i]>l)
                l=a[i];
            if(a[i]<s)
                s=a[i];
        }
        int diff=l-s;
        System.out.print(diff);
    }
}