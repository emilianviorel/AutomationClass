package moduleA5.exercise;

public class ExCondLoops {
    public static void main(String[] args) {
        //Exercise 1
        /*
        Write a program to display all integers from 0 to 10 (inclusive).
         */
        System.out.println("---Exercise 1---");

        for (int i = 0; i <= 10; i++) {
            System.out.println(i);
        }

        //Exercise 2
        /*
        Write a program to display the integers from 20 to 10 (inclusive) in descending order.
         */
        System.out.println("---Exercise 2---");

        for (int i = 20; i >= 10; i--) {
            System.out.println(i);
        }

        //Exercise 3
        /*
        Write a program to display all positive even numbers up to and including 100
         */
        System.out.println("---Exercise 3---");

        for (int i = 0; i <= 100; i += 2) {
            System.out.println(i);
        }

        //Exercise 4
        System.out.println("---Exercise 4---");

        String[] fruits = {" apple", " strawberry", " banana", " pere"};

        for (int i = 0; i < fruits.length; i++) {
            System.out.println("I like to eat" + fruits[i]);
        }

        System.out.println("---Exercise 4.1---");

        for (String f : fruits) {
            System.out.println("I like to eat" + f);
        }

        //Exercise 5
        System.out.println("---Exercise 5---");

        int month = 13;

        switch (month) {
            case 1:
                System.out.println("January");
                break;
            case 2:
                System.out.println("February");
                break;
            case 3:
                System.out.println("March");
                break;
            case 4:
                System.out.println("April");
                break;
            case 5:
                System.out.println("May");
                break;
            case 6:
                System.out.println("June");
                break;
            case 7:
                System.out.println("July");
                break;
            case 8:
                System.out.println("August");
                break;
            case 9:
                System.out.println("September");
                break;
            case 10:
                System.out.println("October");
                break;
            case 11:
                System.out.println("November");
                break;
            case 12:
                System.out.println("December");
                break;
            default:
                System.out.println("A year have only 12 month!");
        }
    }
}