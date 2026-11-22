class ProductOfDigits{
    public static void main(String[] args) {
        int no=1234,dig=0,num=1;
        while(no>0){
            dig=no%10;
            num=dig*num;
            no=no/10;
        }
        System.out.println(num);
    }
}