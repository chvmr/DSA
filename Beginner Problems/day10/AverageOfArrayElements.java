import java.util.*;
class AverageOfArrayElements{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt(),sum=0;
        int a[]=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
            sum+=a[i];
        }
        float avg=(float)sum/n;
       System.out.print(avg);
    }
}