package task1;

public class work1 {
    public static void main(String[] args) {
        //task1
        System.out.println("Hello world!");

        System.out.println("Задание 2");
        //task2
        int x = 5;
        System.out.println(x);

        System.out.println("Задание 3");

        //task 3

        int x1 = ++x; //увеличить x=5 на 1
        System.out.println("x = "+x+" "+"x1 ="+x1);

        int x2 = x1++; //увеличили x1=5 на 1
        System.out.println("x1 = "+x1+" "+"x2 ="+x2);

        System.out.println();

        System.out.println("Задние 4");

        //task4
        int a = 1; //через третью переменную
        int b = 5;
        int c;
        c = b;
        b = a;
        a = c;

        System.out.println("b = "+b+" "+"a = "+a);

        a=b+a; // через арифм.действия
        b=a-b;
        a=a-b;
        System.out.println("b = "+b+" "+"a = "+a);

        //task 5

    }
}
