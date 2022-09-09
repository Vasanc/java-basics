class Poly {
    void display() {
        System.out.println("Display in Parent class");
    }
}

class Poly2 extends Poly {
    void display() {
        System.out.println("Display in Child class");
    }
}

public class Polymorphism {
    // Method Over loading
    void print() {
        System.out.println("No params");
    }

    void print(int a) {
        System.out.println(a);
    }

    public static void main(String[] args) {
        Polymorphism P = new Polymorphism();
        P.print();
        P.print(123);
        Poly2 p = new Poly2();
        p.display(); //Method overriding - function of child class works when a function is redefined
    }
}
