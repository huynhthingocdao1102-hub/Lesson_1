import java.util.Scanner;

public class ReadNumberSimple {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number (0 - 999): ");
        int number = scanner.nextInt();

        // nếu ngoài giới hạn thì báo lỗi
        if (number < 0 || number > 999) {
            System.out.println("out of ability");
            return;
        }

        // đọc số
        if (number < 10) {
            System.out.println(readOneDigit(number));
        } else if (number < 20) {
            System.out.println(readTeen(number));
        } else if (number < 100) {
            System.out.println(readTwoDigits(number));
        } else {
            System.out.println(readThreeDigits(number));
        }
    }

    // Đọc số 1 chữ số
    public static String readOneDigit(int n) {
        switch (n) {
            case 0:
                return "zero";
            case 1:
                return "one";
            case 2:
                return "two";
            case 3:
                return "three";
            case 4:
                return "four";
            case 5:
                return "five";
            case 6:
                return "six";
            case 7:
                return "seven";
            case 8:
                return "eight";
            case 9:
                return "nine";
        }
        return "";
    }

    // Đọc số từ 10 đến 19
    public static String readTeen(int n) {
        switch (n) {
            case 10:
                return "ten";
            case 11:
                return "eleven";
            case 12:
                return "twelve";
            case 13:
                return "thirteen";
            case 14:
                return "fourteen";
            case 15:
                return "fifteen";
            case 16:
                return "sixteen";
            case 17:
                return "seventeen";
            case 18:
                return "eighteen";
            case 19:
                return "nineteen";
        }
        return "";
    }

    // Đọc số từ 20 đến 99
    public static String readTwoDigits(int n) {
        int tens = n / 10;     // số hàng chục
        int ones = n % 10;     // số hàng đơn vị

        String tensText = "";
        switch (tens) {
            case 2:
                tensText = "twenty";
                break;
            case 3:
                tensText = "thirty";
                break;
            case 4:
                tensText = "forty";
                break;
            case 5:
                tensText = "fifty";
                break;
            case 6:
                tensText = "sixty";
                break;
            case 7:
                tensText = "seventy";
                break;
            case 8:
                tensText = "eighty";
                break;
            case 9:
                tensText = "ninety";
                break;
        }

        if (ones == 0) return tensText;               // ví dụ: 20, 40, 70
        return tensText + " " + readOneDigit(ones);   // ví dụ: 21 = twenty one
    }

    // Đọc số 100 đến 999
    public static String readThreeDigits(int n) {
        int hundreds = n / 100;   // hàng trăm
        int rest = n % 100;       // phần còn lại

        String hundredText = readOneDigit(hundreds) + " hundred";

        if (rest == 0) return hundredText;  // ví dụ: 200

        // thêm "and"
        if (rest < 10) return hundredText + " and " + readOneDigit(rest);
        if (rest < 20) return hundredText + " and " + readTeen(rest);

        return hundredText + " and " + readTwoDigits(rest);
    }
}
