package task5;
import java.util.Arrays;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        HashMap <Integer,String> data= new HashMap<>();

        data.put(1,"Иванов Иван Иванович 32 м");
        data.put(2,"Крюков Кирилл Даниилович 22 м");
        data.put(3,"Колесникова Елизавета Арсентьевна 19 ж");
        data.put(4,"Седов Матвей Ярославович 21 м");
        data.put(5,"Соловьева Елизавета Ивановна 18 ж");

        toUpString(data);
        printString(data);


    }
    public static HashMap<Integer, String> toUpString(HashMap<Integer, String> data){
        for (var pair: data.entrySet()) {
            String [] str = pair.getValue().split(" ");
            Integer key = pair.getKey();
            for (int i = 0; i < str.length; i++) {
                if(str[i].equals("м") || str[i].equals("ж")){
                    str[i] =  str[i].toUpperCase();
                }
            }
            data.replace(key, String.join(" ",str));
        }
        return data;
    }
    public static void printString(HashMap<Integer, String> data){
        for (var pair: data.entrySet()) {
          String [] str = pair.getValue().split(" ");
          System.out.println(str[0] + " " + str[1].charAt(0) + "." + str[2].charAt(0) + " " + str[3] + " "
          + str[4]);
        }
    }
}
