public class ExampleForStringBuilder {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Hello ");
        System.out.println("Initial string: " + sb);

        sb.append(", Afternoon");
        System.out.println("After append: " + sb);

        sb.insert(2, "JAVA");
        System.out.println("After insert: " + sb);

        sb.delete(0, 3); // Deletes characters from index 0 to 2 (3rd index exclusive)
        System.out.println("After delete (0 to 2): " + sb);

        sb.deleteCharAt(2); // Deletes the character at index 2
        System.out.println("After deleteCharAt(2): " + sb);

        sb.replace(0, 4, "Good"); // Replaces characters from index 0 to 3 (4th index exclusive) with "Good"
        System.out.println("After replace (0 to 4 with 'Good'): " + sb);
    }
}
