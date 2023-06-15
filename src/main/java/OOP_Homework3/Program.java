package OOP_Homework3;

import java.util.Arrays;
import java.util.Random;

public class Program {

    static Random random = new Random();

    static Employee generateEmployee(){
        String[] names = new String[] { "Анатолий", "Глеб", "Клим", "Мартин", "Лазарь", "Владлен", "Клим", "Панкратий", "Рубен", "Герман" };
        String[] surnames = new String[] { "Григорьев", "Фокин", "Шестаков", "Хохлов", "Шубин", "Бирюков", "Копылов", "Горбунов", "Лыткин", "Соколов" };

        int age = random.nextInt(18, 66);
        int salary = random.nextInt(20000, 80000);
        int freelanceSalary = random.nextInt(2000,5000);
        int wrkHours = random.nextInt(1,9);

        int typeOfWorker = random.nextInt(0,2);
        if(typeOfWorker == 0){
            return new Worker(surnames[random.nextInt(2)], names[random.nextInt(6)], age, salary);
        }
        else {
            return new Freelancer(surnames[random.nextInt(2)], names[random.nextInt(6)], age, freelanceSalary, wrkHours);
        }
    }

    public static void main(String[] args) {

        Employee[] employees = new Employee[10];
        for (int i = 0; i < employees.length; i++) {
            employees[i] = generateEmployee();
        }

        SalaryComparator salaryComparator = new SalaryComparator();
        Arrays.sort(employees, salaryComparator);

        for (Employee employee : employees){
            System.out.println(employee);
        }

        System.out.println();

        Arrays.sort(employees);

        for (Employee employee : employees){
            System.out.println(employee);
        }

        System.out.println();

        AgeComparator ageComparator = new AgeComparator();
        Arrays.sort(employees, ageComparator);

        for (Employee employee : employees){
            System.out.println(employee);
        }


    }
}
