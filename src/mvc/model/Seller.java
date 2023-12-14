package mvc.model;

public class Seller extends Employee implements IPlanGame {

    public Seller(String name, int id, float salary) {
        super(name, id, salary);
        // TODO Auto-generated constructor stub
    }

    @Override
    public void getBonus() {
        System.out.println("A seller get 10% bonus");
    }

    @Override
    public void howtoGo() {
        System.out.println("A seller go to work by car !");
    }

    @Override
    public void doTask() {
        System.out.println("I sell the JavaFullstack !");
    }

    @Override
    public void planGame() {
        System.out.println("I plan game for the customer !");
    }

}
