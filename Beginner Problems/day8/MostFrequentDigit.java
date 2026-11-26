// Online Java Compiler (Editor)
// Write and run Java online using this editor.

class Main {
    public static void main(String[] args) {
        int dig=0,no=1233214566;
        int freq[]=new int[10];
        while(no>0){
            dig=no%10;
            freq[dig]++;
            no=no/10;
        }
        int max=0;
        for(int i=0;i<10;i++){
            if(freq[i]>max)
                max=freq[i];
        }
        for(int i=0;i<10;i++){
            if(freq[i]==max)
                System.out.println(i+" occurs "+max+" times");
        }
    }
}