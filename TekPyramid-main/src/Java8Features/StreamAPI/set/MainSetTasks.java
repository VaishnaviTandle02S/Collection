package Java8Features.StreamAPI.set;

import java.util.*;
import java.util.stream.Collectors;

// -------------------- Student Class --------------------
class  Student {
    private String name;
    private String major;
    private int age;
    private int yearsOfEnrollment;
    private double gpa;
    private int numberOfIncompleteCourses;
    private boolean onProbation;

    public Student(String name, String major, int age, int yearsOfEnrollment,
                   double gpa, int numberOfIncompleteCourses, boolean onProbation) {
        this.name = name;
        this.major = major;
        this.age = age;
        this.yearsOfEnrollment = yearsOfEnrollment;
        this.gpa = gpa;
        this.numberOfIncompleteCourses = numberOfIncompleteCourses;
        this.onProbation = onProbation;
    }

    public String getName() { return name; }
    public String getMajor() { return major; }
    public int getAge() { return age; }
    public int getYearsOfEnrollment() { return yearsOfEnrollment; }
    public double getGpa() { return gpa; }
    public int getNumberOfIncompleteCourses() { return numberOfIncompleteCourses; }
    public boolean isOnProbation() { return onProbation; }

    @Override
    public String toString() {
        return name + " (" + major + ", GPA=" + gpa + ", Age=" + age + ")";
    }
}

// -------------------- MAIN CLASS --------------------
public class MainSetTasks {
    public static void main(String[] args) {

        // -------- SAMPLE SET OF STUDENTS --------
        Set<Student> students = new HashSet<>(Arrays.asList(
                new Student("Rohan", "CS", 20, 2, 3.8, 0, false),
                new Student("Amit", "CS", 22, 3, 2.9, 1, true),
                new Student("Priya", "Biology", 19, 1, 3.4, 0, false),
                new Student("Sneha", "Engineering", 23, 4, 3.7, 0, false),
                new Student("Vikas", "Mathematics", 24, 2, 2.8, 2, true),
                new Student("Deepak", "Mathematics", 21, 1, 2.5, 1, true),
                new Student("Ritu", "Biology", 20, 3, 3.1, 0, false),
                new Student("Meena", "Chemistry", 22, 2, 3.3, 0, false),
                new Student("Sumit", "Engineering", 25, 5, 3.9, 0, false),
                new Student("Rahul", "Chemistry", 19, 1, 3.0, 0, false),
                new Student("Kiran", "CS", 21, 2, 3.5, 0, false),
                new Student("Suresh", "Mathematics", 26, 3, 2.7, 3, true),
                // Adding valid students for meaningful output
                new Student("Arjun", "CS", 35, 7, 4.8, 0, false),
                new Student("Neha", "Biology", 22, 3, 4.0, 1, true)
        ));

        System.out.println("Original Students: " + students);

        // ---------------- TASK 1 ----------------
        Set<Student> filteredStudents = students.stream()
                .filter(s -> !(s.getGpa() > 3.8 &&
                        s.getMajor().equalsIgnoreCase("Biology") &&
                        s.getYearsOfEnrollment() <= 4 &&
                        (s.getNumberOfIncompleteCourses() > 0 || s.isOnProbation())))
                .collect(Collectors.toSet());

        System.out.println("\nAfter Task1 Filtering: " + filteredStudents);

        // ---------------- TASK 2 ----------------
        double squareRootValue = Math.sqrt(
                filteredStudents.stream()
                        .filter(s -> s.getAge() > 30 && s.getGpa() > 3.9)
                        .mapToDouble(Student::getGpa)
                        .sum()
        );

        System.out.println("\nSquare Root of GPA Sum (Task2): " + squareRootValue);

        // ---------------- TASK 3 ----------------
        Optional<Student> closestStudent = filteredStudents.stream()
                .filter(s -> s.getMajor().equalsIgnoreCase("CS") && s.getGpa() > 4.2)
                .min(Comparator.comparingDouble(s -> Math.abs(s.getAge() - squareRootValue)));

        if (closestStudent.isPresent()) {
            System.out.println("\nClosest Student to Square Root Age (Task3): " + closestStudent.get());
        } else {
            System.out.println("\nTask3: No matching student found");
        }
    }
}
