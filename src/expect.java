public class expect {
    public static void main(String[] args) {
        try {
            // System.out.println("a = " + 10 / 0);
            throw new ArrayIndexOutOfBoundsException(" A Hari 2 gupta B");

        } catch (Exception e) {
            System.out.println(e);
        } finally {
            System.out.println("okay");
        }
    }
}
