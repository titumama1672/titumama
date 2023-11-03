public class HelloReturn1 {
    static String msg = "";

    HelloReturn1() {
        msg = "Hello World";
    }

    HelloReturn1(String str) {
        System.out.println("In overload constructor: " + str);
    }

    void HelloReturn1() {
        System.out.println("In Hello");
    }

    void HelloReturn1(String str2) {
        System.out.println("Hello: " + str2);
    }

    public static void main(String[] args) {
        new HelloReturn1();
        new HelloReturn1("Overloaded");

        HelloReturn1 h1 = new HelloReturn1();
        h1.HelloReturn1();
        h1.HelloReturn1("Students");

        System.out.println("Message is : " + msg);
    }
}
