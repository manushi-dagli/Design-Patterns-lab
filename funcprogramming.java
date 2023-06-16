@FunctionalInterface
interface Arithmetic {

    public int add(int a, int b);
}

public class funcprogramming {
    public static void main(String[] args) {
        int y = 1, z = 2;
        Arithmetic x = (int a, int b) -> {
            return a + b;
        };
        int ans = a.add(y, z);
        System.out.println(ans);
    }

}