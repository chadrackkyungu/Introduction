public class FractionReducer {

    public static void main(String[] args) {
        int[] fraction = { 8, 20 }; // Example fraction
        if (reduce(fraction)) {
            System.out.println("Reduced fraction: " + fraction[0] + "/" + fraction[1]);
        } else {
            System.out.println("Invalid input. Both numbers must be positive.");
        }
    }

    public static boolean reduce(int[] fraction) {
        int numerator = fraction[0];
        int denominator = fraction[1];

        // Check if either the numerator or denominator is zero or negative
        if (numerator <= 0 || denominator <= 0) {
            return false;
        }

        // Calculate the GCD of the numerator and denominator
        int gcd = gcd(numerator, denominator);

        // Reduce the fraction
        fraction[0] /= gcd;
        fraction[1] /= gcd;

        return true;
    }

    private static int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}
