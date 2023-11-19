package moduleA5;

public class Loops {
    public static void main(String[] args) {

        //for

        for (int i = 0; i < 5; i++) {
            System.out.println(i);
        }

        for (int i = 5; i >= 0; i--) {
            System.out.println(i);
        }

        for (int i = 0; i <= 10; i += 2) {
            System.out.println(i);
        }

        //enhance for (for each)

        String[] cars = {"BMW", "Audi", "Opel", "Tesla"};
        for (String car : cars) {
            System.out.println(car);
        }

        //while

        int i = 0;
        while (i < 5) {
            System.out.println(i);
            i++;
        }

        // do while

        int j = 0;
        do {
            System.out.println(j);
            j++;
        } while (j < 5);

        //break

        for (int k = 0; k < 10; k++) {
            if (k == 4) {
                break;
            }
            System.out.println(k);
        }

        //continue

        for (int p = 0; p < 10; p++) {
            if (p == 4) {
                continue;
            }
            System.out.println(p);
        }

        System.out.println("While continue/break");

        int o = 0;
        while (o < 10) {
            o++;
            if (o == 4) {
                continue;
            }
            System.out.println(o);
        }
    }
}