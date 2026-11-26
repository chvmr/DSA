class Main {
    public static void main(String[] args) {
        int no=58321,dig=0;
        int l=0,s=999;
        while(no>0){
            dig=no%10;
            if(dig>l)
                l=dig;
            if(dig<s)
                s=dig;
            no=no/10;
        }
        System.out.println(l);
        System.out.println(s);
    }
}