class Main {
    public static void main(String[] args) {
        int dig=0,no=1233214566,min=999;
        int freq[]=new int[10];
        while(no>0){
            dig=no%10;
            freq[dig]++;
            no=no/10;
        }
         for(int i=0;i<10;i++) {
            if(freq[i]>0 && freq[i]<min)
                min=freq[i];
        }
        for(int i=0;i<10;i++){
            if(freq[i]==1)
                System.out.println(i);
        }
    }
}