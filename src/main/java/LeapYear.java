/**
 * Created by GUANSA on 7/20/2017.
 */
public class LeapYear {
    public boolean isLeapYear(int year) {
        boolean result = false;
        if (year % 100 == 0) {
            if (year % 400 == 0)
                result = true;
        } else if (year % 4 == 0) {
            result = true;
        } else {
            result = false;
        }
        return result;
    }
}
