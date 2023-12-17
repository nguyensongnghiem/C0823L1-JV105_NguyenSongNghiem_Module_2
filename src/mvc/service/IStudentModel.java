package mvc.service;

import mvc.model.Student;
/**
 * IStudentModel
 */
public interface IStudentModel {
Student[] getAll();
    Student getStudentById(int studentId);
    String deleteStudentById(int studentId);
    String addStudent(Student student);
    boolean isStudentExisted (int studentId);
    
}
