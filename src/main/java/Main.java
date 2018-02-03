import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {

    }


    public static boolean chekEmail(String emails) {
        return !emails.toLowerCase().matches("^(?:[^@]+(?:@gmail.com|@yandex.ru)?(?:,|$))*$");
    }

    public static boolean chekValue(String values) {
        return !values.toLowerCase().matches("^(?:[1][4-9][5-9]\\d)|(?:[2-9]\\d{3})|(?:[1][4][5-9]\\d)$");
    }

    public static boolean chekPrice(String price) {
        return !price.toLowerCase().matches("^(?:100|\\d{2}(\\d)+)(?:\\.[0-9]{1,2})?$");
    }

    public static boolean checkLogs(String logs) {

       // Matcher m = Pattern.compile("([a-z]+)").matcher(log);
            return !logs.toLowerCase().matches("^(?:[^@]+(?:@gmail.com|@intersog.com)?(?:,|$))*$");
        }

    }



//    String phoneNumber = "+380975156900";
//
//    Matcher m = Pattern.compile(".{3}(.{3})").matcher(phoneNumber); // first 3 symbols and second 3 symbols
//        if(m.find()) {
//                System.out.println(m.group(0));
//                } else {
//                System.out.println("No carrier code in phone number.");
//                }

