public class Manager extends Employee{

    private int teamSize;

    public Manager(String name, int age, double salary, int teamSize) {
        super(name, age, salary);
        this.teamSize = teamSize;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Team size: " + teamSize);
    }
}
