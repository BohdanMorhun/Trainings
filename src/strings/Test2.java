package strings;

public class Test2 {

    public static void main(String[] args) {
        int res = mult(get(1), 12, get(5));
        System.out.println(res);
    }

    public static int get(int val) {
//        System.out.println("get(" + val + ")");
        if (val > 7) {
            val = 1;
        }
        if (val > 3) {
            System.out.println(val + 1);
        } else {
            System.out.println(val - 1);
        }
        return val * 2;
    }

    public static int mult(int a, int b, int c) {
        System.out.println(String.format("mult(%d, %d, %d)", a, b, c));
        return a * b * c;
    }
}







