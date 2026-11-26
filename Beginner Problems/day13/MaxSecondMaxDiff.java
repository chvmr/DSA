import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++){
            a[i]=s.nextInt();
        }
        int l=a[0],sl=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            if(a[i]>l){
                sl=l;
                l=a[i];
            }
            else if(a[i]>sl&&a[i]<l)
                sl=a[i];
        }
        System.out.println(l-sl);
    }
}