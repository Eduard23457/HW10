public class Main {
    public static void main(String[] args) {

        System.out.println("Задача 1");

        String firstName = "Ivan";
        String middleName = "Ivanovich";
        String lastName = "Ivanov";
        String fullName = "Ivanov Ivan Ivanovich";
        System.out.println("Ф. И. О. сотрудника — " + fullName);

        System.out.println("Задача 2");

        String fulName = "Ivanov Ivan Ivanovich";
        System.out.println(fulName.toUpperCase());

        System.out.println("Задача 3");

        String fullName2 = "Иванов Семён Семёнович";
        fullName2 = fullName2.replace("ё" , "е");
        System.out.println("Данные Ф. И. О. сотрудника — " + fullName2);

    }
}