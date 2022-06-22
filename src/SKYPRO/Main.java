package SKYPRO;

import java.util.Arrays;

public class Main {

    int[] arr = generateRandomArray();

    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }
    public static void main(String[] args) {

        //Первым делом бухгалтеры попросили посчитать сумму всех выплат за месяц.
        //
        //Нужно написать программу, которая решит эту задачу, и вывести в консоль результат
        //
        //в формате: «Сумма трат за месяц составила … рублей».
        //
        //- Критерии оценки
        //
        //    – Вычисления выполнены корректно.
        //
        //    – Результат вычислений выведен в консоль.
        //
        //    – Код написан без ошибок.
        //
        //    – Соблюдены все условия задания.
        int sum = 0;
        for (int i = 0; i < generateRandomArray().length; i++) {
            sum += generateRandomArray()[i];
        }

        System.out.println(sum);
        //Следующая задача — найти минимальную и максимальную трату за день.
        //
        //Нужно написать программу, которая решит эту задачу, и вывести в консоль результат
        //
        //в формате: «Минимальная сумма трат за день составила … рублей. Максимальная сумма трат за день составила … рублей».
        //
        //- Критерии оценки
        //
        //    – Минимальное значение найдено корректно.
        //
        //    – Максимально значение найдено корректно.
        //
        //    – При изменении данных массива код работает корректно и выводит верный результат.
        //
        //    – Результат программы выведен в консоль согласно условию задания.
int spendingMax=-1;
        for (int j=0;j< generateRandomArray().length;j++) {
            if (generateRandomArray()[j] > spendingMax) {
                spendingMax = generateRandomArray()[j];

            }
        }
            System.out.println("максимальная трата"+" " + spendingMax);
int spendingMin=-1;
        for (int k = 0; k < generateRandomArray().length; k++) {
            if (generateRandomArray()[k]>spendingMin) {
                spendingMin=generateRandomArray()[k];
            }
        }
        System.out.println("минимальная трата" + " " + spendingMin);
    int [] z={11,33,55,22,80,10};
        for (int i = 0; i < z.length; i++) {
            if (z[i]-1==i) {
                System.out.println(z[i]);
                break;
            }
            System.out.print(z[i]+" ");
        }
        int max=0;
        for (int i = 0; i < z.length; i++) {
            if (z[i]>max) {
                max=z[i];
            }
        }
        System.out.println(" ");
        System.out.println(max);
    }



}



