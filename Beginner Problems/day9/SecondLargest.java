// Online Java Compiler (Editor)
// Write and run Java online using this editor.
import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt(),i=0;
        int a[]=new int[n];
        for(i=0;i<n;i++){
            a[i]=s.nextInt();
        }
        int l=Integer.MIN_VALUE;
        int sl=Integer.MIN_VALUE;
        for(i=0;i<n;i++){
            if(a[i]>l){
               sl=l;
                l=a[i];
            }
            else if(a[i]>sl && a[i]<l){
                sl=a[i];
            }
        }
        if(sl==Integer.MIN_VALUE)
            System.out.print("No second largest");
        else
            System.out.print(sl);
    }
}