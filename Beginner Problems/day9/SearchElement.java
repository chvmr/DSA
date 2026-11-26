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
        int k=s.nextInt();
        for(i=0;i<n;i++){
            if(a[i]==k){
                System.out.print("Found");
                break;
            }
        }
        if(i==n)
            System.out.print("Not found");
    }
}