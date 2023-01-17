package task1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        // task1
        // Выбросить случайное целое число в диапазоне от 0 до 2000 и сохранить в i
        int i = new Random().nextInt(0,2000);
        System.out.println(String.format("Случайно число = %s", i));

        // task2
        // Посчитать и сохранить в n номер старшего значащего бита выпавшего числа
        int task2 = i;
        int n = 0;
        for (int j = 0; task2 > 0; j++){
            task2 >>= 1;
            n = j;
        }
        System.out.println(String.format("Номер сташего бита = %s",n));

        // task3
        // Найти все кратные n числа в диапазоне от i до Short.MAX_VALUE сохранить в массив m1
        ArrayList <Integer> m1 = new ArrayList<>();
        for (int j= i; j < Short.MAX_VALUE; j++) {
            if (j % n == 0){
                m1.add(j);
            }
        }
        System.out.println(m1);
        // task 4
        //  Найти все некратные n числа в диапазоне от Short.MIN_VALUE до i и сохранить в массив m2
        ArrayList <Integer> m2 = new ArrayList<>();
        for (int j = Short.MIN_VALUE; j < i; j++) {
            if (j % n == 0){
                m2.add(j);
            }
        }
        System.out.println(m2);
    }
    }