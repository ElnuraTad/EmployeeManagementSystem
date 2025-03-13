//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        // Creating a Manager
        Manager manager = new Manager("Alice Johnson", 40, 85000, 10);
        System.out.println("Manager Details:");
        manager.displayInfo();
        System.out.println("-----------------------------");

        // Creating a Developer
        Developer developer = new Developer("Bob Smith", 28, 70000, "Java");
        System.out.println("Developer Details:");
        developer.displayInfo();
    }
}