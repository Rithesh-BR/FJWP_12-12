import java.util.Scanner;

public class StringConcatenation {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer();
        Scanner s = new Scanner(System.in);

        System.out.println("Enter a string: ");
        String userinput = s.next();

        while (!userinput.equalsIgnoreCase("exit")) {
            sb.append(userinput).append("\n");
            System.out.println("Enter another string: ");
            userinput = s.next();
        }

        String result = sb.toString();
        System.out.println("Concatenated strings: ");
        System.out.println(result);

        s.close();
    }
}
