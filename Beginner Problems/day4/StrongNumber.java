class StrongNumber{
    public static void main(String[] args) {
        int no=145,n=no,sum=0,dig;
        while(no>0) {
            dig=no%10;
            int fact=1;
            for(int i=1;i<=dig;i++) {
                fact=fact*i;
            }
            sum+=fact;
            no=no/10;
        }
        if(sum==n)
            System.out.println("Strong");
        else
            System.out.println("No");
    }
}