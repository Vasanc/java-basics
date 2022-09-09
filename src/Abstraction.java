interface aa {
    public void display();

    public void show();

}

interface bb {
    public void dois();
}

abstract class awe {
    abstract void baa();
}

class awes extends awe{
    void baa(){
        System.out.println("abc");
    }
}
class Inter implements aa, bb {
    public void display() {
        System.out.println("method in aa interface");
    }

    public void dois() {
        System.out.println("method in bb interface");
    }

}

public class Abstraction {
    public static void main(String[] args) {
        Inter a = new Inter() {
            public void show() {
                System.out.println("hi all");
            }
        };
        a.display();
        a.dois();
        a.show();
        awes b = new awes();
        b.baa();
    }

}