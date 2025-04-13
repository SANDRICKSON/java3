public class Main {
    public static void main(String[] args) {

        Instructor instructor1 = new Instructor("Vakho", "Java Developer");
        Instructor instructor2 = new Instructor("Sandro", "UI/UX Designer");


        Course course1 = new Course("Java Development", instructor1, CourseCategory.PROGRAMMING);
        Course course2 = new Course("UI/UX Design", instructor2, CourseCategory.DESIGN);
        Course course3 = new Course("Digital Marketing", instructor1, CourseCategory.MARKETING);


        Student student1 = new Student("Eka");
        Student student2 = new Student("Giorgi");


        student1.enroll(course1);
        student1.enroll(course2);

        student2.enroll(course2);
        student2.enroll(course3);


        student1.completeCourse(course1);
        student2.completeCourse(course2);
        student2.completeCourse(course1);


        student1.printStatus();
        student2.printStatus();

    }
}
