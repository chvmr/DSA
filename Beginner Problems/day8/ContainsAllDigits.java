class Main {
    public static void main(String[] args) {

        int no = 1234567890, dig = 0;
        int freq[] = new int[10];

        while(no > 0) {
            dig = no % 10;
            freq[dig]++;
            no = no / 10;
        }

        int flag = 1;

        for(int i = 0; i < 10; i++) {
            if(freq[i] == 0) {
                flag = 0;
                break;
            }
        }

        if(flag == 1)
            System.out.println("All digits present");
        else
            System.out.println("Not all digits present");
    }
}