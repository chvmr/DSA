class Main {
    public static void main(String[] args) {
        int a=4,b=6;
        int c=Math.max(a,b);
        for(int i=c;i<=a*b;i++){
            if(i%a==0&&i%b==0){
                System.out.println(i);
                break;
            }
        }
    }
}