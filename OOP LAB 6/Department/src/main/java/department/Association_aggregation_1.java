package department;
public class Association_aggregation_1 {
public static void main(String[] args) {
        Course course1 = new Course("B101", "Digital Design", 9);
        Course course2 = new Course("C102", "Physics", 3);
        Course course3 = new Course("M113", "Calculus", 2);
        
        Faculty faculty1 = new Faculty("F101", "Dr. Mirza","Professor", "03001117890", 80000.00, "mirza@work.com");
        faculty1.addCourse(course1);
        faculty1.addCourse(course2);

        Faculty faculty2 = new Faculty("F118", "Dr. Waqas", "Assistant Professor", "03021217790", 45000.00, "waqas@work.com");
        faculty2.addCourse(course3);

        Faculty faculty3 = new Faculty("F116", "Dr. Hanan", "Lecturer", "03021217790", 90000.00, "hanan@gmail.com");        Department dept1 = new Department("K121", "OOP");
        dept1.addCourse(course1);
        dept1.addCourse(course2);
        dept1.addCourse(course3);
        dept1.addFaculty(faculty1);
        dept1.addFaculty(faculty2);
        dept1.addFaculty(faculty3);

        System.out.println(dept1);
    }
}
