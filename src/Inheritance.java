class A {
    void display() {
        System.out.println("Class A");
    }
}

class B extends A { // Single Inheritance
    void abc() {
        System.out.println("Class B");
    }
}

class D extends A{ //Hierachical Inheritance
    void aha() {
        System.out.println("Class D");
    }
}

class C extends B{ //Multilevel Inheritance
    void aa(){
        System.out.println("Class C");
    }
}
public class Inheritance {
    public static void main(String[] args) {
        A a = new A();        
        B b = new B();
        C c = new C();
        D d = new D();
        
        a.display();
        b.display();
        c.display();
        d.display();
        
    }
}
