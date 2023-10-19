public class Exceptions {
    public static void main(String[] args) {

        //exceptions try/catch

        int[] numbers = {2, 6, 9, 10};
        try {
            System.out.println(numbers[3]);
        } catch (Exception e) {
            System.out.println("An error occurs");
        }
    }
}
