package mvc.view;

public abstract class Person {

    private String name;
    private int id;

    public Person() {
    }

    public Person(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public abstract void howtoGo();

    public abstract void doTask();
    @Override
    public String toString() {

        return "Person : {ID = " + getId() + "; name = " + getName();
    }

}
