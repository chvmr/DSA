class Main {
    public static void main(String[] args) {
        int no=12234522,dig=0,count=0,search=2;
        while(no>0){
            dig=no%10;
            if(dig==search)
                count++;
            no=no/10;
        }
        System.out.println(count);
    }
}