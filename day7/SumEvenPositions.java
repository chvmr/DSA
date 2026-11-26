class Main {
    public static void main(String[] args) {
        int no=123456,dig=0,pos=1,sum=0;
        while(no>0){
            dig=no%10;
            if(pos%2==0){
                sum+=dig;
                pos++;
            }
            else
                pos++;
            no=no/10;
        }
        System.out.println(sum);
    }
}