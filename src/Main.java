import java.util.List;

public class Main {
    public static void main(String[] args) {
        prime prime = new prime();
        List<Integer> result = prime.getPrimeNumber(101, 200);
        for(Integer i: result){
            System.out.println("Prime number is: " + i);
        }
        System.out.println("total prime number Count:" + result.size());
    }
}