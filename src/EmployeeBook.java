
public class EmployeeBook {
    private Employee[] workers = new Employee[10];

    public EmployeeBook() {
    }
    public void print() {
        for (int i = 0; i < this.workers.length; i++) {
            if (this.workers[i] != null)
                System.out.println(this.workers[i].toString());
        }
    }

    public void add(Employee employee) {
        for (int i = 0; i < workers.length; i++) {
            if (this.workers[i] == null) {
                workers[i] = employee;
                break;
            }
        }
    }

    public void addAll(Employee[] employees) {
        for (int i = 0; i < employees.length; i++) {
            this.add(employees[i]);
        }
    }

    public void removeEmployee(int id) {
        for (int i = 0; i < workers.length; i++) {
            if (workers[i] != null && workers[i].getId() == id) {
                workers[i] = null;
            }
        }
    }
}
