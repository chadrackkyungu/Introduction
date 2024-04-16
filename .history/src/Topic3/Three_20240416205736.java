package Topic3;

public class Three {
    // * *******CONTROL STRUCTURES (Conditional Statement & Loops)********* */
    public static void main(String[] args) throws Exception {
        /*
         * // *********Basic Example: Simple if Statement*********
         * int number = 10;
         * 
         * if (number > 0) {
         * System.out.println(" The Number is positive ");
         * }
         */

        // ******Medium Example: if-else and else if Statement******
        /*
         * int number = 0;
         * 
         * if (number > 0) {
         * System.out.println(" The Number is positive ");
         * } else if (number < 0) {
         * System.out.println(" The Number is negative ");
         * } else {
         * System.out.println(" The Number is zero ");
         * }
         */

        // **********Complex Example: Nested if Statement**********
        /*
         * int number = 10;
         * int anotherNumber = 20;
         * 
         * if (number > 0) {
         * if (anotherNumber > 0) {
         * System.out.println("Both numbers are positive");
         * } else {
         * System.out.println("Only one number is positive");
         * }
         * } else {
         * System.out.println("The first number is positive");
         * }
         */

        // ***********************Loops***********************
        /*
         * for (int i = 1; 1 <= 5; i++) {
         * System.out.println("Value of i :" + i);
         * }
         */

        // ***********************While Loop***********************

        /*
         * int i = 1;
         * while (i <= 5) {
         * System.out.println("Value of i :" + i);
         * }
         */

        // ***********************Nested Loop***********************
        /*
         * for (int i = 1; i <= 5; i++) {
         * for (int j = 1; j <= i; j++) {
         * System.out.print("*");
         * }
         * System.out.println();
         * }
         */

        // ***************switch Statement Example***************

        int day = 1;
        String dayString;

        switch (day) {
            case 1:
                dayString = "Monday";
                break;
            case 2:
                dayString = "Tuesday";
                break;
            case 3:
                dayString = "Wednesday";
                break;
            case 4:
                dayString = "Thursday";
                break;
            case 5:
                dayString = "Friday";
                break;
            case 6:
                dayString = "Saturday";
                break;
            case 7:
                dayString = "Sunday";
                break;
            default:
                dayString = "Invalid day";
                break;
        }

        System.out.println("Day of the week: " + dayString);

    }
}
