import java.util.Scanner;

public class StringBufferExample {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        // Initialize the StringBuffer with the string "Hello"
        StringBuffer sb = new StringBuffer("Hello");

        // Get the length of the StringBuffer
        int length = sb.length();
        System.out.println("Length of StringBuffer: " + length);

        // Get the capacity of the StringBuffer
        int capacity = sb.capacity();
        System.out.println("Capacity of StringBuffer: " + capacity);
    }
}
