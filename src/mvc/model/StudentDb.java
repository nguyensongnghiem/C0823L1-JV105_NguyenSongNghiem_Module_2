package mvc.model;

public class StudentDb {
    public static Student[] students ;
    static {
        students = new Student[5];
        students[0] = new Student("Nghiem", 1, 001, "C08" , 8);
        students[1] = new Student("Cuong", 2, 002, "C08" , 7);
        students[2] = new Student("Quang", 3, 003, "C08" , 4);
    }

    public static Student[] getAll() {
        return students;
    }
    public static Student getStudentById ( int id ) {
            Student std = null ;
           for (int i = 0; i < students.length; i++) {
                if(students[i]!=null && students[i].getStudentId() == id ) {
                     std = students[i];     
                     break;             
                }                                
           } 
           return std;
    }
    public static void addStudent(Student student) {
        for (int i = 0; i < students.length; i++) {
            if (students[i]==null) {
                students[i] = student;
                break;
            }
        }
    }
    public static void deleteByStudentId(int id) {
        for (int i = 0; i < students.length; i++) {
            if (students[i]!=null && students[i].getStudentId()==id) {
                for (int j = i; j < students.length-1; j++) {
                    students[j] = students[i+1];
                }
                students[students.length-1] = null;
            } else {
                break;
            }

        }
    }

}
