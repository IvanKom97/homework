public class Main {
    public static void main(String[] args) {
        Employee[] employees = new Employee[10];
        employees[1] = new Employee("Ivan Alekseev", 34, 56000, 2);
        employees[0] = new Employee("Katya Bazarskaya", 86, 6000,1);
        employees[2] = new Employee("Arkasha Valuev",  45, 45654.34f,3);
        employees[3] = new Employee("Kate Mrakobesova" , 34,  34567,5);
        employees[4] = new Employee("Nastya Azova", 34,  400000,4);
        employees[5] = new Employee("Andryha Gorbunov", 43,  9000,3);
        employees[6] = new Employee("Semen Zorya", 22, 20000,2);
        employees[7] = new Employee("Ivan Komov", 43,  999999.99f,1);
        employees[8] = new Employee("Ted Bear", 20, 34000,4);
        employees[9] = new Employee("John Vasiliev", 67,  48500,5);
        EmployeeBook employeeBook = new EmployeeBook();
        employeeBook.addAll(employees);
        employeeBook.removeEmployee(4);
        employeeBook.print();

    }
}