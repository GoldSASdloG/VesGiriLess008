public class Main {
    public static void main(String[] args) {
        int a = 36;
        int b = 34;
        int c = 25;
        int d = 13;
        int e = 41;
        int max = a;
        if (b > max) max = b;
        if (c > max) max = c;
        if (d > max) max = d;
        if (e > max) max = e;
        System.out.println(max);
    }
}