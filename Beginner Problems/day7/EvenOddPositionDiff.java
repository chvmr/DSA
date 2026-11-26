// Online Java Compiler (Editor)
// Write and run Java online using this editor.

class Main {
    public static void main(String[] args) {
        int no=123456,dig=0,pos=1,sum=0,s=0,num=no,diff=0;
        while(no>0){
            dig=no%10;
            if(pos%2==0){
                sum+=dig;
                pos++;
            }
            else{
                s+=dig;
                pos++;
            }
            no=no/10;
        }
        diff=Math.abs(sum-s);
        System.out.println(diff);
    }
}