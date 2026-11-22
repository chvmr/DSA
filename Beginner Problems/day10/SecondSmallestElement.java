import java.util.*;
class SecondSmallestElement {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt(),i=0;
        int a[]=new int[n];
        for(i=0;i<n;i++){
            a[i]=s.nextInt();
        }
        int s=Integer.MAX_VALUE;
        int ss=Integer.MAX_VALUE;
        for(i=0;i<n;i++){
            if(a[i]<s){
               ss=s;
                s=a[i];
            }
            else if(a[i]<ss && a[i]!=s){
                ss=a[i];
            }
        }
        if(ss==Integer.MAX_VALUE)
            System.out.print("No second smallest");
        else
            System.out.print(ss);
    }
}