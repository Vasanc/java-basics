public class Function {
    // with argument and with return type
    int add(int a, int b) {
        return a + b;
    }

    //with argument without return type
    void sub(int a, int b){
        System.out.println(a-b);
    }
    
    //without argument with return type
    int res(){
        return 10;
    }

    //without argument without return type
    void result(){
        System.out.println("psvm");
    }
    public static void main(String[] args) {
        Function a = new Function();
        int c = a.add(10, 20);
        System.out.println(c);
        a.sub(20, 20);
        System.out.println(a.res());
        a.result();
    }
}
