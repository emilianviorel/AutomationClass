public class Operators {
    public static void main(String[] args) {

        int sum1 = 100 + 50;
        int sum2 = sum1 + 50;
        int sum3 = sum1 + sum2;

        System.out.println("sum1 = " + sum1);
        System.out.println("sum2 = " + sum2);
        System.out.println("sum3 = " + sum3);

        int number1 = 100;
        int number2 = 50;
        System.out.println(number1 + number2);
        System.out.println(number1 - number2);
        System.out.println(number1 / number2);
        System.out.println(number1 * number2);
        System.out.println(number1 % number2);
        System.out.println(9 % 2);
        System.out.println(++number1);
//        System.out.println(number1++);
//        System.out.println(number1);
        System.out.println(--number2);

        int number3 = number2;
        number2 = 1;
        System.out.println(number3);
        System.out.println(number2);

//        number2 = number2 + 2;
        number2 += 4;
        number2 -= 2;
        number2 *= 2;
        System.out.println(number2);

        System.out.println(number1 > number2);
        System.out.println(number1 < number2);
        System.out.println("A" == "A");
        System.out.println("A" != "A");
        System.out.println('A' < 'B');
        System.out.println('B' < 'A');
        System.out.println(!true);

        System.out.println(number1); // 101
        System.out.println(number2); // 6
        boolean conditionForAnd = number1 > number2 && number1 > 100;
        boolean conditionForOr = number1 < number2 || number1 < 100;
        System.out.println(conditionForAnd);
        System.out.println(conditionForOr);

        if (conditionForOr) {
            System.out.println("True condition");
        } else System.out.println("False condition");
    }
}
