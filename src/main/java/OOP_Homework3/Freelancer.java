package OOP_Homework3;

public class Freelancer extends Employee{
    int wrkHours;

    public Freelancer(String surname, String name, int age, double salary, int wrkHours) {
        super(surname, name, age, salary);
        this.wrkHours = wrkHours;
    }

    @Override
    public double calculateSalary() {
        return wrkHours * salary;
    }

    @Override
    public String toString() {
        return String.format("%s %s; Возраст: %d; Фрилансер; Почасовая ставка: %.2f (руб.); Количество отработанных часов: %d; Итоговая месячная оплата: %f",
                surname, name, age, salary, wrkHours, calculateSalary());
    }
}
