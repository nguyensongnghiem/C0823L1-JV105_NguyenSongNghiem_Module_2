package mvc;

import java.util.Scanner;
import mvc.controller.StudentController;
import mvc.model.Student;
import mvc.model.imp.StudentModel;
import mvc.view.imp.StudentView;

public class Main {   
    public static void main(String[] args) {
        StudentView studentView = new StudentView();
        StudentModel studentModel = new StudentModel();
        StudentController studentController = new StudentController(studentView, studentModel);
        boolean exitFlag = false;

        // int  selected = studentView.selectMenu();
        do {
        System.out.println("STUDENTS MANAGER ");
        System.out.println("1. Display list ");
        System.out.println("2. Add student ");
        System.out.println("3. Show student by Student Id");
        System.out.println("4. Delete student");
        System.out.println("5. Exit");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Select a task: ");
        int selected = scanner.nextInt();   

        switch (selected) {
            case 1:
                System.out.println("Display list");
                studentController.showAllStudents();
                break;
            case 2:
                System.out.println("Add student");
                break;
            case 3:
                System.out.println("Show student by Student Id");
                studentController.showStudentById();              
                break;
            case 4:
                System.out.println("Delete student");
                break;
            case 5:
                System.out.println("Exit !");
                exitFlag = true;
                break;
            }
        } while (!exitFlag) ;
    }
}
