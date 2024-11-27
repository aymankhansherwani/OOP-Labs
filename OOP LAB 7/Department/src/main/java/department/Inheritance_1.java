package department;

public class Inheritance_1 {

    public static void main(String[] args) {
        Staff staff1 = new Staff("Zunaira", "Administrator", "HR", "zoni@gmail.com", "030949790", 87654, 011, 70);
        Staff staff2 = new Staff("Umar", "Technician", "IT", "umar@gmail.com", "0346778921", 9890, 002, 30);

        Course course1 = new Course("OOP", "CS101", 3);
        Course course2 = new Course("Data Structures", "CS102", 3);
        Course course3 = new Course("Databases And Algorithms", "CS103", 3);

        Faculty faculty1 = new Faculty("Dr. Asna", "Professor", "Computer Science", "asna@gmail.com", "09871234", 7000, 201, 40);
        faculty1.addCourse(course1);
        faculty1.addCourse(course2);

        Faculty faculty2 = new Faculty("Dr. Ambreen", "Associate Professor", "Information Technology", "ambreen@gmail.com", "009835678", 70000, 202, 38);
        faculty2.addCourse(course3);

        System.out.println("Staff Members:");
        System.out.println(staff1);
        System.out.println(staff2);

        System.out.println("\nFaculty Members:");
        System.out.println(faculty1);
        System.out.println(faculty2);
    }
}
