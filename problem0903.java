import java.util.Date;

public class problem0903 {
    public static void main(String[] args) {
        long time = 10000;
        Date date = new Date(time);
        printDate(time, date);
        time *= 10;

        for(int i = 0; i < 7; i++) {
            date.setTime(time);
            printDate(time, date);
            time *= 10;
        }
    }
    public static void printDate(long time, Date date) {

        System.out.println(date.toString());
    }
}