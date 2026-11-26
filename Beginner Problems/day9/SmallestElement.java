// Online Java Compiler (Editor)
// Write and run Java online using this editor.
import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt(),min=9999;
        int a[]=new int[n];
        for(int i=0;i<n;i++){
            a[i]=s.nextInt();
            if(a[i]<min)
                min=a[i];
        }
        System.out.print(min);
    }
}