
public class ExpensesManager {
    double[] expenses = new double[7]; // массив трат
    double moneyBeforeSalary;
    double expense;


//внесение трат в массив и подсчёт остатков средств
    double saveExpense(int day, double moneyBeforeSalar, double expens) {

        expense=expens;
        moneyBeforeSalary=moneyBeforeSalar;

        day=day-1;
        moneyBeforeSalary = moneyBeforeSalary- expense;
        expenses[day] = expense + expenses[day];
        System.out.println("Значение сохранено! Ваш текущий баланс в рублях: " + moneyBeforeSalary);
        if (moneyBeforeSalary < 1000) {
            System.out.println("На вашем счету осталось совсем немного. Стоит начать экономить!");
        }
        return moneyBeforeSalary;
    }
    //печать массива трат
     void printAllExpenses() {
        for (int i = 0; i < expenses.length; i++) {
            System.out.println("День " + (i + 1) + ". Потрачено " + expenses[i] + " рублей");
        }
    }
//поиск максимальной траты
    double findMaxExpense() {
        double maxExpense = 0;
        for (double expens : expenses) {
            if (expens > maxExpense) {
                maxExpense = expens;
            }
        }
        return maxExpense;
    }




    }