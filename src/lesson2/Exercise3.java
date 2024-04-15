package lesson2;

public class Exercise3 {
    public static void main(String[] args) {
        int x = 9;
        int z = x++;
        System.out.println(x);
        System.out.println(z);

        int y = 21;
        int n = y--;
        System.out.println(y);
        System.out.println(n);

        boolean a = false;
        boolean b = true;
        System.out.println("\nЛогическое И:");
        System.out.println(a & a);
        System.out.println(a & b);
        System.out.println(b & a);
        System.out.println(b & b);

        System.out.println("\nЛогическое ИЛИ:");
        System.out.println(a | a);
        System.out.println(a | b);
        System.out.println(b | a);
        System.out.println(b | b);

        System.out.println("\nСравнение:");
        System.out.println(a ^ a);
        System.out.println(a ^ b);
        System.out.println(b ^ a);
        System.out.println(b ^ b);
    }
}
