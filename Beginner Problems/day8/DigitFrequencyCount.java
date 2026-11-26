class Main {
    public static void main(String[] args) {
        int no = 12234522;
        int[] freq = new int[10];

        while(no > 0) {
            int dig = no % 10;
            freq[dig]++;
            no = no / 10;
        }

        for(int i = 0; i < 10; i++) {
            if(freq[i] > 0) {
                System.out.println(i + " -> " + freq[i]);
            }
        }
    }
}