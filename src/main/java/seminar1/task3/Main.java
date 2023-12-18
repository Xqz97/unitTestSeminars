package seminar1.task3;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Main {
    public static void main(String[] args) {
        happyNY();
    }
    public static void happyNY() {
        Calendar calendar = Calendar.getInstance();
        DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd");
        String currentDateTime = dateFormat.format(calendar.getTime());
        String newYearDate = "2024/01/01";

        assert currentDateTime.compareTo(newYearDate) > 0 : "Еще не наступил новый год!";
        System.out.println("С новым годом!");
    }
}
