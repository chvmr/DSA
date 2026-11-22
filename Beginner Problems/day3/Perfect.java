class Perfect{
    public static void main(String[] args) {
        int no=6,num=0;
        for(int i=1;i<no;i++){
            if(no%i==0)
                num+=i;
        }
        if(no==num)
            System.out.println("Perfect");
        else
            System.out.println("No");
    }
}