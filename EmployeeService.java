import java.util.*;

public class EmployeeService {
    private List<Employee> employees = new ArrayList<>();

    public void addEmployee(Employee emp) {
        employees.add(emp);
        String msg = "Employee added successfully!";
        System.out.println(msg);
    }

    public void viewEmployees() {
        if (employees.isEmpty()) {
            String msg = "No employees found.";
            System.out.println(msg);
            return;
        }

        for (Employee e : employees) {
            System.out.println(e);
        }
    }

    public Employee searchEmployee(int id) {
        for (Employee e : employees) {
            if (e.getId() == id) {
                return e;
            }
        }
        return null;
    }

    public void deleteEmployee(int id) {
        Employee emp = searchEmployee(id);
        if (emp != null) {
            employees.remove(emp);
            String msg = "Employee deleted.";
            System.out.println(msg);
        } else {
            String msg = "Employee not found.";
            System.out.println(msg);
        }
    }

    public void updateEmployee(int id, String name, String dept, double salary) {
        Employee emp = searchEmployee(id);
        if (emp != null) {
            emp.setName(name);
            emp.setDepartment(dept);
            emp.setSalary(salary);
            String msg = "Employee updated.";
            System.out.println(msg);
        } else {
            String msg = "Employee not found.";
            System.out.println(msg);
        }
    }
}