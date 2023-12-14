package mvc.model;

public class Ministry extends Employee implements IAttendance, IPlanGame {

    @Override
    public void getBonus() {
        System.out.println("A ministor get 15% bonus");
    }

    @Override
    public void howtoGo() {
        System.out.println("A ministor go to work by Bike !");
    }

    @Override
    public void doTask() {
        System.out.println("I support students in general things !");
    }

    @Override
    public void rollCall() {
        System.out.println("I roll call the class when instructor off ! ");
    }

    @Override
    public void planGame() {
        System.out.println("I plan game for students in CodeGym !");
    }

}
