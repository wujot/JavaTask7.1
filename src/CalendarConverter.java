public class CalendarConverter {

    int monday = 1;
    int tuesday = 2;
    int wednesday = 3;
    int thursday = 4;
    int friday = 5;
    int saturday = 6;
    int sunday =7;

    String convertDayToString(int dayNumber) {
        String dayToString = null;

        switch (dayNumber) {
            case 1:
                dayToString = "Monday";
                break;
            case 2:
                dayToString = "Tuesday";
                break;
            case 3:
                dayToString = "Wednesday";
                break;
            case 4:
                dayToString = "Thursday";
                break;
            case 5:
                dayToString = "Friday";
                break;
            case 6:
                dayToString = "Saturday";
                break;
            case  7:
                dayToString = "Sunday";
                break;
                default:
                    System.out.println("Invalid day number.");
        }
        return dayToString;
    }
}
