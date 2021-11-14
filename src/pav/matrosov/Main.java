package pav.matrosov;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Functions calc = new Functions();
        Scanner s = new Scanner(System.in);
        System.out.println("Введите два числа");
        double a = s.nextDouble();
        double b = s.nextDouble();
        System.out.println("Введите арифметиское действие (‘+’, ‘-’, ‘*’ или ‘/’)");
        switch (s.next().charAt(0)) {
            case '+':
                System.out.println(calc.sum(a, b));
                break;
            case '-':
                System.out.println(calc.subtraction(a, b));
                break;
            case '*':
                System.out.println(calc.multiplication(a, b));
                break;
            case '/':
                if (b == 0) {
                    System.out.println("На ноль делить нельзя!");
                    break;
                }
                System.out.println(calc.div(a, b));
                break;
            default:
                System.out.println("Вы ввели некорректный оператор");
                break;
        }

    }

}
