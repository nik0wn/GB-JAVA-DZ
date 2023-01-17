package task2;

public class Str {
    public static boolean entry(String str, String str1){
        // Напишите программу, чтобы найти вхождение в строке (содержащей все символы другой строки).
        return str.contains(str1);
    }
    public static boolean entryReverse(String str, String str1){
        // Напишите программу, чтобы проверить, являются ли две
        // данные строки вращением друг друга (вхождение в обратном порядке).
        return str.contains(new StringBuilder(str1).reverse().toString());
    }

    public static StringBuilder expressionString(int number, char sigh, int number1){
        // Дано два числа, например 3 и 56, необходимо составить следующие строки:
        // 3 + 56 = 59 3 – 56 = -53 3 * 56 = 168 Используем метод StringBuilder.append().
        StringBuilder stringBuilder = new StringBuilder();
        if (sigh == '+'){
            stringBuilder.append(String.valueOf(number) + " + " + String.valueOf(number1) + " = " +
                    String.valueOf(number + number1));
            return stringBuilder;
        } else if (sigh == '-') {
            stringBuilder.append(String.valueOf(number) + " - " + String.valueOf(number1) + " = " +
                    String.valueOf(number - number1));
            return stringBuilder;
        } else if (sigh == '*') {
            stringBuilder.append(String.valueOf(number) + " * " + String.valueOf(number1) + " = " +
                    String.valueOf(number * number1));
        } else if (sigh == '/') {
            if (number == 0 || number1 == 0){
               return stringBuilder.append("На ноль делить нельзя");
            } else {
                stringBuilder.append(String.valueOf(number) + " / " + String.valueOf(number1) + " = " +
                        String.valueOf(number / number1));
            }
        } else {
            stringBuilder.append("Не верный знак");
        }
        return stringBuilder;
    }

    public static StringBuilder replacementEqual(String str){
        // Замените символ “=” на слово “равно”. Используйте методы
        // StringBuilder.insert(y),StringBuilder.deleteCharAt().
        StringBuilder stringBuilder = new StringBuilder(str);
        int temp = stringBuilder.indexOf("=");
        stringBuilder.deleteCharAt(temp);
        stringBuilder.insert(temp,"равно");
        return stringBuilder;
    }
    public static StringBuilder replacementEqual1(String str){
        // *Замените символ “=” на слово “равно”. Используйте методы StringBuilder.replace().
        StringBuilder stringBuilder = new StringBuilder(str);
        return stringBuilder.replace(stringBuilder.indexOf("="),stringBuilder.indexOf("=") + 1,"равно");
    }
    public static String replacementEqual2(String str){
        return str.replace("=", "равно");
    }
}
