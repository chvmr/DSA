class Main {
    public static void main(String[] args) {
        int a=12,b=18;
        int x=a,y=b;
        while(b!=0) {
            int temp=b;
            b=a%b;
            a=temp;
        }
        int lcm=(x*y)/a;
        System.out.println(lcm);
    }
}