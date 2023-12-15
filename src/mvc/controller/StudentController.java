package mvc.controller;
import mvc.service.IStudentModel;
import mvc.model.Student;
import mvc.service.imp.StudentModel;
import mvc.view.IStudentView;
import mvc.view.imp.StudentView;
/**
 * StudentController
 */
public class StudentController {
    IStudentView studentView;
    IStudentModel studentModel;
    public StudentController(StudentView studentView, StudentModel studentModel) {
        this.studentView = studentView;
        this.studentModel = studentModel;
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
        int studentId = studentView.inputStudentId();
        Student std = getStudentById(studentId);
        studentView.showStudent(std);
    }
    public Student getStudentById(int studentId) {
        return studentModel.getStudentById(studentId);
    }
    
    

    
}