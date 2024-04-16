package Topic4;

public class TryCatch {

    public static void main(String[] args) throws Exception {
        try {

            int[] numbers = { 1, 2, 3 };
            System.out.println(numbers[10]);

        } catch (ArrayIndexOutOfBoundsException e) {

            System.out.println("Something went wrong.");
            System.out.println("Error: " + e);
        }
    }
}
