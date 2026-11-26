class Main {
    public static void main(String[] args) {
        int no=58321,dig=0;
        int l=0,sl=0;
        while(no>0){
            dig=no%10;
            if(dig>l){
                sl=l;
                l=dig;
            }
            else if(dig>sl&&dig<l)
                sl=dig;
            no=no/10;
        }
        System.out.println(sl);
    }
}