public class Employee {
    private String fullName;
    private int age;
    private float salary;
    private int departament;
    private int id;
    private static int goAhead = 1;

    public Employee(String fullName, int age, float salary, int departament) {
        this.salary = salary;
        this.age = age;
        this.fullName = fullName;
        this.id = goAhead++;
        this.departament = departament;
    }

    public String getFullName() {
        return this.getFullName();
    }

    public int getAge() {
        return this.age;
    }

    public float getSalary() {
        return this.salary;
    }

    public String toString() {
        return "Full Name is: " + this.fullName + ". Salary is: " + this.salary + ". Age is: " + this.age + ". Id is: " + this.id;
    }

    public int getId() {
        return this.id;
    }
}
