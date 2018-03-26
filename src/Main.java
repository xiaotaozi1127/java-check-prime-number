public class Main {
    public static void main(String[] args) {
        prime prime = new prime();
        int result = prime.getPrimeNumCount(101, 200);
        System.out.println("total prime number Count:" + result);
    }
}