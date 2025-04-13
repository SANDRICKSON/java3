public class Student implements UserAction {
    String name;
    Course[] enrolledCourses = new Course[0];
    Course[] completedCourses = new Course[0];

    public Student(String name) {
        this.name = name;
    }

    @Override
    public void enroll(Course course) {
        Course[] newArr = new Course[enrolledCourses.length + 1];
        for (int i = 0; i < enrolledCourses.length; i++) {
            newArr[i] = enrolledCourses[i];
        }
        newArr[enrolledCourses.length] = course;
        enrolledCourses = newArr;

        course.enrollStudent(this);
    }

    @Override
    public void completeCourse(Course course) {
        boolean found = false;
        for (Course c : enrolledCourses) {
            if (c == course) {
                found = true;
                break;
            }
        }

        if (found) {
            Course[] newArr = new Course[completedCourses.length + 1];
            for (int i = 0; i < completedCourses.length; i++) {
                newArr[i] = completedCourses[i];
            }
            newArr[completedCourses.length] = course;
            completedCourses = newArr;
            System.out.println(name + " completed course: " + course.title);
        } else {
            System.out.println(name + " is not enrolled in " + course.title);
        }
    }

    public void printStatus() {
        System.out.println("Student: " + name);
        System.out.println("Enrolled Courses:");
        for (Course c : enrolledCourses) {
            System.out.println(" - " + c);
        }
        System.out.println("Completed Courses:");
        for (Course c : completedCourses) {
            System.out.println(" - " + c);
        }
    }
}
