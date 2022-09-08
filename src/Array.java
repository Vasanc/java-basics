import java.util.Scanner;

public class Array {

    static void display(int a[]) {
        for (int i : a) {
            System.out.println(i);
        }
    }

    static int[] get() {
        return new int[] { 1, 2, 34, 5 };
    }

    public static void main(String[] args) {

        int arr[] = new int[3];
        // int arr[] = { 1, 2, 3, 4, 5, 6 };

        arr[1] = 200;
        arr[0] = 100;
        arr[2] = 300;

        // for-each loop
        for (int i : arr) {
            System.out.println(i);
        }

        // finding class name
        int a[] = { 1, 2, 3, 4, 5 };
        Class c = a.getClass();
        String str = c.getName();
        System.out.println(str);

        // passing array to function
        display(a);

        // passing anonymous
        display(new int[] { 4, 3, 2, 1 });

        // getting anonymous array from a method
        int vv[] = get();
        System.out.println();
        System.out.println(vv[0]);

        // multi-dimensional array
        int dd[][] = new int[3][3];
        Scanner s = new Scanner(System.in);
        // getting
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                dd[i][j] = s.nextInt();
            }
        }

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(dd[i][j]);
            }
            System.out.println();
        }
    }
}
