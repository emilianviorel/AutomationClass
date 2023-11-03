public class JavaMethods {
    public static void main(String[] args) {
        printHello();
        weLearn();
        helloName("Emilian");
        getSum(2, 3);
        getProduct(10, 10);
        getSum(2, 3, 4);
        getSum(2.3, 3.5);
        helloNameAge("Emilian", 35);
        printFriends("Emilian", "Viorel");
    }

    private static void printHello() {
        System.out.println("Hello World");
    }

    private static void weLearn() {
        System.out.println("We learn about java methods");
    }

    private static void helloName(String name) {
        System.out.printf("Hello %s %n", name);
    }

    private static void helloNameAge(String name, int age) {
        System.out.printf("%s is %d years old %n", name, age);
    }

    private static void getSum(int x, int y) {
        System.out.println(x + y);
    }

    private static void getSum(int x, int y, int z) {
        System.out.println(x + y + z);
    }

    private static void getSum(double x, double y) {
        System.out.println(x + y);
    }

    private static void getProduct(int x, int y) {
        System.out.println(x * y);
    }

    private static void printFriends(String name1, String name2) {
        System.out.printf("Hello %s %s", name1, name2);
    }
}