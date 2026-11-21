import java.util.*;
class Prime{
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int a=s.nextInt();
        int c=0;
        for(int i=1;i<=a;i++){
            if(a%i==0)
                c++;
        }
        if(c==2)
            System.out.println("Yes");
        else
            System.out.println("No");
    }
}

//optimized prime-checking logic
/*import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int a=s.nextInt();
        int c=0;
        for(int i=1;i<=Math.sqrt(a);i++){
            if(a%i==0)
                c++;
        }
        if(c==1)
            System.out.println("Yes");
        else
            System.out.println("No");
    }
}*/