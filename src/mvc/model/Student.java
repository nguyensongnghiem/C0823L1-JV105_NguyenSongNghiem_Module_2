package mvc.model;

public class Student extends Person {
    private int studentId;
    private String className;
    private int point;

    // private StudentDB studentDB;
    public Student(int studentId, String className, int point) {
        this.studentId = studentId;
        this.className = className;
        this.point = point;
    }

    public Student(String name, int id, int studentId, String className, int point) {
        super(name, id);
        this.studentId = studentId;
        this.className = className;
        this.point = point;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public int getPoint() {
        return point;
    }

    public void setPoint(int point) {
        this.point = point;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }
    public void study(String subject) {
        System.out.println("Studyng " + subject);
    }

    @Override
    public void howtoGo() {
        System.out.println("A student go to CodeGym by bike or bycicle !");
    }
    
    @Override
    public void doTask() {
        System.out.println("Student have to study !!");
    }

    @Override
    public String toString() {
        return "Student [ Student Id = " + getStudentId() +" : " + getName() + ": " + getClassName() + "]";
    }


}
