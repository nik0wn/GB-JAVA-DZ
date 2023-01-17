package task2;

import static task2.Str.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(entry("Hello java", "Hello"));
        System.out.println(entryReverse("tenet", "tenet"));
        System.out.println(expressionString(3,'+',56));
        System.out.println(expressionString(3,'-',56));
        System.out.println(expressionString(3,'*',56));
        System.out.println(expressionString(3,'/',56));
        System.out.println(replacementEqual(expressionString(3,'+',56).toString()));
        System.out.println(replacementEqual1(expressionString(3,'+',56).toString()));
        Vs.stringVS(10000);
        Vs.stringSbVS(10000);
    }

}
