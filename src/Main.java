import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int a = 10;
        int c = 10;
        int d = 10;

        int sum = a + c;
        int sub = a - c;
        int mul = a * c;
        int div = a / c;

        System.out.println(sum);
        System.out.println(sub);
        System.out.println(mul);
        System.out.println(div);

        double a1 = 10.2;
        double a2 = 15.3;
        double sum1 = a1 + a2;
        System.out.println(sum1);

        float a3 = 10.2f;
        float a4 = 15.3f;
        float sum3 = a3 + a4;
        System.out.println(sum3);

        char digit = '1';
        String digits = "1";

        String str1 = "Hello";
        String str2 = "World";
        String str3 = str1 + " " + str2;
        System.out.println(a1 + str3);

        int calculation = (1 + 2) * 3 * (4 + 8);
        System.out.println(calculation);

        int result = 1 + 2 / (3 * 4) + 6;
        System.out.println(result);


        System.out.print("Введите возраст ");
        Scanner scanner = new Scanner(System.in);

        int age = scanner.nextInt();

        if (age >= 18 && age < 25) {

            System.out.println("Предъяви документы, продам");
        } else if (age >= 25 && age < 65) {

            System.out.println("Продать можно");
        } else if (age >= 65 && age < 100) {
            System.out.println("Не рекомендуем");
        } else {
            System.out.println("Не продаем");
        }


    }
}