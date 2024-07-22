//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("Задание 1\n");

        byte clientOS = 0;
        switch (clientOS){
            case 0:
                System.out.println("Установите версию приложения для iOS по ссылке\n");
                break;
            case 1:
                System.out.println("Установите версию приложения для Android по ссылке\n");
                break;
            default:
                System.out.println("Неверное значение\n");
        }

        System.out.println("Задание 2\n");

        int clientDeviceYear = 2015;
        clientOS = 1;
        if(clientOS == 0 && clientDeviceYear < 2015){
            System.out.println("Установите облегченную версию приложения для iOS по ссылке\n");
        }else if(clientOS == 0 && clientDeviceYear >= 2015){
            System.out.println("Установите версию приложения для iOS по ссылке\n");
        }else if(clientOS == 1 && clientDeviceYear < 2015){
            System.out.println("Установите облегченную версию приложения для Android по ссылке\n");
        }else if(clientOS == 1 && clientDeviceYear >= 2015){
            System.out.println("Установите версию приложения для Android по ссылке\n");
        }

        System.out.println("Задание 3\n");

        int year = 2021;
        boolean leapYear = ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) && year > 1584;
        if(leapYear){
            System.out.println(year + " год является високосным.\n");
        }
        else{
            System.out.println(year + " год не является високосным.\n");
        }

        System.out.println("Задание 4\n");

        int deliveryDistance = 95;
        if(deliveryDistance <= 20){
            System.out.println("Потребуется дней: 1.\n");
        }else if(deliveryDistance <= 60){
            System.out.println("Потребуется дней: 2.\n");
        }else if(deliveryDistance <= 100){
            System.out.println("Потребуется дней: 3.\n");
        }else {
            System.out.println("Доставки нет.\n");
        }

        System.out.println("Задание 5\n");

        int monthNumber = 12;
        switch (monthNumber){
            case 12, 1, 2:
                System.out.println("Зима.\n");
                break;
            case 3, 4, 5:
                System.out.println("Весна.\n");
                break;
            case 6, 7 ,8:
                System.out.println("Лето.\n");
                break;
            case 9, 10, 11:
                System.out.println("Осень.\n");
                break;
            default:
                System.out.println("Неправильный номер месяца.\n");
        }
    }
}