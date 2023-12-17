package mvc.view.imp;

import java.util.Scanner;
import mvc.model.Student;
import mvc.view.IStudentView;

public class StudentView implements IStudentView {

    private Scanner scanner = new Scanner(System.in);

    @Override
    public void showAllStudents(Student[] students) {
        System.out.println("--- Display list -----");
        for (int i = 0; i < students.length; i++) {
            if (students[i] != null) {
                System.out.println(students[i]);
            }
        }
                System.out.println("--- End of list -----");

    }

    @Override
    public void showStudent(Student student) {
        System.out.println("--- Display Student info -----");

        System.out.println(student);
                System.out.println("--- End of info -----");

    }

    @Override
    public int inputStudentId() {
        System.out.print("Enter student id : ");
        int id = Integer.parseInt(scanner.nextLine());
        return id;

    }

    @Override
    public int selectMenu() {
        System.out.println("STUDENTS MANAGER ");
        System.out.println("1. Display list ");
        System.out.println("2. Add student ");
        System.out.println("3. Show student by Student Id");
        System.out.println("4. Delete student");
        System.out.println("5. Exit");
        System.out.print("Select a task: ");
        int selected = scanner.nextInt();
        return selected;
    }

    @Override
    public void showMessage(String message) {
        System.out.println(message);
    }

    @Override
    public Student inputStudentInfo() {
        System.out.print("Enter Citizen ID : ");
        int id = Integer.parseInt(scanner.nextLine());
        System.out.print("Enter student id: ");
        int stdId = Integer.parseInt(scanner.nextLine());
        System.out.print("Enter name: ");
        String name = scanner.nextLine();
        System.out.print("Enter class: ");
        String className = scanner.nextLine();
        System.out.print("Enter point: ");
        int point = Integer.parseInt(scanner.nextLine());
        Student newStudent = new Student(name, id, stdId, className, point);
        return newStudent;

    }
}