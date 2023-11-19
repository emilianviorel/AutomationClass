package moduleA3;

public class MyString {
    public static void main(String[] args) {

        //Input non-primitive data
        String myString = "This is a text";
        int length = myString.length();

        String myName = "Emilian Viorel";
        int lengthMyName = myName.length();

        String myNameWithoutSpace = myName.replace(" ", "");
        int lengthMyNameWithoutSpace = myNameWithoutSpace.length();

        char fourLetter = myName.charAt(4);
        char firstLetter = myName.charAt(0);

        //Output
        System.out.println(myString);
        System.out.println("Text length is " + length);
        System.out.println("\"" + myName + "\" complete name length is " + lengthMyName);

        //Print length on new line
        System.out.println("\"" + myName + "\" complete name length is " + "\n" + lengthMyName);

        System.out.println(myNameWithoutSpace);
        System.out.println(lengthMyNameWithoutSpace);

        System.out.println(fourLetter);
        System.out.println(firstLetter);

        //Exercise 3 String

        String myCountry = "Spania";
        int lengthCountry = myCountry.length();
        System.out.println(lengthCountry);
    }
}