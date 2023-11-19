package moduleA4.exercise;

public class ExOptOperators {
    public static void main(String[] args) {
        //Exercise 1
        /*
        Declare four variables of type int: var1, var2, var 3, var4 and initialize them with values of your choice.
        Show their sum.
        Display their product.
        Display the remainder of the division between var4 and var2
        */
        System.out.println("---Exercise 1---");
        int var1 = 17, var2 = 9, var3 = 19, var4 = 88;

        int sum = var1 + var2 + var3 + var4;
        int product = var1 * var2 * var3 * var4;
        int modulo = var4 % var2;

        System.out.printf("The sum of values is equal to: %d %n"
                + "The product of values is equal to: %d %n"
                + "The modulo of var4 and var2 is equal to: %d %n", sum, product, modulo);

        //Exercise 2
        /*
        Increment var1 by one unit 3 times.
        Display var1 after the third increment.
        */
        System.out.println("---Exercise 2---");
        for (int i = 0; i < 3; i++) {
            var1++;
        }
        System.out.println("Var1 incremented 3 times by 1 unit is equal to:"
                + var1);

        //Exercise 3
        /*
        Decrement var2 by two units twice.
        Display var2 after the second decrement.
        */
        System.out.println("---Exercise 3---");

        for (int i = 0; i < 2; i++) {
            var2 -= 2;
        }
        System.out.println("Var2 decremented 2 times by 2 units is equal to:"
                + var2);

        //Exercise 4
        /*
        Declare two boolean variables cond1 and cond2
        cond1 is true if the sum of the 4 variables from Exercise 1 is greater than 100.
        cond2 is true if the product of the 4 variables from Exercise 1 is greater than 1000.
        Display cond1 and cond2
        */
        System.out.println("---Exercise 4---");

        boolean cond1 = sum > 100;
        boolean cond2 = product > 1000;

        System.out.printf("Is sum of the 4 variables higher that 100?  %b %n"
                + "Is product of the 4 variables higher than 1000? %b %n", cond1, cond2);

        //Exercise 5
        /*
        Evaluate and display if at least one of the conditions cond1 and cond2 is true.
        Evaluate and display if both conditions cond1 and cond2 are true.
        */
        System.out.println("---Exercise 5---");

        boolean atLeastOneTrue = cond1 || cond2;
        boolean bothTrue = cond1 && cond2;

        if (atLeastOneTrue) {
            System.out.printf("At least one condition is %b! %n", atLeastOneTrue);
        }
        if (bothTrue) {
            System.out.printf("Both conditions are %b! %n", bothTrue);
        } else if (!atLeastOneTrue && !bothTrue)
            System.out.println("Neither condition is true!");
    }
}

