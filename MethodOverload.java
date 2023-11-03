public class MethodOverload {
    int c = 0;
    double c1 = 0.0;

    public static void main(String[] args) {
        int a, b, d;
        double e;
        MethodOverload m1 = new MethodOverload();
        m1.add(a = 10, b = 20);
        m1.add(d = 20, e = 30.50);
    }

    void add(int a, int b) {
        c = a + b;
        System.out.println("The result is: " + c);
    }

    void add(int d, double e) {
        c1 = d + e;
        System.out.println("The result is: " + c1);
    }
}
