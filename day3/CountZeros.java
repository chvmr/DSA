class CountZeros{
    public static void main(String[] args) {
        int no=10203040,count=0,dig=0;
        while(no>0){
            dig=no%10;
            if(dig==0)
                count++;
            no=no/10;
        }
        System.out.println(count);
    }
}