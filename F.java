import java.io.*;

public class F {
    public static void main(String[] args) {
        File file = new File("F.java");

        System.out.println("File name: " + file.getName());
        System.out.println("Size: " + file.length() + " bytes");
        System.out.println("Path: " + file.getPath());
        System.out.println("Absolute Path: " + file.getAbsolutePath());
        System.out.println("Last modified: " + new java.util.Date(file.lastModified()));
        System.out.println("File exists: " + file.exists());
        System.out.println("Readable: " + file.canRead());
        System.out.println("Writable: " + file.canWrite());
        System.out.println("Directory: " + file.isDirectory());
        System.out.println("Regular file: " + file.isFile());
    }
}
