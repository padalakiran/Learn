import java.util.ArrayList;
import java.util.Scanner;

public class StringComparison {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String a = scanner.nextLine();
        String b = scanner.nextLine();
        sol(a, b);
    }

    public static void sol(String a, String b) {
        ArrayList<Character> c = new ArrayList<>();
        ArrayList<Character> d = new ArrayList<>();

        for (char ch : a.toCharArray()) {
            c.add(ch);
        }

        for (char ch : b.toCharArray()) {
            d.add(ch);
        }

        for (char ch : d) {
            if (c.contains(ch)) {
                c.remove((Character) ch);
            } else {
                System.out.print(ch);
            }
        }
    }
}
