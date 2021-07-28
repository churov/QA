package main.java.lesson1;

public class MainClass {
    public static void main(String[] args) {
        printThreeWords();
        checkSumSign();
        printColor();
        compareNumbers();
    }


    public static void printThreeWords() {
        System.out.println("Orange \nBanana \nApple");
    }


    public static void checkSumSign() {
        int a = 0;
        int b = -6;
        int c = a+b;
        if (c>=0){
            System.out.println("Сумма положительная");
        }
        else {
            System.out.println("Сумма отрицательная");
        }
    }


    public static void printColor () {
    int value = 665;
    if (value <=0) {
            System.out.println("Красный");
        }
    if (value >0 && value <=100) {
            System.out.println("Желтый");
        }
    if (value >100) {
            System.out.println("Зеленый");
        }
    }

    public static void compareNumbers() {
        int a = 9;
        int b = 8;
        if (a>=b){
            System.out.println("a >= b");
        }
        else{
            System.out.println("a < b");
        }

    }


}