package task4;

import java.util.ArrayList;
import java.util.LinkedList;

public class People {
    private ArrayList<String> family = new ArrayList<>();
    private ArrayList<String> name = new ArrayList<>();
    private ArrayList<String> soname = new ArrayList<>();
    private ArrayList<Integer> age = new ArrayList<>();
    private ArrayList<Boolean> gender = new ArrayList<>();
    private LinkedList<Integer> index = new LinkedList<>();

    public People(String people) {
        String[] arrayPeople = people.split("\n");
        for (int i = 0; i < arrayPeople.length; i++) {
            String[] arrayPerson = arrayPeople[i].split(" ");
            family.add(arrayPerson[0]);
            name.add(arrayPerson[1]);
            soname.add(arrayPerson[2]);
            age.add(Integer.parseInt(arrayPerson[3]));
            gender.add(arrayPerson[4].equals("Ж") ? false : true);
            index.add(i);
        }
    }

    public void printPeople() {
        for (int i = 0; i < index.size(); i++) {
            System.out.println(family.get(i) + " " + name.get(i).charAt(0) + "." + soname.get(i).charAt(0) +
                    ". " + age.get(i) + " " + (!gender.get(i)  ? "Ж" : "М"));
        }
    }
    public void printPeopleSort() {
        int temp = 0;
        for (int i = 0; i < index.size(); i++) {
            for (int j = 0; j < index.size() - 1; j++) {
                if (age.get(index.get(j)) > age.get(index.get(j + 1))){
                    temp = index.get(j);
                    index.set(j,index.get(j + 1));
                    index.set(j + 1, temp);
                }
            }
        }
        for (int i = 0; i < index.size(); i++) {
            System.out.println(family.get(index.get(i)) + " " + name.get(index.get(i)).charAt(0) + "." + soname.get(index.get(i)).charAt(0) +
                    ". " + age.get(index.get(i)) + " " + (!gender.get(index.get(i))  ? "Ж" : "М"));
        }
    }
}