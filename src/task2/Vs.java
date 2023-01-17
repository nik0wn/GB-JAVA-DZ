package task2;

import static task2.Str.expressionString;

public class Vs {
    // **Сравнить время выполнения пунка 6 со строкой содержащей 10000 символов "=" средствами String и StringBuilder.
    public static void stringVS(int col){

        long start = System.currentTimeMillis();
        for (int i = 0; i < col; i++) {
            Str.replacementEqual2(expressionString(3,'+',56).toString());
        }
        long finish = System.currentTimeMillis();
        System.out.println(finish - start + " мс");
    }
    public static void stringSbVS(int col){
        long start = System.currentTimeMillis();
        for (int i = 0; i < col; i++) {
            Str.replacementEqual1(expressionString(3,'+',56).toString());
        }
        long finish = System.currentTimeMillis();
        System.out.println(finish - start + " мс");
    }
}
