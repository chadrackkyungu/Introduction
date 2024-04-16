package Topic4;

public class Finally {

    public static void main(String[] args) throws Exception {

        try {

            // the try will execute and when it's done it will finally
            int[] numbers = { 1, 2, 3 };
            System.out.println(" The number is : " + numbers[2]);

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array index is out of bounds!");
        } finally {
            System.out.println("The 'try catch' is finished.");
        }
    }
}
