import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int a[]=new int[n];
        int p=0;
        boolean found=false;
        for(int i=0;i<n;i++){
            a[i]=s.nextInt();
        }
        int k=s.nextInt();
        for(int i=0;i<n;i++){
            if(a[i]==k){
                found=true;
                p=i;
                break;
            }
        }
        if(found)
            System.out.print(p);
        else
            System.out.print("Not found");
    }
}