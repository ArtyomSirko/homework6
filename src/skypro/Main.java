package skypro;

import java.util.Arrays;

public class Main {
    int[] arr = generateRandomArray();

    public static void main(String[] args) {

        //Задание 1

        int[] arr = generateRandomArray();

        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }

        System.out.println(sum);
        //здание 2

        int spendingMax = 0;
        int spendingMin = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > spendingMax) {
                spendingMax = arr[i];
            }
        }
        System.out.println("максимальная трата" + " " + spendingMax);

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < spendingMax) {
                spendingMin = arr[i];
            }
        }

        //### Задание 3

        double midle = 0;
        for (int i = 0; i < arr.length; i++) {
            midle += arr[i] /arr.length;
        }

        System.out.println("Средняя сумма трат составила" + " "+ midle + " рублей");
//задание 4

        char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        System.out.println("");
        char N;
        int n=reverseFullName.length;
        for (int i = 0; i < n/2; i++) {
            N=reverseFullName[n-i-1];
            reverseFullName[n-i-1]=reverseFullName[i];
            reverseFullName[i]=N;

        }
        for (int i = 0; i < reverseFullName.length; i++) {
            System.out.print(reverseFullName[i]);
        }

    }



    public static int[] generateRandomArray() {


        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }


}






