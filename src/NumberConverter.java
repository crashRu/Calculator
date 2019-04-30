public class NumberConverter {
    static int count;
    public static int  NumberConverter(String symbol) {
        int number = 0;
        if (symbol.equals("I")) {
            number = 1;
            count++;
        }else  if (symbol.equals("II")) {
            number = 2;
            count++;
        }else  if (symbol.equals("III")) {
            number = 3;
            count++;
        }else  if (symbol.equals("IV")) {
            number = 4;
            count++;
        }else  if (symbol.equals("V")) {
            number = 5;
            count++;
        }else  if (symbol.equals("VI")) {
            number = 6;
            count++;
        }else  if (symbol.equals("VII")) {
            number = 7;
            count++;
        }else  if (symbol.equals("VIII")) {
            number = 8;
            count++;
        }else  if (symbol.equals("IX")) {
            number = 9;
            count++;
        }else  if (symbol.equals("X")) {
            number = 10;
            count++;
        }else {
            try {
                number = Integer.parseInt(symbol);
            } catch (NumberFormatException e ) {
                System.out.println("Вы допустили ошибку в римских цифрах");
                System.exit(0);
            }
        }

        return number;
    }

}
