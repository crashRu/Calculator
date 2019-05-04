public class NumberConverter {
    static int count;
    public static int  NumberConverter(String subStrOne) {
        int number = 0;
        switch (subStrOne) {
            case "I":
                number = 1;
                count++;
                break;
            case "II":
                number = 2;
                count++;
                break;
            case "III":
                number = 3;
                count++;
                break;
            case "IV":
                number = 4;
                count++;
                break;
            case "V":
                number = 5;
                count++;
                break;
            case "VI":
                number = 6;
                count++;
                break;
            case "VII":
                number = 7;
                count++;
                break;
            case ("VIII"):
                number = 8;
                count++;
                break;
            case "IX":
                number = 9;
                count++;
                break;
            case "X":
                number = 10;
                count++;
                break;
             default:
             try {
                 number = Integer.parseInt(subStrOne);
            } catch (NumberFormatException e ) {
                System.out.println("Вы допустили ошибку в римских цифрах");
                System.exit(0);
            }
        }
        return number;

    }

}
