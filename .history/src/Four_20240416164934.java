public class Four {

    // * ******ERRORS HANDLING ( Try-catch, Finally Block, Throws Keyword)*** */
    public static void main(String[] args) throws Exception {

        // * ***************Try-Catch*************** */
        /*
         * try {
         * 
         * int[] numbers = { 1, 2, 3 };
         * System.out.println(numbers[10]);
         * 
         * } catch (ArrayIndexOutOfBoundsException e) {
         * 
         * System.out.println("Something went wrong.");
         * System.out.println("Error: " + e);
         * 
         * }
         */

        // *********** Finally Block**********
        try {

            int[] numbers = { 1, 2, 3 };
            System.out.println(numbers[2]);

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array index is out of bounds!");
        }
    }
}
