class Armstrong{
    public static void main(String[] args) {
        int no=370,dig=0,n=no,num=0,count=0,nums=no;
        while(nums>0){
            count++;
            nums=nums/10;
        }
        while(no>0){
            dig=no%10;
            num+=Math.pow(dig, count);
            no=no/10;
        }
        if(n==num)
            System.out.println("Armstrong");
        else
            System.out.println("No");
    }
}