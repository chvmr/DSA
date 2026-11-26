class Main {
    public static void main(String[] args) {
        int a = 12345, b = 54321;
        int[] freq = new int[10];

        while(a > 0) {
            int dig = a % 10;
            freq[dig]++;
            a = a / 10;
        }

        while(b > 0) {
            int dig = b % 10;
            freq[dig]--;
            b = b / 10;
        }

        boolean same = true;

        for(int i = 0; i < 10; i++) {
            if(freq[i] != 0) {
                same = false;
                break;
            }
        }

        if(same)
            System.out.println("Same digits");
        else
            System.out.println("Different digits");
    }
}