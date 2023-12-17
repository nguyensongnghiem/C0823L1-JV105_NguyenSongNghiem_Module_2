package mvc.controller;

import mvc.service.IStudentModel;
import mvc.model.Student;
import mvc.view.IStudentView;
import mvc.view.imp.StudentView;

/**
 * StudentController
 */
public class StudentController {
    IStudentView studentView;
    IStudentModel studentModel;

    public StudentController(StudentView studentView, IStudentModel studentModel) {
        this.studentView = studentView;
        this.studentModel = studentModel;
    }

    public void selectMenu() {
        boolean exitFlag = false;
        do {
            int selected = studentView.selectMenu();
            switch (selected) {
            case 1:

                showAllStudents();
                break;
            case 2:
                System.out.println("Add student");
                addStudent();
                break;
            case 3:
                showStudentById();
                break;
            case 4:
                System.out.println("Delete student");
                deleteStudent();
                break;
            case 5:
                System.out.println("Exit !");
                exitFlag = true;
                break;
            }
        } while (!exitFlag);

    }

    public void showAllStudents() {
        Student[] students = getAll();
        studentView.showAllStudents(students);
    }

    public Student[] getAll() {
        Student[] students = studentModel.getAll();
        return students;
    }

    public void showStudentById() {
        int studentId = studentView.inputStudentId(); // call the view to get student ID input
        Student std = getStudentById(studentId); // call the model to get the student for student id
        studentView.showStudent(std); // call the view to show student info
    }

    public Student getStudentById(int studentId) {
        return studentModel.getStudentById(studentId);
    }

    public void addStudent() {
        Student newStudent = studentView.inputStudentInfo();
        String message = studentModel.addStudent(newStudent);
        studentView.showMessage(message);
    }

    public void deleteStudent() {
        int deleteId = studentView.inputStudentId();
        String message = studentModel.deleteStudentById(deleteId);
        studentView.showMessage(message);

    }

}