public class Algorithm {
    public static void main(String[] args) {
        //Exercise 1
        /*
        Declare a string of integers (eg 1, -25, 34, -2, 67, 5).
        Write a program to display only the neighbors of the numbers in the string
        (e.g. instead of 1 display 0 and 2; instead of -25 display -26 and -24; etc.)
         */
        System.out.println("---Exercise 1---");

        int[] numbers = {1, -25, 34, -2, 67, 5};
        for (int i = 0; i < numbers.length; i++) {
            System.out.println((numbers[i] - 1) + " " + (numbers[i] + 1));
        }
        //Exercise 2
        /*
        Write a program to display only negative numbers from the given string
         */
        System.out.println("---Exercise 2---");

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] < 0) {
                System.out.println(numbers[i]);
            }
        }

        //Exercise 3
        /*
        Declare an 8-element country string (e.g. England, Romania, Albania,
        France, Switzerland, China, USA, Australia).
         */
        System.out.println("---Exercise 3---");

        String[] country = {"England", "Romania", "Albania", "France", "Switzerland", "China", "USA", "Australia"};
        for (String s : country) {
            System.out.println(s);

            //Exercise 4
        /*
        Write a program to display the initial of each country
         */
            System.out.println(s.charAt(0));

            //Exercise 5
        /*
        Write a program to display only the countries that start with the letter "A"
         */
            if (s.startsWith("A")) {
                System.out.println(s);
            }

            //Exercise 6
        /*
        Write a program to display the number of letters for each country
         */
            System.out.println(s.length());

            //Exercise 7
        /*
        Write a program to check if country contains "m"
         */
            System.out.println(s.contains("m"));
        }

        //Exercise 8 & 9
        /*
        Write a program to display the country with the longest name
        Write a program to display the country with the shortest name
         */
        System.out.println("---Exercise 8 & 9---");

        String longestName = country[0];
        String shortestName = country[0];

        for (int i = 1; i < country.length; i++) {
            longestName = (country[i].length() > longestName.length()) ? country[i] : longestName;
            shortestName = (country[i].length() < shortestName.length()) ? country[i] : shortestName;
        }
        System.out.printf("Country with the longest name is: %s%n" +
                "Country with the shortest name is: %s%n", longestName, shortestName);
    }
}