package mvc.model.imp;

import mvc.model.IStudentModel;
import mvc.model.Student;
import mvc.model.StudentDb;

public class StudentModel implements IStudentModel {
    
    public StudentModel() {

    }
    @Override
    public Student[] getAll() {
        return StudentDb.getAll(); // connect to DB and get all 
    }

    @Override
    public Student getStudentById(int studentId) {
      return StudentDb.getStudentById(studentId);
    }

    @Override
    public void deleteByStudentId(int studentId) {
        StudentDb.deleteByStudentId(studentId);
    }

    @Override
    public void addStudent(Student student) {
        StudentDb.addStudent(student);
    }

}
