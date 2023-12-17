package mvc.repository.imp;

import mvc.model.Student;
import mvc.repository.IStudentDb;

public class StudentDb implements IStudentDb {
    public static Student[] students;
    static {
        students = new Student[5];
        students[0] = new Student("Nghiem", 1, 001, "C08", 8);
        students[1] = new Student("Cuong", 2, 002, "C08", 7);
        students[2] = new Student("Quang", 3, 003, "C08", 4);
    }

    @Override
    public Student[] getAll() {
        return students;
    }

    @Override
    public Student getStudentById(int id) {
        Student std = null;
        for (int i = 0; i < students.length; i++) {
            if (students[i] != null && students[i].getStudentId() == id) {
                std = students[i];
                break;
            }
        }
        return std;
    }

    @Override
    public void addStudent(Student student) {
        for (int i = 0; i < students.length; i++) {
            if (students[i] == null) {
                students[i] = student;
                break;
            }
        }
    }

    @Override
    public void deleteByStudentId(int id) {
        for (int i = 0; i < students.length; i++) {
            if (students[i] != null && students[i].getStudentId() == id) {
                for (int j = i; j < students.length - 1; j++) {
                    students[j] = students[j + 1];
                }
                students[students.length - 1] = null;
                break;
            } 
        }
    }

    @Override
    public boolean isStudentIdExist(int studentId) {
        if (getStudentById(studentId) != null) {
            return true;
        } else {
            return false;
        }
    }

}
