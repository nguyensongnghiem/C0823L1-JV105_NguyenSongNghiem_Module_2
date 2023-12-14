package mvc.view;

public class Student extends Person {
    private int studentID;
    private String className;
    private int point;
    
    public Student(int studentID, String className, int point) {
	this.studentID = studentID;
	this.className = className;
	this.point = point;
    }

    public Student(String name, int id, int studentID, String className, int point) {
	super(name, id);
	this.studentID = studentID;
	this.className = className;
	this.point = point;
    }

    public int getPoint() {
        return point;
    }

    public void setPoint(int point) {
        this.point = point;
    }
    

    @Override
    public void howtoGo() {
        System.out.println("A student go to CodeGym by bike or bycicle !");
    }

    @Override
    public String toString() {
        return "Student []";
    }

    public int getStudentID() {
        return studentID;
    }

    public void setStudentID(int studentID) {
        this.studentID = studentID;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    @Override
    public void doTask() {
       System.out.println("Student have to study !!");
    }

}
