class Main {
    public static void main(String[] args) {
        int no=58321,dig=0;
        int s=999,ss=999;
        while(no>0){
            dig=no%10;
            if(dig<s){
                ss=s;
                s=dig;
            }
            else if(dig<ss&&dig>s)
                ss=dig;
            no=no/10;
        }
        System.out.println(ss);
    }
}