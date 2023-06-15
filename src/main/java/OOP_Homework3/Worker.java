package OOP_Homework3;

public class Worker extends Employee{

    public Worker(String surname, String name, int age, double salary) {
        super(surname, name, age, salary);
    }

    @Override
    public double calculateSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return String.format("%s %s; Возраст: %d; Рабочий; Среднемесячная заработная плата (фиксированная месячная оплата): %.2f (руб.)",
                surname, name, age, calculateSalary());
    }
}
