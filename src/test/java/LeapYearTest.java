import org.junit.Test;
import static org.fest.assertions.api.Assertions.assertThat;

/**
 * Created by GUANSA on 7/20/2017.
 */
public class LeapYearTest {
    @Test
    public void should_return_true_given_typical_leap_year() throws Exception {
        //given
        LeapYear leapYear=new LeapYear();

        //when
        boolean result=leapYear.isLeapYear(1996);

        //then
        assertThat(result).isTrue();
    }

    @Test
    public void should_return_true_given_untypical_leap_year() throws Exception {
        //given
        LeapYear leapYear=new LeapYear();

        //when
        boolean result=leapYear.isLeapYear(2000);

        //then
        assertThat(result).isTrue();
    }

    @Test
    public void should_return_false_given_typical_common_year() throws Exception {
        //given
        LeapYear leapYear=new LeapYear();

        //when
        boolean result=leapYear.isLeapYear(1915);

        //then
        assertThat(result).isFalse();
    }
    @Test
    public void should_return_false_given_untypical_common_year() throws Exception {
        //given
        LeapYear leapYear=new LeapYear();

        //when
        boolean result=leapYear.isLeapYear(1900);

        //then
        assertThat(result).isFalse();
    }
}