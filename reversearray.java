import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class reversearray {

    public static void main(String[] args) {
        List<String> list = new ArrayList<String>();

        list.add("Mango");   
        list.add("Banana");
        list.add("Grapes");
        list.add("Apple");

        System.out.println("Before reversing");
        System.out.println(list);

        Collections.reverse(list);
        System.out.println("After reversing");
        System.out.println(list);
    }
}
