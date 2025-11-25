package Java8Features.StreamAPI.set;

import java.util.*;
import java.util.stream.Collectors;

//import static java.util.stream.Nodes.collect;

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

//        Implement a program that takes a set of Student objects as input and performs the following operations:

//        Filter out all students who have less than 2 years of enrollment and are not majoring in Computer Science, but have a GPA of at least 3.2 and an age above 20.
//        Sort the remaining students in descending order of their GPA, and then by their age in ascending order.
//                Return a new set containing the names of the remaining students, but with each name reversed, in lowercase, suffixed with their age, and prefixed with their major code.

        //----------Task 1--------------
        Set<String> finalResult = students.stream()
                .filter(s -> s.getYearsOfEnrollment() < 2
                        && !s.getMajor().equalsIgnoreCase("CS")
                        && s.getGpa() >= 3.2
                        && s.getAge() > 20)
                .sorted(Comparator.comparingDouble(Student::getGpa)
                        .reversed()
                        .thenComparing(Student::getAge))
                .map(s -> {
                    String major = s.getMajor().substring(0, 2).toUpperCase();
                    StringBuilder reverseName = new StringBuilder(s.getName()).reverse();
                    return (major + reverseName + s.getAge()).toLowerCase();
                })
                .collect(Collectors.toSet());

        System.out.println(finalResult);














        // 3️ Transformation
//                .map(s -> {
//                    String majorCode = s.getMajor().substring(0, 2).toUpperCase();
//                    String reversedName = new StringBuilder(s.getName()).reverse().toString();
//                    return (majorCode + reversedName + s.getAge()).toLowerCase();
//                })
//
//                .collect(Collectors.toSet()); // Final result as Set
//
//        System.out.println(result);



//        // ---------------- TASK 1 ----------------
//        Set<Student> filteredStudents = students.stream()
//                .filter(s -> !(s.getGpa() > 3.8 &&
//                        s.getMajor().equalsIgnoreCase("Biology") &&
//                        s.getYearsOfEnrollment() <= 4 &&
//                        (s.getNumberOfIncompleteCourses() > 0 || s.isOnProbation())))
//                .collect(Collectors.toSet());
//
//        System.out.println("\nAfter Task1 Filtering: " + filteredStudents);
//
//
//
//
//
//
//
//
//
//        // ---------------- TASK 2 ----------------
//        double squareRootValue = Math.sqrt(
//                filteredStudents.stream()
//                        .filter(s -> s.getAge() > 30 && s.getGpa() > 3.9)
//                        .mapToDouble(Student::getGpa)
//                        .sum()
//        );
//
//        System.out.println("\nSquare Root of GPA Sum (Task2): " + squareRootValue);
//
//        // ---------------- TASK 3 ----------------
//        Optional<Student> closestStudent = filteredStudents.stream()
//                .filter(s -> s.getMajor().equalsIgnoreCase("CS") && s.getGpa() > 4.2)
//                .min(Comparator.comparingDouble(s -> Math.abs(s.getAge() - squareRootValue)));
//
//        if (closestStudent.isPresent()) {
//            System.out.println("\nClosest Student to Square Root Age (Task3): " + closestStudent.get());
//        } else {
//            System.out.println("\nTask3: No matching student found");
//        }
    }
}
//import java.util.*;
//        import java.util.stream.Collectors;
//
//class Student {
//    private String name;
//    private String major;
//    private int age;
//    private int yearsOfEnrollment;
//    private double gpa;
//    private int numberOfIncompleteCourses;
//
//    // constructor + getters (assume already present)
//}
//
//public class StreamDemo {
//    public static void main(String[] args) {
//
//        Set<Student> students = new HashSet<>(Arrays.asList(
//                new Student("Alice", "Math", 22, 1, 3.5, 0),
//                new Student("Bob", "Computer Science", 25, 3, 3.8, 1),
//                new Student("Charlie", "Physics", 23, 1, 3.3, 2),
//                new Student("David", "History", 21, 1, 3.9, 1)
//        ));
//
//        Set<String> result = students.stream()
//                // 1️⃣ Filter conditions
//                .filter(s -> s.getYearsOfEnrollment() < 2)
//                .filter(s -> !s.getMajor().equalsIgnoreCase("Computer Science"))
//                .filter(s -> s.getGpa() >= 3.2)
//                .filter(s -> s.getAge() > 20)
//
//                // 2️⃣ Sorting: GPA desc, Age asc
//                .sorted(Comparator.comparing(Student::getGpa).reversed()
//                        .thenComparing(Student::getAge))
//
//                // 3️⃣ Transformation
//                .map(s -> {
//                    String majorCode = s.getMajor().substring(0, 2).toUpperCase();
//                    String reversedName = new StringBuilder(s.getName()).reverse().toString();
//                    return (majorCode + reversedName + s.getAge()).toLowerCase();
//                })
//
//                .collect(Collectors.toSet()); // Final result as Set
//
//        System.out.println(result);
//    }
//}

