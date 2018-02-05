public class CalendarConverter {

    static final int MONDAY = 1;
    static final int TUESDAY = 2;
    static final int WEDNESDAY = 3;
    static final int THURSDAY = 4;
    static final int FRIDAY = 5;
    static final int SATURDAY = 6;
    static final int SUNDAY =7;

    String convertDayToString(int dayNumber) {
        String dayToString = null;

        switch (dayNumber) {
            case MONDAY:
                dayToString = "Monday";
                break;
            case TUESDAY:
                dayToString = "Tuesday";
                break;
            case WEDNESDAY:
                dayToString = "Wednesday";
                break;
            case THURSDAY:
                dayToString = "Thursday";
                break;
            case FRIDAY:
                dayToString = "Friday";
                break;
            case SATURDAY:
                dayToString = "Saturday";
                break;
            case  SUNDAY:
                dayToString = "Sunday";
                break;
                default:
                    System.out.println("Invalid day number.");
        }
        return dayToString;
    }
}
