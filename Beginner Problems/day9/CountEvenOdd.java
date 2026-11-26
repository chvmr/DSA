// Online Java Compiler (Editor)
// Write and run Java online using this editor.
import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt(),c=0,c1=0;
        int a[]=new int[n];
        for(int i=0;i<n;i++){
            a[i]=s.nextInt();
            if(a[i]%2==0)
                c++;
            else
                c1++;
        }
        System.out.print(c+" "+c1);
    }
}