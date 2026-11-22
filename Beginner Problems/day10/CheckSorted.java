// Online Java Compiler (Editor)
// Write and run Java online using this editor.
import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        boolean found=true;
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        for(int i=0;i<n-1;i++){
            if(a[i]>a[i+1]){
                found=false;
                break;
            }
        }
        if(found)
            System.out.print("Sorted");
        else
            System.out.println("Not sorted");
    }
}