package studentmanager;

public class Student {
    private int id;
    private String name;
    private String classes;
    private String address;

    public Student(int id, String name, String classes, String address) {
        this.id = id;
        this.name = name;
        this.classes = classes;
        this.address = address;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getClasses() {
        return classes;
    }

    public void setClasses(String classes) {
        this.classes = classes;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
    public String toString() {
        return "id : " + getId() + "; name : " + getName() + "; address : " + getAddress() + "; class : " + getClasses();
     }
}
