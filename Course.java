public class Course {
    String title;
    Instructor instructor;
    CourseCategory category;
    Student[] enrolledStudents = new Student[0];

    public Course(String title, Instructor instructor, CourseCategory category) {
        this.title = title;
        this.instructor = instructor;
        this.category = category;
    }

    public void enrollStudent(Student student) {
        Student[] newArr = new Student[enrolledStudents.length + 1];
        for (int i = 0; i < enrolledStudents.length; i++) {
            newArr[i] = enrolledStudents[i];
        }
        newArr[enrolledStudents.length] = student;
        enrolledStudents = newArr;
        System.out.println(student.name + " enrolled in " + title);
    }

    @Override
    public String toString() {
        return title + " (" + category + ")";
    }
}
