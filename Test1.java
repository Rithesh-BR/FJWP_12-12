public class Test1 {

    public static void main(String[] args) {
        // Create an instance of StudentBean
        StudentBean student = new StudentBean();

        // Set properties using setters
        student.setName("Rithesh B R");
        student.setId(1);
        student.setCourse("Java");

        // Get and print the properties using getters
        System.out.println("Name: " + student.getName());
        System.out.println("ID: " + student.getId());
        System.out.println("Course: " + student.getCourse());
    }
}
