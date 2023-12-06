package moduleA6.exercise;

public class ExOptJavaMethods {
    public static void main(String[] args) {
        System.out.println("---Exercise 1---");
        printSnow();

        System.out.println("---Exercise 2---");
        int evenNumber = 12;
        System.out.printf("Is the number %d even ? %s%n",
                evenNumber, getEvenNumber(evenNumber));

        System.out.println("---Exercise 3---");
        String month = "December";
        System.out.printf("Which season is it? %s%n",
                getSeason(month));

        System.out.println("---Exercise 4---");
        int number1 = 12;
        int number2 = 21;
        System.out.printf("The maximum number is: %s%n",
                getMaxNumber(number1, number2));

        System.out.println("---Exercise 5---");
        int number3 = 12;
        int number4 = 21;
        int number5 = 12;
        int number6 = 21;
        System.out.printf("The maximum number is: %s%n",
                getMaxNumber(number3, number4, number5, number6));

        System.out.println("---Exercise 6---");
        String word = "presents";
        System.out.printf("The middle character(s) is/are: %s%n",
                getMiddleCharacter(word));

        System.out.println("---Exercise 7---");
        String string = "Christmas is coming !";
        System.out.printf("Number of characters: %s%n ",
                getNumberOfCharacters(string));

        System.out.println("---Exercise 8---");
        int number = 123;
        System.out.printf("Sum of digits: %s%n",
                getSumOfDigits(number));
    }

    //Exercise 1
    /*
    Write a method that receives nothing and displays the text
    "It's finally snowing!". Call the method in main().
     */
    public static void printSnow() {
        System.out.println("It's finally snowing!");
    }

    //Exercise 2
    /*
    Write a method that receives a number and returns a boolean result.
    If the number is even, it returns true, otherwise it returns false.
    Display the result returned by the method in main().
     */
    public static boolean getEvenNumber(int number) {
        return (number % 2 == 0);
    }

    //Exercise 3
    /*
    Write a method that receives a calendar month and returns the season of which it is a part.
    For March, April, May -> spring
    For June, July, August -> summer
    For September, October, November -> autumn
    For December, January, February -> winter
    For anything other than the calendar month -> unknown
    Test the method by hand with test data from all equivalence classes (ECP)
     */
    public static String getSeason(String month) {
        return switch (month) {
            case "March", "April", "May" -> "spring";
            case "June", "July", "August" -> "summer";
            case "September", "October", "November" -> "autumn";
            case "December", "January", "February" -> "winter";
            default -> "Calendar month is unknown";
        };
    }

    //Exercise 4
    /*
    Write a method that receives two numbers and returns the larger one.
    If they are equal, return any of them. Test the method.
     */

    public static double getMaxNumber(double number1, double number2) {
        return Math.max(number1, number2);
    }

    //Exercise 5
    /*
    Write a method that receives 4 numbers and returns the largest of them.
    If two or more are equal, return any of them. Test the method.
     */

    public static double getMaxNumber(double number1, double number2, double number3, double number4) {
        return Math.max(Math.max(number1, number2), Math.max(number3, number4));
    }

    //Exercise 6
    /*
    Write a method that receives a word and returns the character(s) in the middle.
    If it has an odd number of letters, return the middle letter (case -> s).
    If it has an even number of letters, return the two letters in the middle (castle -> st).
    Test the method.
     */

    public static String getMiddleCharacter(String word) {

        if (word.length() % 2 == 0) {
            int middleLetter1 = word.length() / 2 - 1;
            int middleLetter2 = word.length() / 2;
            return String.valueOf(word.charAt(middleLetter1)).concat(String.valueOf(word.charAt(middleLetter2)));
        } else {
            int middleLetter = word.length() / 2;
            return String.valueOf(word.charAt(middleLetter));
        }
    }

    //Exercise 7
    /*
    Write a method that receives a String and returns the number of characters in that String.
    Test the method.
     */
    public static int getNumberOfCharacters(String string) {
        //return string.replace(" ", "").length();
        return string.length();

    }

    //Exercise 8
    /*
    Write a method that receives a number and returns the sum of its digits.
    Test the method.
     */

    // Method to calculate the sum of digits
    public static int getSumOfDigits(int number) {
        int sum = 0;

        // Iterate through each digit in the number
        while (number != 0) {
            // Extract the last digit
            int digit = number % 10;

            // Add the digit to the sum
            sum += digit;

            // Remove the last digit from the number
            number /= 10;
        }
        return sum;
    }
}

