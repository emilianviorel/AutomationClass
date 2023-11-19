package moduleA2.exercise;

public class ExOptPrintInJava {
    public static void main(String[] args) {
        //Ex1
        String language = "Java.";
        String text1 = "Is easy to learn ";
        System.out.println(text1 + language);

        //Ex2
        language = "Python.";
        System.out.println(text1 + language);

        //Ex3
        language = "any programming language ";
        System.out.println(text1 + language);

        //Ex4
        String text2 = "As long as you make the effort ";
        System.out.println(text1 + language + text2.toLowerCase());

        //Ex5
        System.out.println(text2 + language + text1.toLowerCase());
    }
}