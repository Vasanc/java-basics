class exe {
    String name = "Vasan";

    exe() {
        System.out.println("constructor in exe");
    }

    void show() {
        System.out.println(name);
    }
}

class ex extends exe {
    String name = "Bharathi";

    ex() {
        super();//control goes to the parent class constructor
        System.out.println("constructor in ex");
    }

    void show() {
        // super - used to override the override
        super.show();// calls function in the parent class
        System.out.println(name);
        System.out.println(super.name);// calls variable in the parent class
    }
}

public class Super {
    public static void main(String[] args) {
        ex e = new ex();
        e.show();

    }
}
