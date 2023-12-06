package Session05;

class Student {

    private String name = "John";
    private String classes = "C02";
    public Student () {

    }
    public void setName(String name) {
        this.name = name;

    }
     protected void setClasses (String classes) {
        this.classes = classes;
    }
}
class TestStudent {
    public static void main(String[] args) {
       Student std = new Student();
       std.setName("Bob");
       std.setClasses("C10");
    }
}
