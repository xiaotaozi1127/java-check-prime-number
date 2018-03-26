public class prime {
    public int getPrimeNumCount(int start, int end) {
        int primeCount = 0;
        for (int i = start; i <= end; i++) {
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    break;
                }
                System.out.println("prime number: " + i);
                primeCount++;
                break;
            }
        }
        return primeCount;
    }
}