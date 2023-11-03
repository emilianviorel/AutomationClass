public class Algorithm {
    public static void main(String[] args) {

        int[] numbers = {1, -25, 34, -2, 67, 5};
        for (int i = 0; i < numbers.length; i++) {
            System.out.println((numbers[i] - 1) + " " + (numbers[i] + 1));
        }

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] < 0) {
                System.out.println(numbers[i]);
            }
        }

        String[] country = {"Anglia", "Romania", "Albania", "Franta"};
        for (String s : country) {
            System.out.println(s);
            System.out.println(s.charAt(0));
            System.out.println(s.length());
            System.out.println(s.contains("m"));
        }
    }
}