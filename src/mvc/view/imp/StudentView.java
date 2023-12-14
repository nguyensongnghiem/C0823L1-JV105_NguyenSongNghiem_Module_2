package mvc.view.imp;

import java.util.Scanner;
import mvc.model.Student;
import mvc.view.IStudentView;

public class StudentView implements IStudentView {

    @Override
    public void showAllStudents(Student[] students) {
        for (int i = 0; i < students.length; i++) {
            if (students[i] != null) {
                System.out.println(students[i]);
            }
        }
    }

    @Override
    public void showStudent(Student student) {
        System.out.println(student);
    }

    @Override
    public int inputStudentId() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter student id : ");
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
        Scanner scanner = new Scanner(System.in);
        System.out.print("Select a task: ");
        int selected = scanner.nextInt();        
        return selected;
    }
}