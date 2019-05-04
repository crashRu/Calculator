import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Loader {
    static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
   public static String expression;
    public static String sign;
    public static  String temporarySign;
    public static void main(String[] args) throws IOException {
        System.out.println("Введите ваш привмер");
        expression = reader.readLine().trim();
        int numberOne = NumberConverter.NumberConverter( expression.substring(0, expression.indexOf(' ')).trim());
        int numberTwo = NumberConverter.NumberConverter(expression.substring(expression.lastIndexOf(' ')).trim());
        temporarySign = expression.substring(expression.indexOf(' '), expression.lastIndexOf(' ')).trim();
        if ( numberOne > 0 &&  numberOne <= 10 && numberTwo > 0 &&  numberTwo <= 10 ) {

        } else {
            System.out.println("Вы допустили ошибку, пожалуйста введите число верно");
        }
        if (temporarySign.equals("+") || temporarySign.equals("-") || temporarySign.equals("*") || temporarySign.equals("/")) {
            sign = temporarySign;
        } else {
            System.out.println("Вы ввели неверный знак");

        }
        System.out.println(Decision(numberOne,numberTwo, sign ));
    }

    private static int Decision(int a, int b, String sign) {
        int result = 0;
        if(NumberConverter.count == 1) {
            System.out.println("Можно производить вычисления только над орабскими или римскими цифрами");
            System.exit(0);
        }else {
            switch (sign) {
                case "+":
                    result = a + b;
                    break;
                case "-":
                    result = a - b;
                    break;
                case "*":
                    result = a * b;
                    break;
                case "/":
                    result = a / b;
                    break;
                default:
                    System.out.println("Ошибка в вычислении");
                    break;
            }
        }
        return  result;
    }
}