public class Main {
    public static void main(String[] args) {

        //Домашнее задание 1.7
        //Задание 1
        System.out.println("Домашнее задание 1.7");
        System.out.println("Задание 1");

        String firstName = "Ivan";
        String middleName = "Ivanovich";
        String lastName = "Ivanov";
        String fullName = lastName + " " + firstName + " " + middleName;

        System.out.println("ФИО сотрудника — " + fullName + ".");

        //Задание 2
        System.out.println("Задание 2");

        String FullName = "Ivanov Ivan Ivanovich";
        String upperFullName = FullName.toUpperCase();

        System.out.println("Данные ФИО сотрудника для заполнения отчета — " + upperFullName);

        //Задание 3
        System.out.println("Задание 3");

        String fullName2 = "Иванов Семён Семёнович";
        fullName2 = fullName2.replace("ё", "е");

        System.out.println("Данные ФИО сотрудника — " + fullName2);

    }
}