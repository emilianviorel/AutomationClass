package moduleA5;

public class Conditionals {
    public static void main(String[] args) {

        //if
        if (5 > 0) {
            System.out.println("5 is grater than 0.");
        } else System.out.println("5 is not smaller than 0");
        {
            System.out.println("another statement");
        }

        //if else if
        int time = 25;
        if (time < 10) {
            System.out.println("Good morning!");
        } else if (time < 18) {
            System.out.println("Good day!");
        } else if (time < 24) {
            System.out.println("Good evening!");
        } else System.out.println("Only 24 in a day !!");


        //switch
        int day = 15;
        switch (day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Unknown");
        }
    }
}
