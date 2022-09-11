

class Threads extends Thread {
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println('a');
        }
    }

    void show() {
        for (int i = 0; i < 11; i++) {
            System.out.println('b');
        }
    }

    public static void main(String[] args) {
        Threads t = new Threads();
        t.start();
        t.show();
    }
}
