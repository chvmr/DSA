import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        int s=a[0],ss=Integer.MAX_VALUE;
        for(int i=0;i<n;i++){
            if(a[i]<s){
                ss=s;
                s=a[i];
            }
            else if(a[i]<ss&&a[i]>s)
                ss=a[i];
        }
        System.out.println(s-ss);
    }
}