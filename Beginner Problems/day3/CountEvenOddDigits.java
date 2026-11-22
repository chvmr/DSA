class CountEvenOddDigits{
    public static void main(String[] args) {
        int no=123456,even=0,dig=0,odd=0;
        while(no>0){
            dig=no%10;
            if(dig%2==0)
                even++;
            else
                odd++;
            no=no/10;
        }
        System.out.println(even);
        System.out.println(odd);
    }
}