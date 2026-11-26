class Main {
    public static void main(String[] args) {
        int no=12,sum=0;
        for(int i=1;i<no;i++){
            if(no%i==0)
                sum+=i;
        }
        System.out.println(sum);
    }
}