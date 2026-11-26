class Main {
    public static void main(String[] args) {
        int no=12,sum=0,num=no,dig=0;
        while(no>0){
            dig=no%10;
            sum+=dig;
            no=no/10;
        }
        if(num%sum==0)
            System.out.println("YES");
        else
            System.out.println("NO");
    }
}