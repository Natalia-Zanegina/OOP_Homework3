package OOP_Homework3;

import java.util.Comparator;

public class AgeComparator implements Comparator<Employee> {
    @Override
    public int compare(Employee o1, Employee o2) {
        int res = Integer.compare(o1.getAge(), o2.getAge());
        return res;
    }
}
