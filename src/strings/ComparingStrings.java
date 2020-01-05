package strings;

public class ComparingStrings {
    public static void main(String[] args) {
        System.out.println("a".compareTo("a"));
        System.out.println("a".compareTo("b"));
        System.out.println("b".compareTo("a"));

        System.out.println("a".compareTo("aaaaaa"));
        System.out.println("aaaA".compareTo("aaaB"));
    }
}
