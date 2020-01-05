package strings;

public class Test1 {

    public static void main(String[] args) {

        System.out.println(get());
    }

    public static int get() {

        int val = 10;
        if (val > 7) {
            val = 0;
        }
        if (val > 3) {
            System.out.println(6);
        } else {
            System.out.println(7);
        }
        return 5;
    }
}







