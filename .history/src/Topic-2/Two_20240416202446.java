public class Two {

    // * *************DATA TYPES AND VARIABLES************* */

    public static void main(String[] args) throws Exception {

        // * ************ EXAMPLE 1: Basic Syntax************ */
        /*
         * String firstName = "John";
         * String lastName = "Doe";
         * int age = 15;
         * 
         * System.out.println("My full name is : " + firstName + " " + lastName +
         * " and age is : " + age);
         */

        // * ********EXAMPLE TWO DATA TYPES & OPERATORS ******** */
        /*
         * int a = 10, b = 20;
         * double pi = 3.14159;
         * boolean compare = a < b;
         * char initials = 's';
         * 
         * // arithmetic operator
         * int sum = a + b;
         * 
         * System.out.println(" Sum of a and b is :  " + sum);
         * System.out.println("Value of pi : " + pi);
         * System.out.println("Comparison of a and b is : " + compare);
         * System.out.println(" Initial of S is : " + initials);
         */

        // * ***********EXAMPLE 3 CONDITIONAL STATEMENT*********** */
        /*
         * int testScore = 20;
         * char grade;
         * 
         * if (testScore >= 90) {
         * grade = 'A';
         * } else if (testScore >= 80) {
         * grade = 'B';
         * } else if (testScore >= 70) {
         * grade = 'C';
         * } else if (testScore >= 60) {
         * grade = 'D';
         * } else {
         * grade = 'F';
         * }
         * 
         * System.out.println("Grade: " + grade);
         */

        // * **********Primitive Types Example Code********** */
        /*
         * boolean isJavaFun = true;
         * byte maxByte = 127;
         * short maxShort = 32767;
         * int maxInt = 2147483647;
         * long maxLong = 9223372036854775807L;
         * float maxFloat = 3.4028235E38f;
         * double maxDouble = 1.7976931348623157E308;
         * char letterB = 'B';
         * 
         * System.out.println("Boolean value: " + isJavaFun);
         * System.out.println("Byte value: " + maxByte);
         * System.out.println("Short value: " + maxShort);
         * System.out.println("Int value: " + maxInt);
         * System.out.println("Long value: " + maxLong);
         * System.out.println("Float value: " + maxFloat);
         * System.out.println("Double value: " + maxDouble);
         * System.out.println("Char value: " + letterB);
         */

        // ****************Non-Primitive Types Example Code****************

        String greeting = " Hello John";

        // * arrays
        int[] array = new int[10];
        array[0] = 100;
        array[1] = 200;

        System.out.println(greeting);
        System.out.println("First element of array: " + array[0]);
        System.out.println("Second element of array: " + array[1]);

        Bicycle myBike = new Bicycle(20, 0, 5);
        System.out.println("Gear of my bike is : " + myBike.getGear());
        System.out.println("Speed of my bike is : " + myBike.getSpeed());

    }
}

class Bicycle {
    private int speed;
    private int cadence;
    private int gear;

    public Bicycle(int startSpeed, int startCadence, int startGear) {
        gear = startGear;
        cadence = startCadence;
        speed = startSpeed;
    }

    public void setCadence(int newValue) {
        cadence = newValue;
    }

    public void setGear(int newValue) {
        gear = newValue;
    }

    public void speedUp(int increment) {
        speed += increment;
    }

    public void applyBrakes(int decrement) {
        speed -= decrement;
    }

    public int getSpeed() {
        return speed;
    }

    public int getGear() {
        return gear;
    }
}
