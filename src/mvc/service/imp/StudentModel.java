package mvc.service.imp;

import mvc.service.IStudentModel;
import mvc.model.Student;
import mvc.repository.imp.StudentDb;
import mvc.repository.IStudentDb;


public class StudentModel implements IStudentModel {
    IStudentDb studentDb = new StudentDb();
    public StudentModel() {

    }
    @Override
    public Student[] getAll() {
        return studentDb.getAll(); // connect to DB and get all 
    }

    @Override
    public Student getStudentById(int studentId) {
      return studentDb.getStudentById(studentId);
    }

    @Override
    public void deleteByStudentId(int studentId) {
        studentDb.deleteByStudentId(studentId);
    }

    @Override
    public void addStudent(Student student) {
        studentDb.addStudent(student);
    }

}
