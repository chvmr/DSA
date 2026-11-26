class Main {
    public static void main(String[] args) {
        int no = 25;
        int count = 0, temp = no;

        // Count digits
        while(temp > 0) {
            count++;
            temp = temp / 10;
        }

        // Calculate square
        int square = no * no;

        // Calculate divisor
        int divisor = (int)Math.pow(10, count);

        // Check Automorphic
        if(square % divisor == no)
            System.out.println("YES");
        else
            System.out.println("NO");
    }
}