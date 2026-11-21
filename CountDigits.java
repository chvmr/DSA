class CountDigits{
    public static void main(String[] args) {
       int a=123,count=0;
        while(a>0){
            count++;
            a=a/10;
        }
        System.out.println(count);
    }
}