/**
 * Created by GUANSA on 7/20/2017.
 */

public class FizzBuzz {
    String function(int num) {
        String result;
        if (num % 5 == 0) {
            if (num % 3 == 0)
                result = "FizzBuzz";
            else
                result = "Buzz";
        } else if (num % 3 == 0) {
            result = "Fizz";
        } else {
            result = num + "";
        }
        return result;
    }

}
