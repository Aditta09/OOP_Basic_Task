import java.util.ArrayList;

class Student {
    private String name;
    private String grade;
    private ArrayList<String> courses = new ArrayList<>();

    public Student(String name, String grade) {
        this.name = name;
        this.grade = grade;
    }

    public void addCourse(String course) {
        courses.add(course);
    }

    public void removeCourse(String course) {
        courses.remove(course);
    }

    public void display() {
        System.out.println("Name: " + name + ", Grade: " + grade + ", Courses: " + courses);
    }

    public static void main(String[] args) {
        Student s = new Student("Alice", "A");
        s.addCourse("Math");
        s.addCourse("Physics");
        s.display();

        s.removeCourse("Math");
        s.display();
    }
}
