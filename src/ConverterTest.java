public class ConverterTest {

    public static void main(String[] args) {

        CalendarConverter dayConverter = new CalendarConverter();

        for(int i = 1; i <= 7; i++) {
            String day = dayConverter.convertDayToString(i);
            System.out.printf("%d day of the week is %s\n", i, day);
        }

    }
}
