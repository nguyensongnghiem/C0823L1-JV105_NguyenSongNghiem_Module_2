package mvc.repository;

import mvc.model.Student;

public interface IStudentDb {
    Student[] getAll();
    Student getStudentById ( int id );
    void addStudent(Student student);
    void deleteByStudentId(int id);
    boolean isStudentIdExist(int studentId);

}