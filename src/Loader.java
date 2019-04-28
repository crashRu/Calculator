import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Loader {
    static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        int a = getInt();
        String sign = getSign();
        int b = getInt();
        System.out.println("ваш ответ " + Decision(a,b,sign) );
    }

    private static int getInt() throws IOException {
        int answer ;
        int temporaryAnswer;
        while (true) {
            System.out.println("Веедите пожалуйста число, оно должно быть целым и от 0 до 9");
            temporaryAnswer = reader.read();
            if ( temporaryAnswer >= 0 &&  temporaryAnswer < 100) {
                answer = temporaryAnswer;
                break;
            } else {
                System.out.println("Вы допустили ошибку, пожалуйста введите число верно");
            }
        }
        return answer;
    }

    public static String getSign() throws IOException {
        String sign;
        String temporarySign;
        while (true) {
            System.out.println("Введите знак:");
            temporarySign = reader.readLine().trim();
            if (temporarySign.equals("+") || temporarySign.equals("-") || temporarySign.equals("*") || temporarySign.equals("/")) {
                sign = temporarySign;
                break;
            } else {
                System.out.println("Вы ввели неверный знак");
            }
        }
        return sign;
    }

    private static int Decision(int a, int b, String sign) {
        int result = 0;

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
        return  result;
    }
}

