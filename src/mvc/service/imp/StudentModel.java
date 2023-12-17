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
    public String deleteStudentById(int studentId) {
        if (isStudentExisted(studentId)) {
            studentDb.deleteByStudentId(studentId);
            return "Delete successfull !";
        } else {
            return "Student id does\'n exist !";
        }
    }

    @Override
    public String addStudent(Student student) {
        if (!isStudentExisted(student.getStudentId())) {
            studentDb.addStudent(student);
            return "Add successfull !";
        } else {
            return "Student Id already exist !";
        }
    }

    @Override
    public boolean isStudentExisted(int studentId) {
        return studentDb.isStudentIdExist(studentId);
    }

}
