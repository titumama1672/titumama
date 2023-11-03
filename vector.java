import java.util.Vector; 

public class vector {
    public static void main(String[] args) {
        Vector<Object> v1 = new Vector<>();
        Vector<Object> v2 = new Vector<>();
        Vector<String> v3 = new Vector<>();

        try {
            v1.add("box");
            v1.add(60);
            v1.add(90);

            v2.add("pencil box");
            v2.add(70);
            v2.add(7.0);

            v1.add("mango");
            v1.add("cherry"); 

            System.out.println("First vector: " + v1);
            System.out.println("First vector elements: " + v1.get(0));
            System.out.println("Third element in the first vector: " + v1.elementAt(2)); 
            System.out.println();

            System.out.println("Second vector: " + v2);
            if (v3.isEmpty()) {
                v3.add("Shreyas"); // Corrected the colon to a semicolon
            }
            System.out.println();
            System.out.println("Third vector: " + v3);
            System.out.println("Size of the first vector: " + v1.size());

            System.out.println("Capacity of the first vector: " + v1.capacity());
        } catch (Exception e) {
            System.out.println("Error: " + e); 
        }
    }
}
