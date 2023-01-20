package task3;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        ArrayList <Integer> array1 = new ArrayList<>();
        ArrayList <Integer> array2 = new ArrayList<>();
        for (int i = 0; i < 20; i++) {
            array1.add(new Random().nextInt(30));
            array2.add(new Random().nextInt(30));
        }
        ArrayList <Integer> temp = new ArrayList<>();
        for (int i = 0; i < array1.size(); i++) {
            for (int j = 0; j < array2.size(); j++) {
                if(array1.get(i) == array2.get(j)){
                    temp.add(array1.get(i));
                    continue;
                }
            }
        }
        array1 = temp;
        puzyr(array1);
        System.out.println(array1);
        System.out.println(array2);
    }
    public static ArrayList <Integer> puzyr (ArrayList <Integer> arrayList){
        Integer temp;
        for (int i = 1; i < arrayList.size(); i++)
            for (int j = 0; j < arrayList.size() - i; j++)
                if (arrayList.get(j) > arrayList.get(j++)){
                    temp = arrayList.get(j);
                    arrayList.set(j, arrayList.get(j++));
                    arrayList.set(j++,temp);
                }
        return arrayList;
            }
        }
