public class App {
    int roll_no = 10;//need to create object to access this var
    static String name = "b";//doesn't need object to access static var
    public static void main(String[] args) {
        int aa = 0; //must initialize local variable

        System.out.println("Hello World!");
        App a = new App();

        System.out.println(aa);

        System.out.println(a.roll_no);
        System.out.println(name);
        //System.out.println(a.name);
    }
}


