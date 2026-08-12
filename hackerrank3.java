import java.util.*;

class Student {
    private int id;
    private String firstName;
    private double cgpa;

    public Student(int id, String firstName, double cgpa) {
        this.id = id;
        this.firstName = firstName;
        this.cgpa = cgpa;
    }

    public int getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public double getCgpa() {
        return cgpa;
    }
}

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n;
        // Validate number of students
        if (sc.hasNextInt()) {
            n = sc.nextInt();
            if (n <= 0) {
                System.out.println("Number of students must be positive.");
                return;
            }
        } else {
            System.out.println("Invalid input for number of students.");
            return;
        }

        List<Student> students = new ArrayList<>();

        // Read student data
        for (int i = 0; i < n; i++) {
            try {
                int id = sc.nextInt();
                String firstName = sc.next();
                double cgpa = sc.nextDouble();

                // Basic validation
                if (id <= 0 || cgpa < 0.0 || cgpa > 4.0) {
                    System.out.println("Invalid student data. Skipping entry.");
                    continue;
                }

                students.add(new Student(id, firstName, cgpa));
            } catch (Exception e) {
                System.out.println("Invalid input format. Skipping entry.");
                sc.nextLine(); // clear invalid input
            }
        }
        sc.close();

        // Sort using Java 8 Comparator chaining
        students.sort(
            Comparator.comparing(Student::getCgpa).reversed()
                      .thenComparing(Student::getFirstName)
                      .thenComparing(Student::getId)
        );

        // Output sorted names
        students.forEach(s -> System.out.println(s.getFirstName()));
    }
}
