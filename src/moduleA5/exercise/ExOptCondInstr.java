package moduleA5.exercise;

public class ExOptCondInstr {
    public static void main(String[] args) {
        //Exercise 1
        /*
        Declare a variable of type int,with the name "temperature" and give it a value of your choice.
        If its value is lower than 18, display "too cold".
        If the value is between 18 and 22, display "ok".If the value is above 22, display "too hot".
        */
        System.out.println("---Exercise 1---");

        int temperature = 18;

        if (temperature < 18) {
            System.out.println("Is too cold!");
        } else if (temperature >= 18 && temperature <= 22) {
            System.out.println("Is comfy.");
        } else System.out.println("Is too hot!");

        //Exercise 2
        /*
        Two variables are given:
        char gender (gen) – initialize with a value of your choice (possible values "m" or "f")
        boolean married - initialize with a value of your choice
        Write a program using conditional statements, so that:
            - for gender "m", to display "Mr", regardless of whether the person is married or not
            - for gender "f" to display "Miss", if she is not married or "Mrs", if she is married
         */
        System.out.println("---Exercise 2---");

        char gender = 'm';
        boolean married = false;

        if (gender == 'm') {
            System.out.println("Mr.");
        } else if (gender == 'f' && married == false) {
            System.out.println("Miss.");
        } else System.out.println("Mrs.");

        //Exercise 3
        /*
        Declare and initialize two variables of type int.
        Write a program that displays the variable with the larger value of the two: "[x] is
        greater than [y]", where x and y are the values of the variables.
        If the two are equal, the program must display "are equal".
         */
        System.out.println("---Exercise 3---");

        int x = 70;
        int y = 100;

        if (x < y) {
            System.out.printf("Number %d is greater than number %d. %n", y, x);
        } else if (x > y) {
            System.out.printf("Number %d is greater than number %d. %n", x, y);
        } else System.out.println("Numbers are equal");

        //Exercise 4
        /*
        Declare a third variable.
        Write a program to display the variable with the highest value among the 3.
         */
        System.out.println("---Exercise 4---");

        int z = 50;
        int highestValue;

        if (x >= y && x >= z) {
            highestValue = x;
        } else if (y >= x && y >= z) {
            highestValue = y;
        } else highestValue = z;
        System.out.printf("Highest value is %d %n", highestValue);

        //Exercise 5
        /*
        Declare a char type variable with the name letter and give it a value of your choice.
        If the value is a consonant, display “[letter] is a consonant”, if it is a vowel, display "[letter]
        is vowel", where letter is the value of the variable.
         */
        System.out.println("---Exercise 5---");

        char letter = 'a';

        switch (letter) {
            case 'a', 'e', 'i', 'o', 'u':
                System.out.printf("%s is a vowel! %n", letter);
                break;
            default:
                System.out.printf("%s is a consonant! %n", letter);
        }

        System.out.println("---Exercise 5-IF--");

        if (letter == 'a' || letter == 'e' || letter == 'i' || letter == 'o' || letter == 'u') {
            System.out.printf("%s is a vowel! %n", letter);
        } else System.out.printf("%s is a consonant! %n", letter);
    }
}