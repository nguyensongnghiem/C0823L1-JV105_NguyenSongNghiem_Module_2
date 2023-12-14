package mvc.view;

public class Instructor extends Employee implements IAttendance {

    @Override
    public void getBonus() {
        System.out.println("A instructor get 20% bonus");
    }

    @Override
    public void doTask() {
        System.out.println("I instruct students in CodeGym !");
    }

    @Override
    public void howtoGo() {
        System.out.println("A instructor go to CodeGym in a RR ");
    }

    @Override
    public void rollCall() {
        System.out.println("I roll call the class !!");
    }

}
