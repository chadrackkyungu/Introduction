public class PrimeFinder {

    public static void main(String[] args) {
        System.out.println("Prime numbers between 1 and 100:");

        for (int num = 2; num <= 100; num++) {
            boolean isPrime = true;

            // Check divisibility for numbers from 2 to num-1
            for (int div = 2; div <= num / 2; div++) {
                if (num % div == 0) {
                    isPrime = false;
                    break;
                }
            }

            if (isPrime) {
                System.out.print(num + " ");
            }
        }
    }
}
