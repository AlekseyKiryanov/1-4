package vsu.kiryanovao.task0104;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int n = readNaturalValueFromConsole("n");
        int i = 0;
        int j = 100;
        while (j<999 && i<n){
            if (isGood(j)){
                i++;
            }
            j++;
        }
        if (i != n) {
            System.out.print("0");
        } else{
            System.out.print(j-1);
        }
    }

    public static boolean isGood(int a) {
        int rez = 0;
        if (a / 100 == a % 10) {
            rez++;
        }
        if (a / 100 == (a % 100) / 10) {
            rez++;
        }
        if ((a % 100) / 10 == a % 10) {
            rez++;
        }
        return (rez == 1);
    }

    public static int readNaturalValueFromConsole(String varName) {
        Scanner scanner = new Scanner(System.in);
        int a = 0;
        while (true) {
            System.out.printf("Введите натуральное число %s = ", varName);
            try {
                String line = scanner.nextLine();
                a = Integer.parseInt(line);
                if (a > 0) {
                    return a;
                } else {
                    System.out.println("Введено некореектное значение.");
                }
            } catch (Exception e) {
                System.out.println("Введено некореектное значение.");
            }
        }
    }

}
