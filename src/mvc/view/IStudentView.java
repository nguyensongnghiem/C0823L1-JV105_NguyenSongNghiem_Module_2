package mvc.view;

import mvc.model.Student;

public interface IStudentView {
    int selectMenu();
    void showAllStudents(Student[] students);
    void showStudent(Student student);
    int inputStudentId();
    void showMessage(String message);
    Student inputStudentInfo();
}
