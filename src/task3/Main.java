package task3;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Объявить два списка список ArrayList, в каждый добавить по 20 случайных чисел.
        // Удалить из первого списка элементы отсутствующие во втором списке.
        ArrayList <Integer> array1 = new ArrayList<>();
        ArrayList <Integer> array2 = new ArrayList<>();
        for (int i = 0; i < 20; i++) {
            array1.add(new Random().nextInt(30));
            array2.add(new Random().nextInt(30));
        }
        ArrayList <Integer> temp = new ArrayList<>();
        for (int i = 0; i < array1.size(); i++) {
            for (int j = 0; j < array2.size(); j++) {
                if(array1.get(i).equals(array2.get(j)) ){
                    temp.add(array1.get(i));
                    continue;
                }
            }
        }
        array1 = temp;
       //  Collections.sort(array1); Отсортировать первый список методом sort класса Collections.
        puz(array1);
        array2.sort(Comparator.reverseOrder());
        System.out.println(array1);
        System.out.println(array2);
    }
    public static ArrayList <Integer> puz (ArrayList <Integer> arrayList){
        Integer temp = 0;
        for (int i = 0; i < arrayList.size(); i++) {
            for (int j = 0; j < arrayList.size() - 1; j++) {
                if (arrayList.get(j) > arrayList.get(j + 1)){
                    temp = arrayList.get(j);
                    arrayList.set(j, arrayList.get(j + 1));
                    arrayList.set(j + 1, temp);
                }
            }
        }
        return arrayList;
            }
        }
