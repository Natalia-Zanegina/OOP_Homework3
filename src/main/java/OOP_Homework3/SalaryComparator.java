package OOP_Homework3;

import java.util.Comparator;

public class SalaryComparator implements Comparator<Employee> {
    @Override
    public int compare(Employee o1, Employee o2) {
        //return o1.calculateSalary() == o2.calculateSalary() ? 0 : o1.calculateSalary() > o2.calculateSalary() ? 1 : -1;
        int res = Double.compare(o2.calculateSalary(), o1.calculateSalary());
        return res;
    }
}
