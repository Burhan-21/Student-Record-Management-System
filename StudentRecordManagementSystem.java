import java.util.ArrayList;
import java.util.Comparator;
import java.util.Optional;
import java.util.Scanner;

public class StudentRecordManagementSystem {

    private static final ArrayList<Student> students = new ArrayList<>();
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        boolean exit = false;
        while (!exit) {
            showMenu();
            String choice = scanner.nextLine();
            exit = handleCommand(choice);
        }
        scanner.close();
        System.out.println("System exited. Goodbye!");
    }

    private static void showMenu() {
        System.out.print("""
            \n--- Student Record Management System ---
            1. Add Student
            2. View All Students
            3. Update Student
            4. Delete Student
            5. Sort Students by Marks (descending)
            6. Exit
            Enter your choice: """);
    }

    private static boolean handleCommand(String choice) {
        return switch (choice.trim()) {
            case "1" -> { addStudent(); yield false; }
            case "2" -> { viewStudents(); yield false; }
            case "3" -> { updateStudent(); yield false; }
            case "4" -> { deleteStudent(); yield false; }
            case "5" -> { sortStudentsByMarks(); yield false; }
            case "6" -> true;
            default -> {
                System.out.println("Invalid choice. Try again.");
                yield false;
            }
        };
    }

    private static void addStudent() {
        try {
            System.out.print("Enter Student ID: ");
            int id = Integer.parseInt(scanner.nextLine());
            if (students.stream().anyMatch(s -> s.id() == id)) {
                System.out.println("Student ID already exists.");
                return;
            }
            System.out.print("Enter Name: ");
            String name = scanner.nextLine();
            System.out.print("Enter Marks: ");
            double marks = Double.parseDouble(scanner.nextLine());
            students.add(new Student(id, name, marks));
            System.out.println("Student added successfully.");
        } catch (NumberFormatException ex) {
            System.out.println("Invalid input. Please enter valid numeric values for ID and Marks.");
        }
    }

    private static void viewStudents() {
        if (students.isEmpty()) {
            System.out.println("No students available.");
            return;
        }
        System.out.println("\n--- Students List ---");
        students.forEach(System.out::println);
    }

    private static void updateStudent() {
        try {
            System.out.print("Enter Student ID to update: ");
            int id = Integer.parseInt(scanner.nextLine());
            Optional<Student> optStudent = students.stream().filter(s -> s.id() == id).findFirst();
            if (optStudent.isPresent()) {
                System.out.print("Enter new Name (leave blank to keep current): ");
                String newName = scanner.nextLine();
                System.out.print("Enter new Marks (leave blank to keep current): ");
                String marksInput = scanner.nextLine();
                Student oldStudent = optStudent.get();
                String updatedName = newName.isBlank() ? oldStudent.name() : newName;
                double updatedMarks = marksInput.isBlank() ? oldStudent.marks() : Double.parseDouble(marksInput);
                students.remove(oldStudent);
                students.add(new Student(id, updatedName, updatedMarks));
                System.out.println("Student record updated.");
            } else {
                System.out.println("Student not found.");
            }
        } catch (NumberFormatException ex) {
            System.out.println("Invalid input.");
        }
    }

    private static void deleteStudent() {
        try {
            System.out.print("Enter Student ID to delete: ");
            int id = Integer.parseInt(scanner.nextLine());
            boolean removed = students.removeIf(s -> s.id() == id);
            if (removed) {
                System.out.println("Student deleted.");
            } else {
                System.out.println("Student not found.");
            }
        } catch (NumberFormatException ex) {
            System.out.println("Invalid input.");
        }
    }

    private static void sortStudentsByMarks() {
        if (students.isEmpty()) {
            System.out.println("No students available to sort.");
            return;
        }
        students.sort(Comparator.comparingDouble(Student::marks).reversed());
        System.out.println("Students sorted by marks (descending):");
        students.forEach(System.out::println);
    }
}
