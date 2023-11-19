package moduleA3;

public class DataTypes {
    public static void main(String[] args) {

        //Inputs primitive data
        boolean myBoolean = true;
        char myChar = 'A';
        byte myByte = 0;
        short myShort = 32_767;
        int myInt = 2_010_000_100;
        long myLong = 10_000_000_000_000_000L;
        float myFloat = 17.10F + 10.10F;
        double myDouble = 17.09;

        int x = 5;
        double y = 7.5;

        //int sum = x+y; ex.
        double sum = x + y;

        //casting from big data to short data
        double z = 5.5;
        int w = (int) z;

        //Output
        System.out.println(myBoolean);
        System.out.println(myChar);
        System.out.println(myByte);
        System.out.println(myShort);
        System.out.println(myInt);
        System.out.println(myLong);
        System.out.println(myFloat);
        System.out.println(myDouble);
        System.out.println(x + y);
        System.out.println(z);
        System.out.println(w);

        // Exercise 3.4 data type

        int myNum = 9;
        float myFloatNum = 8.99f;
        char myLetter = 'A';
        boolean myBool = false;
        String myText = "Hello World";
        String myOtherText = "1a2b3c";

        System.out.println(myNum);
        System.out.println(myFloatNum);
        System.out.println(myLetter);
        System.out.println(myBool);
        System.out.println(myText);
        System.out.println(myOtherText);

        // Casting

        byte myByte1 = 127;
        int myInt1 = myByte1;

        float myFloat1 = 17.06f;
        int myInt2 = (int) myFloat1;

        System.out.println(myInt1);
        System.out.println(myInt2);
    }
}