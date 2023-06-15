package OOP_Homework3;

public abstract class Employee implements Comparable<Employee>{
    protected String surname;
    protected String name;
    protected double salary;
    protected int age;

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public double getSalary() {
        return salary;
    }

    public int getAge() {
        return age;
    }

    public Employee(String surname, String name, int age, double salary) {
        this.surname = surname;
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    public abstract double calculateSalary();

    /*@Override
    public int compareTo(Employee o) {
        int res = name.compareTo(o.name);
        if (res == 0){
            return Double.compare(calculateSalary(), o.calculateSalary());
        }
        return res;
    }*/

    // второй (свой) вариант сортировки (по фамилии, имени и зарплате)
    @Override
    public int compareTo(Employee o) {
        int res = surname.compareTo(o.surname);
        if (res == 0) {
            int res2 = name.compareTo(o.name);
            if (res2 == 0) {
                return Double.compare(calculateSalary(), o.calculateSalary());
            }
            return res2;
        }
        return res;
    }
}

