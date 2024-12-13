public class StringExample {
    public static void main(String[] args) {
        String s = "Software Developer";

        // Print the length of the string
        System.out.println("Length: " + s.length());

        System.out.println("------------------------");

        // Convert the string to uppercase and print it
        System.out.println("Uppercase: " + s.toUpperCase());

        // Convert the string to lowercase and print it
        System.out.println("Lowercase: " + s.toLowerCase());

        System.out.println("------------------------");

        // Check if the string ends with "Developer"
        System.out.println("Ends with 'Developer': " + s.endsWith("Developer"));

        // Check if the string starts with "Software"
        System.out.println("Starts with 'Software': " + s.startsWith("Software"));
    }
}
