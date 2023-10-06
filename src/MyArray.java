public class MyArray {
    public static void main(String[] args) {

        int[] myArray = {1, 2, 3, 4};
        String[] myStringArray = {"one", "two", "three"};

        System.out.println(myArray[3]);
        // System.out.println(myArray[4]); error example because index out of bounds

        System.out.println(myStringArray[0]);
        System.out.println(myStringArray[1]);
        System.out.println(myStringArray[2]);

        for (int i = 0; i < myStringArray.length; i++) {
            System.out.println(myStringArray[i]);
        }

        //for each string
        for (String s : myStringArray) {
            System.out.println(s);
        }

        //Exercise 4 - Array

        double[] myDouble = {06.03, 19.99, 17.09, 19.88};

        //a
        System.out.println(myDouble[1]);

        //b
        System.out.println(myDouble[3]);

        //c
        System.out.println(myDouble.length);

        /*
        for (double i=0; i<myDouble.length; i++) {
            System.out.println(myDouble[(int) i]);
        */

        for (int i = 0; i < myDouble.length; i++) {
            System.out.println(myDouble[i]);
        }
    }
}