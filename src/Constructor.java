class P1 {
    static {
        System.out.println("P1 class");
    }
    int a;
    int b;

    P1(int a, int b) { // Constructor
        this.a = a;
        this.b = b;
    }
}

class P2 {
    static {
        System.out.println("P2 class");
    }
    int a;
    int b;

    P2(int a) {
        this.a = a;
    }

    P2(int a, int b) { // Constructor Overloading
        this.a = a;
        this.b = b;
    }

    P2(P2 p) { // Copy Constructor
        this.a = p.a;
        this.b = p.b;
    }
}

public class Constructor {
    public static void main(String[] args) {
        P1 v = new P1(1, 2);
        P2 g = new P2(1);
        P2 gv = new P2(1, 2);
        P2 gvv = new P2(gv);

    }
}
