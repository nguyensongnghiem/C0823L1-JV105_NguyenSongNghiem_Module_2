package mvc.service;

import mvc.model.Student;
/**
 * IStudentModel
 */
public interface IStudentModel {
Student[] getAll();
    Student getStudentById(int studentId);
    void deleteByStudentId(int studentId);
    void addStudent(Student student);
    
}
