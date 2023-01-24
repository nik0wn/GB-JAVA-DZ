package task4;

import task2.Str;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

public class FileBD {
    public void newFile(){
        FileWriter fileWriter = null;
        try {
            fileWriter = new FileWriter("bd.sql");
            fileWriter.append("Иван Иванов Иванович 32 М\n");
            fileWriter.append("Крюков Кирилл Даниилович 22 М\n");
            fileWriter.append("Колесникова Елизавета Арсентьевна 19 Ж\n");
            fileWriter.append("Седов Матвей Ярославович 21 М\n");
            fileWriter.append("Соловьева Елизавета Ивановна 18 Ж\n");
            fileWriter.flush();
            fileWriter.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    public String fileData(String nameFile){
        FileReader fileReader = null;
        String txt = "";
        try {
            fileReader = new FileReader(nameFile);
            while (fileReader.ready()){
                txt += (char) fileReader.read();
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return txt;
    }
}