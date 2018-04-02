import java.util.ArrayList;
import java.util.List;

public class prime {
    public List<Integer> getPrimeNumber(int start, int end) {
        List<Integer> list = new ArrayList<>();
        boolean isPrime;
        for (int i = start; i <= end; i++) {
            isPrime = true;
            for (int j = 2; j <= Math.sqrt(i); j++) {
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
            }
            if(isPrime){
                list.add(i);
            }
        }
        return list;
    }
}