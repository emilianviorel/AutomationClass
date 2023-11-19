package moduleA6.exercise;

public class ExJavaMethods {
    public static void main(String[] args) {
        System.out.println("---Exercise 1---");

        System.out.printf("Inverse number is: %d%n%n",
                returnInverseNumber(69));

        System.out.println("---Exercise 2---");

        System.out.printf("Maximum number is: %d%n%n",
                returnMaxNumber(30, 90));

        System.out.println("---Exercise 3---");

        System.out.printf("Average is: %.2f%n%n",
                returnAverage(3, 2, 10));

        System.out.println("---Exercise 4---");

        System.out.printf("Length of the word is: %d%n%n",
                returnLength("Apple"));

        System.out.println("---Exercise 5---");

        System.out.printf("Concatenated words is: %s%n%n",
                returnConcatenate("Word1", "Word2"));

        System.out.println("---Exercise 6---");

        System.out.printf("Reverse word is: %s%n%n",
                returnInversString("emilian"));
    }

    //Exercise 1
        /*
        Write a method that receives an integer and returns its inverse
        (e.g. the inverse of "4" is "-4", the inverse of "-35" is "35")
         */
    public static int returnInverseNumber(int number) {
        if (number > 0) {
            number = Math.negateExact(number);
        } else number = Math.abs(number);
        return number;
    }

    //Exercise 2
        /*
        Write a method that receives two integers and returns the maximum between them
         */
    public static int returnMaxNumber(int number1, int number2) {
        return Math.max(number1, number2);
        /*
        int maxNumber;
        if (number1 < number2) {
            maxNumber = number2;
        } else maxNumber = number1;
        return maxNumber;
         */
    }

    //Exercise 3
        /*
        Write a method that receives 3 integers and returns their arithmetic mean (with commas)
         */
    public static double returnAverage(int number1, int number2, int number3) {
        return (double) ((number1 + number2 + number3)) / 3;
    }

    //Exercise 4
        /*
        Write a method that receives a String and returns its length
         */
    public static int returnLength(String word) {
        return word.length();
    }

    //Exercise 5
        /*
        Write a method that receives two Strings and concatenates them.
         */
    public static String returnConcatenate(String word1, String word2) {
        return word1.concat(word2);
    }

    //Exercise 6
        /*
        (Optional) Write a method that receives a String and returns its inverse (Ex. "abcd"->"dcba")
         */
    public static String returnInversString(String normalText) {

        char[] stringToCharArray = normalText.toCharArray();

        for (int left = 0, right = stringToCharArray.length - 1; left < right; left++, right--) {
            char tempLocation = stringToCharArray[left];
            stringToCharArray[left] = stringToCharArray[right];
            stringToCharArray[right] = tempLocation;
        }
        return new String(stringToCharArray);

         /*
        int left = 0;
        int right = stringToCharArray.length - 1;

        while (left < right) {
            char tempLocation = stringToCharArray[left];
            stringToCharArray[left] = stringToCharArray[right];
            stringToCharArray[right] = tempLocation;
            left++;
            right--;
        }
        return new String(stringToCharArray);
        */

        //return normalText.transform(s -> new StringBuilder(s).reverse().toString());
    }
}

