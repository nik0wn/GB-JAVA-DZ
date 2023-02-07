package task6;

public class Main {
    public static void main(String[] args) {
        MyHashSet myHashSet = new MyHashSet();
        myHashSet.add(900);
        myHashSet.add(300);
        myHashSet.add(300);
        myHashSet.add(600);
        System.out.println(myHashSet.getString());
    }
}
