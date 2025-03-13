public class Developer extends Employee{
    private String programmingLanguage;

    public Developer(String name, int age, double salary, String programmingLanguage) {
        super(name, age, salary);
        this.programmingLanguage = programmingLanguage;
    }

    public Developer(String name, int age, double salary) {
        super(name, age, salary);
        System.out.println("Programming Language: " + programmingLanguage);
    }
}
