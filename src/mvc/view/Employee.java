package mvc.view;

public abstract class Employee extends Person {
    private float salary;
    
    public Employee() {
    }
    public Employee(String name, int id, float salary) {
        super(name, id);
        this.salary = salary;
    }
    public float getSalary() {
        return salary;
    }
    public void setSalary(float salary) {
        this.salary = salary;
    }
    public abstract void getBonus();
    public abstract void doTask();

}
