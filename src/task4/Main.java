package task4;
public class Main {
    public static void main(String[] args) {
       FileBD fileBD = new FileBD();
       fileBD.newFile();
       People rab = new People(fileBD.fileData("bd.sql"));
       rab.printPeople();
       System.out.println();
       rab.printPeopleSort();
    }
}
