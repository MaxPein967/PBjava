import java.text.SimpleDateFormat;

public class Checking {
    public static boolean checkString(String line) {
        try {
            Integer.valueOf(line);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
    public static void checkAmount(String[] human_info) {
        if (human_info.length < 6) throw new AmountException(-1);
        if (human_info.length > 6) throw new AmountException(-3);
    }
    public static boolean checkDate(String date) {
        SimpleDateFormat myFormat = new SimpleDateFormat("dd.MM.yyyy");
        myFormat.setLenient(false);
        try {
            myFormat.parse(date);
            return true;
        } catch (Exception e) {
            return false;
        }
    }
}
