public class Control {
    public static void main(String[] args) {

        // conditional statement
        int age = 2;
        if (age < 18) {
            System.out.println("under age");
        } else if (age > 60) {
            System.out.println("over age");
        } else {
            System.out.println("correct age");
        }

        // Switch case

        switch (age) {
            case 18:// case value cannot be float
                System.out.println("Age is 18");
                break;

            case 20:
                System.out.println("Age is 20");
                break;

            default:
                System.out.println("Age is " + age);
                break;

        }
        // loops

        // for
        for (int i = 0; i < 10; i++) {
            if (i == 4) {
                continue;// skips one iteration
            }
            System.out.print('a');
        }

        // while
        int i = 0;
        while (i < 15) {
            if (i == 7)
                break;
            System.out.print(i);
            i++;

        }

        // do while
        int ii = 0;
        do {
            System.out.print('\n');
            System.out.println(ii);
        } while (ii > 0);

    }
}
